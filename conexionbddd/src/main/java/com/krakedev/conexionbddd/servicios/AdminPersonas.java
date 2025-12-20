package com.krakedev.conexionbddd.servicios;

import com.krakedev.conexionbddd.conexion.Conexion;
import com.krakedev.conexionbddd.entidades.Persona;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AdminPersonas {
    
    public static boolean actualizar(Persona persona) {
        Connection conexion = null;
        PreparedStatement statement = null;
        String sql = "UPDATE personas SET nombre=?, apellido=?, edad=? WHERE cedula=?";
        
        try {
            conexion = Conexion.conectar();
            statement = conexion.prepareStatement(sql);
            statement.setString(1, persona.getNombre());
            statement.setString(2, persona.getApellido());
            statement.setInt(3, persona.getEdad());
            statement.setString(4, persona.getCedula());
            int filasActualizadas = statement.executeUpdate();
            
            if (filasActualizadas > 0) {
                System.out.println("✓ Persona actualizada exitosamente");
                return true;
            } else {
                System.out.println("⚠ No se encontró ninguna persona con esa cédula");
                return false;
            }
        } catch (SQLException e) {
            System.err.println("✗ Error al actualizar persona: " + e.getMessage());
            return false;
        } finally {
            try {
                if (statement != null) statement.close();
                if (conexion != null) Conexion.desconectar(conexion);
            } catch (SQLException e) {
                System.err.println("✗ Error al cerrar recursos: " + e.getMessage());
            }
        }
    }
    
    public static boolean eliminar(String cedula) {
        Connection conexion = null;
        PreparedStatement statement = null;
        String sql = "DELETE FROM personas WHERE cedula=?";
        
        try {
            conexion = Conexion.conectar();
            statement = conexion.prepareStatement(sql);
            statement.setString(1, cedula);
            int filasEliminadas = statement.executeUpdate();
            
            if (filasEliminadas > 0) {
                System.out.println("✓ Persona eliminada exitosamente");
                return true;
            } else {
                System.out.println("⚠ No se encontró ninguna persona con esa cédula");
                return false;
            }
        } catch (SQLException e) {
            System.err.println("✗ Error al eliminar persona: " + e.getMessage());
            return false;
        } finally {
            try {
                if (statement != null) statement.close();
                if (conexion != null) Conexion.desconectar(conexion);
            } catch (SQLException e) {
                System.err.println("✗ Error al cerrar recursos: " + e.getMessage());
            }
        }
    }
    
    public static boolean insertar(Persona persona) {
        Connection conexion = null;
        PreparedStatement statement = null;
        String sql = "INSERT INTO personas (cedula, nombre, apellido, edad) VALUES (?, ?, ?, ?)";
        
        try {
            conexion = Conexion.conectar();
            statement = conexion.prepareStatement(sql);
            statement.setString(1, persona.getCedula());
            statement.setString(2, persona.getNombre());
            statement.setString(3, persona.getApellido());
            statement.setInt(4, persona.getEdad());
            int filasInsertadas = statement.executeUpdate();
            
            if (filasInsertadas > 0) {
                System.out.println("✓ Persona insertada exitosamente");
                return true;
            } else {
                return false;
            }
        } catch (SQLException e) {
            System.err.println("✗ Error al insertar persona: " + e.getMessage());
            return false;
        } finally {
            try {
                if (statement != null) statement.close();
                if (conexion != null) Conexion.desconectar(conexion);
            } catch (SQLException e) {
                System.err.println("✗ Error al cerrar recursos: " + e.getMessage());
            }
        }
    }
}