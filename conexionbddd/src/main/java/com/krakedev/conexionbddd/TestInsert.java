package com.krakedev.conexionbddd;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TestInsert {

    public static void main(String[] args) {
        Connection connection=null;
        PreparedStatement ps=null;
        try {
            Class.forName("org.postgresql.Driver");
            connection=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","emilixipixi");
            System.out.println("Conexión exitosa");
            
            // INSERT EN PRODUCTOS
            ps=connection.prepareStatement("insert into productos(codigo, nombre, descripcion, precio, stock) values(?,?,?,?,?)");
            ps.setInt(1, 106);
            ps.setString(2, "Webcam");
            ps.setString(3, "HD 1080p con micrófono incorporado");
            ps.setBigDecimal(4, new BigDecimal("35.99"));
            ps.setInt(5, 25);
            ps.executeUpdate();
            System.out.println("Ejecuta Insert en PRODUCTOS");
            
            ps.close();
            
            // INSERT EN CUENTAS
            ps=connection.prepareStatement("insert into cuentas(numero_cuenta, cedula_propietario, fecha_creacion, saldo) values(?,?,?,?)");
            ps.setString(1, "50011");
            ps.setString(2, "12345");
            ps.setDate(3, java.sql.Date.valueOf("2024-12-19"));
            ps.setBigDecimal(4, new BigDecimal("1500.50"));
            ps.executeUpdate();
            System.out.println("Ejecuta Insert en CUENTAS");
            
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}