package org.example;

import java.sql.*;

import org.sqlite.JDBC;

public class ConexionSQL {
    public static void main(String[] args) {
        String DB_URL = "jdbc:sqlite:Base de Datos.db";
        Connection conexion = null;


        try {
            Class.forName("org.sqlite.JDBC");
            conexion = DriverManager.getConnection(DB_URL);
            Statement stm = conexion.createStatement();
             ResultSet rst = stm.executeQuery("SELECT * FROM Conjunto;");
             while (rst.next()){
                 System.out.println(rst.getString(1)+ " " + rst.getString(2) + " ," + rst.getString(3)+ " ,"+ rst.getString(4));
             }
             conexion.close();
        }catch (ClassNotFoundException cne){
            cne.printStackTrace();
        }catch (SQLException sqle){
            sqle.printStackTrace();
        }
    }
}
