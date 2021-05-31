package com.proyecto.acceso;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.proyecto.entidades.Usuario;

public class DaoUsuario {
	// Datos para personalizar qué base de datos vamos a utilizar
		private static final String JDBC_DRIVER = "org.sqlite.JDBC"; // Driver de la base de datos (lo indica cada fabricante)
		private static final String URL = "jdbc:sqlite:C:\\Users\\curso\\Desktop\\.database\\ProyectoSupermercado.db";
//		private static final String URL = "jdbc:sqlite:B:\\Java 2021\\.database\\ProyectoSupermercado.db";
		private static final String USUARIO_BDD = ""; // Usuario de la base de datos si lo necesita
		private static final String PASSWORD_BDD = "";// Contraseña de la base de datos si lo necesita

		// Consultas que vamos a lanzar a la base de datos
		// Personalizar tablas y campos
		private static final String SQL_SELECT = "SELECT uid, email, password, nombre, rol FROM usuarios";
		private static final String SQL_SELECT_EMAILS = "SELECT email FROM usuarios";
		private static final String SQL_SELECT_ID = SQL_SELECT + " WHERE uid=?";
		private static final String SQL_SELECT_EMAIL = SQL_SELECT + " WHERE email=?";
		private static final String SQL_INSERT = "INSERT INTO usuarios (email, password, nombre, rol) VALUES (?, ?, ?, ?)";
		private static final String SQL_UPDATE = "UPDATE usuarios SET email=?, password=? WHERE uid=?";
		private static final String SQL_DELETE = "DELETE FROM usuarios WHERE uid=?";

		// Bloque que a veces es necesario si después de tener la cadena de conexión
		// correcta (URL)
		// y referenciado el driver de JDBC, sigue dando "unsuitable driver"
		// Totalmente genérico. No hay que personalizar
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

		// Debemos cambiar Usuario por el que represente nuestros datos
		public static ArrayList<Usuario> obtenerTodos() {
			try (Connection con = obtenerConexion();
					PreparedStatement ps = con.prepareStatement(SQL_SELECT);
					ResultSet rs = ps.executeQuery()) {

				// Debemos cambiar Usuario por el que represente nuestros datos
				ArrayList<Usuario> usuarios = new ArrayList<>();

				while (rs.next()) {
					// Usar el constructor más grande de nuestra clase para capturar todos los
					// campos
					// de la tabla en los propios campos del objeto
					usuarios.add(new Usuario(rs.getString("email"), rs.getString("password"), rs.getString("nombre"), rs.getInt("rol")));
				}

				return usuarios;
			} catch (SQLException e) {
				throw new RuntimeException("Ha habido un error al obtener los registros", e);
			}
		}
		
		public static ArrayList<String> obtenerEmails() {
			try(Connection con = obtenerConexion(); PreparedStatement ps = con.prepareStatement(SQL_SELECT_EMAILS);) {
				ArrayList<String> usuarios = new ArrayList<>();

				ResultSet rs = ps.executeQuery();

				if (rs.next()) {
					// Usar el constructor más grande de nuestra clase para capturar todos los
					// campos
					// de la tabla en los propios campos del objeto
					usuarios.add(new String(rs.getString("email")));
				}
				return usuarios;
			} catch (SQLException e) {
				throw new RuntimeException("Ha habido un error", e);
			}
		}

		// Debemos cambiar Usuario por el que represente nuestros datos
		public static Usuario obtenerPorId(Integer id) {
			try (Connection con = obtenerConexion(); PreparedStatement ps = con.prepareStatement(SQL_SELECT_ID);) {

				ps.setInt(1, id);

				ResultSet rs = ps.executeQuery();

				Usuario usuario = null;

				if (rs.next()) {
					// Usar el constructor más grande de nuestra clase para capturar todos los
					// campos
					// de la tabla en los propios campos del objeto
					usuario = new Usuario(rs.getString("email"), rs.getString("password"), rs.getString("nombre"), rs.getInt("rol"));
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
					usuario = new Usuario(rs.getString("email"), rs.getString("password"), rs.getString("nombre"), rs.getInt("rol"));
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
				ps.setString(3, usuario.getNombre());
				ps.setString(4, "1");
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
		}
}
