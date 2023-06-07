package org.example.Persistencia;

import org.example.Modelo.Conjunto;
import org.example.Vista.Ventana;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class DemoConjunto {

    private Ventana view;

    public DemoConjunto() {
    }

    public void insertarPreparedStatement(){
        String Traje = "SPIDER-MAN(MILES MORALES)";
        String AccesorioMochilero = "PORTAL DEL MULTIVESO";
        String HerramientaDeRecoleccion = "MAZO DE SPIDER-HAM";
        String AlaDelta = "ALAS RESPLANDECIENTES";
        String Gesto = "APLASTALOS";
        String URL = "IMAGEN";
        String sqleInsert = "INSERT INTO Conjunto(Traje,Accesorio,Herramienta,Ala,Gesto,URL) VALUES (?, ?, ?, ?, ?, ?)";

        try {
            PreparedStatement pstm = ConexionSingleton.getInstance("Base de Datos.db").getConnection().prepareStatement(sqleInsert);
            pstm.setString(1,Traje);
            pstm.setString(2,AccesorioMochilero);
            pstm.setString(3,HerramientaDeRecoleccion);
            pstm.setString(4,AlaDelta);
            pstm.setString(5,Gesto);
            pstm.setString(6,URL);
            int rowCount = pstm.executeUpdate();
            System.out.println("Se insertaron " + rowCount + " registros");
        }catch (SQLException sqle){
            System.out.println("Error Prepared Statement" + sqle.getMessage());

        }


    }

    public boolean insertarConjunto(Conjunto conjunto){

        String sqlInsert = "INSERT INTO Conjunto(Traje,Accesorio,Herramienta,Ala,Gesto,URL) VALUES (?, ?, ?, ?, ?, ?)";
        int rowCount = 0;
        try {
            PreparedStatement pstm = ConexionSingleton.getInstance("Base de Datos.db").getConnection().prepareStatement(sqlInsert);
            pstm.setString(1,conjunto.getTraje());
            pstm.setString(2,conjunto.getAccesorioMochilero());
            pstm.setString(3,conjunto.getHerramientaDeRecoleccion());
            pstm.setString(4,conjunto.getAlaDelta());
            pstm.setString(5,conjunto.getGesto());
            pstm.setString(6,conjunto.getURL());
             rowCount = pstm.executeUpdate();
            System.out.println("Se insertaron " + rowCount + " registros");
        }catch (SQLException sqle){
            System.out.println("Error Prepared Statement" + sqle.getMessage());

        }

return rowCount > 0 ;
    }

    public Conjunto buscarconjuntoporid (int id){
        String sql = "SELECT * FROM Conjunto WHERE ID = ?;";
        Conjunto conjunto = null;
        try {
            PreparedStatement pstm = ConexionSingleton.getInstance("Base de Datos.db").getConnection().prepareStatement(sql);
            pstm.setInt(1, id);
            ResultSet rst = pstm.executeQuery();
            if(rst.next()){
                conjunto = new Conjunto(rst.getInt(1),rst.getString(2),rst.getString(3),rst.getString(4),rst.getString(5),rst.getString(6),rst.getString(7));
            }
        } catch (SQLException sqle){
            System.out.println("Error al buscar");
        }
        return conjunto;
    }

    public ArrayList<Conjunto> obtenertodos(){
        String sql = "SELECT * FROM Conjunto";
        ArrayList<Conjunto> resultado = new ArrayList<>();

        try {
            Statement stm = ConexionSingleton.getInstance("Base de Datos.db").getConnection().createStatement();
            ResultSet rst = stm.executeQuery(sql);
            while (rst.next()){
                resultado.add(new Conjunto(rst.getInt(1),rst.getString(2),rst.getString(3),rst.getString(4),rst.getString(5),rst.getString(6),rst.getString(7)));
            }
        }catch (SQLException sqle){
            System.out.println(sqle.getMessage());
        }

        return resultado;
    }


}
