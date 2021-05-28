package com.proyecto.acceso;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.proyecto.entidades.Producto;
@SuppressWarnings("unused")
public class DaoProducto {
	// Datos para personalizar qué base de datos vamos a utilizar
	private static final String JDBC_DRIVER = "org.sqlite.JDBC"; // Driver de la base de datos (lo indica cada fabricante)
//	private static final String URL = "jdbc:sqlite:C:\\Users\\curso\\Desktop\\.database\\ProyectoSupermercado.db";
	private static final String URL = "jdbc:sqlite:B:\\Java 2021\\.database\\ProyectoSupermercado.db";
	private static final String USUARIO_BDD = ""; // Usuario de la base de datos si lo necesita
	private static final String PASSWORD_BDD = "";// Contraseña de la base de datos si lo necesita

	private static final String SQL_SELECT = "SELECT pid, pnombre, pprecio, pcantidad FROM productos";
	private static final String SQL_SELECT_ID = SQL_SELECT + " WHERE pid=?";
	private static final String SQL_INSERT = "INSERT INTO productos (pnombre, pprecio, pcantidad) VALUES (?, ?, ?)";
	private static final String SQL_UPDATE = "UPDATE productos SET pnombre=?, pprecio=?, pcantidad=? WHERE pid=?";
	private static final String SQL_DELETE = "DELETE FROM productos WHERE pid=?";

	static {
		try {
			Class.forName(JDBC_DRIVER);
		} catch (ClassNotFoundException e) {
			throw new RuntimeException("No se ha encontrado la clase del driver JDBC " + JDBC_DRIVER);
		}
	}

	private static Connection obtenerConexion() {
		try {
			return DriverManager.getConnection(URL, USUARIO_BDD, PASSWORD_BDD);
		} catch (Exception e) {
			throw new RuntimeException("No se ha podido conectar a la base de datos", e);
		}
	}
	
	public static ArrayList<Producto> obtenerTodos(){
		try (Connection con = obtenerConexion(); PreparedStatement ps = con.prepareStatement(SQL_SELECT); ResultSet rs = ps.executeQuery()) {
			ArrayList<Producto> productos = new ArrayList<>();
			
			while (rs.next()) {
				productos.add(new Producto(rs.getInt("pid"), rs.getString("pnombre"), rs.getInt("pprecio"), rs.getInt("pcantidad")));
			}
			return productos;
		} catch (SQLException e) {
			throw new RuntimeException("Ha habido un error al obtener los registros", e);
		}
	}
}
