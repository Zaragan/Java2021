package databases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Aprueba {

	public static void main(String[] args) throws SQLException {
		final String url = "jdbc:sqlite:Aprueba.db";
		final String usuario = "";
		final String password = "";

		// Consulta de todos los datos de una tabla
		final String sqlSelect = "SELECT uid, nombre FROM clientes";

		Connection con = DriverManager.getConnection(url, usuario, password);

		Statement st = con.createStatement();

		ResultSet rs = st.executeQuery(sqlSelect);

		while (rs.next()) {
			System.out.printf("%s\t%s\n", rs.getString("uid"), rs.getString("nombre"));
		}

		// Añadir un registro a una tabla
		final String sqlInsert = "INSERT INTO clientes (nombre) VALUES ('Otro nombre');";

		System.out.println(st.executeUpdate(sqlInsert));

		// Mostrar el registro añadido
		final String sqlSelectId = "SELECT uid, nombre FROM clientes WHERE uid=1";

		rs = st.executeQuery(sqlSelectId);

		if (rs.next()) {
			System.out.printf("%s\t%s\n", rs.getString("uid"), rs.getString("nombre"));
		}

		// Modificar un registro de una tabla
		final String sqlUpdate = "UPDATE clientes SET nombre='Cambiado' WHERE uid=2";

		System.out.println(st.executeUpdate(sqlUpdate));

		// Mostrar la modificación
		rs = st.executeQuery(sqlSelectId);

		if (rs.next()) {
			System.out.printf("%s\t%s\n", rs.getString("uid"), rs.getString("nombre"));
		}

		final String sqlDelete = "DELETE FROM clientes WHERE uid=2";

		System.out.println(st.executeUpdate(sqlDelete));

		// Mostrar la modificación
		rs = st.executeQuery(sqlSelectId);

		if (rs.next()) {
			System.out.printf("%s\t%s\n", rs.getString("uid"), rs.getString("nombre"));
		} else {
			System.out.println("No se ha encontrado ningún registro con el AlbumId = 500");
		}

		con.close();
	}
	
}
