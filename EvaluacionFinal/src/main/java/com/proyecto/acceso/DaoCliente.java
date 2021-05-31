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
	// ACUERDATE DE CAMBIAR LA URL ANTES DE ENVIAR EL PROYECTO!!!!!!!!!!!!!!!
	private static final String URL = "jdbc:sqlite:C:\\Users\\curso\\Desktop\\Oracle Workspace\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp0\\wtpwebapps\\EvaluacionFinal\\WEB-INF\\evaluacion.db";
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
	private static Connection obtenerConexion() {
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
	
	/*
	public static Usuario obtenerPorId(Integer id) {
		try (Connection con = obtenerConexion(); PreparedStatement ps = con.prepareStatement(SQL_SELECT_ID);) {

			ps.setInt(1, id);

			ResultSet rs = ps.executeQuery();

			Usuario usuario = null;

			if (rs.next()) {
				// Usar el constructor más grande de nuestra clase para capturar todos los
				// campos
				// de la tabla en los propios campos del objeto
				usuario = new Usuario(rs.getString("email"), rs.getString("password"));
			}

			return usuario;
		} catch (SQLException e) {
			throw new RuntimeException("Ha habido un error al obtener el registro cuyo id es " + id, e);
		}
	}

	public static Usuario obtenerPorEmail(String email) {
		try (Connection con = obtenerConexion(); PreparedStatement ps = con.prepareStatement(SQL_SELECT_EMAIL);) {

			ps.setString(1, email);

			ResultSet rs = ps.executeQuery();

			Usuario usuario = null;

			if (rs.next()) {
				// Usar el constructor más grande de nuestra clase para capturar todos los
				// campos
				// de la tabla en los propios campos del objeto
				usuario = new Usuario(rs.getString("email"), rs.getString("password"));
			}

			return usuario;
		} catch (SQLException e) {
			throw new RuntimeException("Ha habido un error al obtener el registro cuyo email es " + email, e);
		}
	}

	// Debemos cambiar Usuario por el que represente nuestros datos
	public static void insertar(Usuario usuario) {
		try (Connection con = obtenerConexion(); PreparedStatement ps = con.prepareStatement(SQL_INSERT);) {
			ps.setString(1, usuario.getEmail());
			ps.setString(2, usuario.getPassword());

			ps.executeUpdate();
		} catch (SQLException e) {
			throw new RuntimeException("Ha habido un error al insertar el registro", e);
		}
	}

	// Debemos cambiar Usuario por el que represente nuestros datos
	public static void modificar(Usuario usuario) {
		try (Connection con = obtenerConexion(); PreparedStatement ps = con.prepareStatement(SQL_UPDATE);) {

			ps.setString(1, usuario.getEmail());
			ps.setString(2, usuario.getPassword());
			ps.setInt(5, usuario.getId());

			ps.executeUpdate();
		} catch (SQLException e) {
			throw new RuntimeException("Ha habido un error al modificar el registro", e);
		}
	}

	// Debemos cambiar Usuario por el que represente nuestros datos
	public static void borrar(Integer id) {
		try (Connection con = obtenerConexion(); PreparedStatement ps = con.prepareStatement(SQL_DELETE);) {

			ps.setInt(1, id);

			ps.executeUpdate();
		} catch (SQLException e) {
			throw new RuntimeException("Ha habido un error al modificar el registro", e);
		}
	}*/
}
