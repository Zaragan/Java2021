package supermercado.accesodatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DaoUsuario {
	private static final String URL = "jdbc:sqlite:supermercado.sqlite3";
	private static final String USUARIO_BDD = "";
	private static final String PASSWORD_BDD = "";
	private static final String SQL_SELECT = "SELECT id, nombre, apellidos FROM clientes";
	private static final String SQL_SELECT_ID = SQL_SELECT + " WHERE id = ?";
	private static final String SQL_INSERT = "INSERT INTO clientes (nombre, apellidos) VALUES (?,?)";
	private static final String SQL_UPDATE = "UPDATE clientes SET nombre = ?, apellidos = ? WHERE id = ?";
	private static final String SQL_DELETE = "DELETE FROM clientes WHERE id = ?";

	private static Connection con;
	
	private static void abrirConexion() {
		try {
			con = DriverManager.getConnection(URL,USUARIO_BDD,PASSWORD_BDD);
		} catch (SQLException e) {
			throw new AccesoDatosException("No se ha podido conectar a la bd.", e);
		}
	}
	
	private static void cerrarConexion() {
		if (con != null) {
			try {
				con.close();
			} catch (SQLException e) {
				throw new AccesoDatosException("No se ha podido cerrar la conexion", e);
			}
		}
	}
}
