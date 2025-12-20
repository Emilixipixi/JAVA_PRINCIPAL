package com.krakedev.conexionbddd.servicios;

import com.krakedev.conexionbddd.conexion.Conexion;
import com.krakedev.conexionbddd.entidades.Persona;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class AdminPersonas {
    
    public static boolean actualizar(Persona persona) {
        Connection conexion = null;
        PreparedStatement statement = null;
        String sql = "UPDATE personas SET nombre=?, apellido=? WHERE cedula=?";
        
        try {
            conexion = Conexion.conectar();
            statement = conexion.prepareStatement(sql);
            statement.setString(1, persona.getNombre());
            statement.setString(2, persona.getApellido());
            statement.setString(3, persona.getCedula());
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
        String sql = "INSERT INTO personas (cedula, nombre, apellido) VALUES (?, ?, ?)";
        
        try {
            conexion = Conexion.conectar();
            statement = conexion.prepareStatement(sql);
            statement.setString(1, persona.getCedula());
            statement.setString(2, persona.getNombre());
            statement.setString(3, persona.getApellido());
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
    
    public static Persona buscarPorCedula(String cedula) {
        Connection conexion = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        String sql = "SELECT cedula, nombre, apellido FROM personas WHERE cedula=?";
        
        try {
            conexion = Conexion.conectar();
            statement = conexion.prepareStatement(sql);
            statement.setString(1, cedula);
            resultSet = statement.executeQuery();
            
            if (resultSet.next()) {
                String cedulaDB = resultSet.getString("cedula");
                String nombreDB = resultSet.getString("nombre");
                String apellidoDB = resultSet.getString("apellido");
                
                Persona persona = new Persona(cedulaDB, nombreDB, apellidoDB);
                System.out.println("✓ Persona encontrada");
                return persona;
            } else {
                System.out.println("⚠ No se encontró ninguna persona con esa cédula");
                return null;
            }
        } catch (SQLException e) {
            System.err.println("✗ Error al buscar persona: " + e.getMessage());
            return null;
        } finally {
            try {
                if (resultSet != null) resultSet.close();
                if (statement != null) statement.close();
                if (conexion != null) Conexion.desconectar(conexion);
            } catch (SQLException e) {
                System.err.println("✗ Error al cerrar recursos: " + e.getMessage());
            }
        }
    }
    
    public static ArrayList<Persona> obtenerTodos() {
        Connection conexion = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        ArrayList<Persona> personas = new ArrayList<Persona>();
        String sql = "SELECT cedula, nombre, apellido FROM personas";
        
        try {
            conexion = Conexion.conectar();
            statement = conexion.prepareStatement(sql);
            resultSet = statement.executeQuery();
            
            while (resultSet.next()) {
                String cedula = resultSet.getString("cedula");
                String nombre = resultSet.getString("nombre");
                String apellido = resultSet.getString("apellido");
                
                Persona persona = new Persona(cedula, nombre, apellido);
                personas.add(persona);
            }
            
            System.out.println("✓ Se encontraron " + personas.size() + " persona(s)");
            return personas;
            
        } catch (SQLException e) {
            System.err.println("✗ Error al obtener personas: " + e.getMessage());
            return personas;
        } finally {
            try {
                if (resultSet != null) resultSet.close();
                if (statement != null) statement.close();
                if (conexion != null) Conexion.desconectar(conexion);
            } catch (SQLException e) {
                System.err.println("✗ Error al cerrar recursos: " + e.getMessage());
            }
        }
    }
}