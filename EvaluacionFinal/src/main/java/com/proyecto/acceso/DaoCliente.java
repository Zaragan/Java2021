package com.proyecto.acceso;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.proyecto.entidades.Cliente;

public class DaoCliente {
	private static final String JDBC_DRIVER = "org.sqlite.JDBC";
	private static final String DEPLOY = System.getProperty("wtp.deploy");
	private static final String URL = "jdbc:sqlite:"+DEPLOY+"\\EvaluacionFinal\\WEB-INF\\evaluacion.db";
	private static final String USUARIO_BDD = "";
	private static final String PASSWORD_BDD = "";

	private static final String SQL_SELECT = "SELECT * FROM clientes";
	private static final String SQL_SELECT_ID = SQL_SELECT + " WHERE id=?";
	private static final String SQL_INSERT = "INSERT INTO clientes (nombre, apellido, telefono, mail, saldo) VALUES (?, ?, ?, ?, ?)";
	private static final String SQL_UPDATE = "UPDATE clientes SET nombre=?, apellido=?, telefono=?, mail=?, saldo=? WHERE id=?";
	private static final String SQL_DELETE = "DELETE FROM clientes WHERE id=?";

	static {
		try {
			Class.forName(JDBC_DRIVER);
		} catch (ClassNotFoundException e) {
			throw new RuntimeException("No se ha encontrado la clase del driver JDBC " + JDBC_DRIVER);
		}
	}

	// Totalmente genérico. No hay que personalizar
	public static Connection obtenerConexion() {
		try {
			return DriverManager.getConnection(URL, USUARIO_BDD, PASSWORD_BDD);
		} catch (Exception e) {
			throw new RuntimeException("No se ha podido conectar a la base de datos", e);
		}
	}

	public static ArrayList<Cliente> obtenerTodos() {
		try (Connection con = obtenerConexion();
				PreparedStatement ps = con.prepareStatement(SQL_SELECT);
				ResultSet rs = ps.executeQuery()) {

			// Debemos cambiar Usuario por el que represente nuestros datos
			ArrayList<Cliente> clientes = new ArrayList<>();

			while (rs.next()) {
				// Usar el constructor más grande de nuestra clase para capturar todos los
				// campos
				// de la tabla en los propios campos del objeto
				clientes.add(new Cliente(rs.getString("nombre"), rs.getString("apellido"), rs.getInt("id"), rs.getString("telefono"), rs.getString("mail"), rs.getDouble("saldo")));
			}

			return clientes;
		} catch (SQLException e) {
			throw new RuntimeException("Ha habido un error al obtener los registros", e);
		}
	}
	
	public static Cliente obtenerPorId(Integer id) {
		try (Connection con = obtenerConexion(); PreparedStatement ps = con.prepareStatement(SQL_SELECT_ID);) {
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			Cliente cliente = null;
			if (rs.next()) {
				cliente = new Cliente(rs.getString("nombre"), rs.getString("apellido"), rs.getInt("id"), rs.getString("telefono"), rs.getString("mail"), rs.getDouble("saldo"));
			}
			return cliente;
		} catch (SQLException e) {
			throw new RuntimeException("Ha habido un error al obtener el registro cuyo id es " + id, e);
		}
	}
	public static void insertar(Cliente cliente) {
		try (Connection con = obtenerConexion(); PreparedStatement ps = con.prepareStatement(SQL_INSERT);) {
			ps.setString(1, cliente.getNombre());
			ps.setString(2, cliente.getApellido());
			ps.setString(3, cliente.getTelefono());
			ps.setString(4, cliente.getMail());
			ps.setDouble(5, cliente.getSaldo());

			ps.executeUpdate();
		} catch (SQLException e) {
			throw new RuntimeException("Ha habido un error al insertar el registro", e);
		}
	}
	
	public static void modificar(String nombre, String apellido, String telefono, String mail, Double saldo, Integer id) {
		try (Connection con = obtenerConexion(); PreparedStatement ps = con.prepareStatement(SQL_UPDATE);) {

			ps.setString(1, nombre);
			ps.setString(2, apellido);
			ps.setString(3, telefono);
			ps.setString(4, mail);
			ps.setDouble(5, saldo);
			ps.setInt(6, id);

			ps.executeUpdate();
		} catch (SQLException e) {
			throw new RuntimeException("Ha habido un error al modificar el registro", e);
		}
	}
	
	public static void eliminar(Integer id) {
		try (Connection con = obtenerConexion(); PreparedStatement ps = con.prepareStatement(SQL_DELETE);) {
			ps.setInt(1, id);

			ps.executeUpdate();
		} catch (SQLException e) {
			throw new RuntimeException("Ha habido un error al modificar el registro", e);
		}
	}
}
