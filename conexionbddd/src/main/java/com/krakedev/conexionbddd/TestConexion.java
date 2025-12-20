package com.krakedev.conexionbddd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TestConexion {

	public static void main(String[] args) {
		Connection connection=null;
		PreparedStatement ps=null;
		try {
			Class.forName("org.postgresql.Driver");
			connection=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","emilixipixi");
			System.out.println("Conexion Exitosa");
			ps=connection.prepareStatement("insert into videojuegos(codigo, nombre, descripcion, valoracion)"
					+ "values(?,?,?,?)");
			ps.setInt(1, 88901);
			ps.setString(2, "Cyberpunk 2077");
			ps.setString(3, "Juego de rol y acción en un mundo futurista abierto con una narrativa profunda.");
			ps.setInt(4, 8);
		
			
			ps.executeUpdate();
			System.out.println("ejecuta insert");
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

}
 