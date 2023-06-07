package org.example.Persistencia;

import org.example.Modelo.Conjunto;
import org.example.Vista.Ventana;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ConjuntoDAO implements InterfazDAO{

    private Ventana view;

    public ConjuntoDAO() {
    }

    @Override
    public boolean insertar(Object obj) throws SQLException {
        String sqleInsert = "INSERT INTO Conjunto(Traje,Accesorio,Herramienta,Ala,Gesto,URL) VALUES (?, ?, ?, ?, ?, ?)";
        int rowCount = 0;
        PreparedStatement pstm = ConexionSingleton.getInstance("Base de Datos.db").getConnection().prepareStatement(sqleInsert);
        pstm.setString(1,((Conjunto) obj).getTraje());
        pstm.setString(2,((Conjunto)obj).getAccesorioMochilero());
        pstm.setString(3,((Conjunto)obj).getHerramientaDeRecoleccion());
        pstm.setString(4,((Conjunto)obj).getAlaDelta());
        pstm.setString(5,((Conjunto)obj).getGesto());
        pstm.setString(6,((Conjunto)obj).getURL());
        rowCount = pstm.executeUpdate();
        return false;
    }

    @Override
    public boolean update(Object obj) throws SQLException {
        String sqlUpdate = "UPDATE Conjunto SET Traje = ? , Accesorio = ?, Herramienta = ?, Ala = ?, Gesto = ?, URL = ? WHERE ID = ? ; ";
        int rowCount = 0;
        PreparedStatement pstm = ConexionSingleton.getInstance("Base de Datos.db").getConnection().prepareStatement(sqlUpdate);
        pstm.setString(1,((Conjunto) obj).getTraje());
        pstm.setString(2,((Conjunto)obj).getAccesorioMochilero());
        pstm.setString(3,((Conjunto)obj).getHerramientaDeRecoleccion());
        pstm.setString(4,((Conjunto)obj).getAlaDelta());
        pstm.setString(5,((Conjunto)obj).getGesto());
        pstm.setString(6,((Conjunto)obj).getURL());
        pstm.setInt(7,((Conjunto)obj).getId());
        rowCount = pstm.executeUpdate();
        return  rowCount > 0;
    }

    @Override
    public boolean delete(String id) throws SQLException {
        String sqlDelete = "DELETE FROM Conjunto WHERE ID = ?;";
        int rowCount = 0;
        PreparedStatement pstm = ConexionSingleton.getInstance("Base de Datos.db").getConnection().prepareStatement(sqlDelete);
        pstm.setInt(1,Integer.parseInt(id));
        rowCount = pstm.executeUpdate();

        return rowCount > 0;
    }


    @Override
    public ArrayList obtenerTodo() throws SQLException {
        String sql = "SELECT * FROM Conjunto";
        ArrayList<Conjunto> resultado = new ArrayList<>();


            Statement stm = ConexionSingleton.getInstance("Base de Datos.db").getConnection().createStatement();
            ResultSet rst = stm.executeQuery(sql);
            while (rst.next()){
                resultado.add(new Conjunto(rst.getInt(1),rst.getString(2),rst.getString(3),rst.getString(4),rst.getString(5),rst.getString(6),rst.getString(7)));
            }


        return resultado;
    }

    @Override
    public Object buscarporid(String id) throws SQLException {
        String sql = "SELECT * FROM Conjunto WHERE ID = ?;";
        Conjunto conjunto = null;

            PreparedStatement pstm = ConexionSingleton.getInstance("Base de Datos.db").getConnection().prepareStatement(sql);
            pstm.setInt(1, Integer.parseInt(id));
            ResultSet rst = pstm.executeQuery();
            if(rst.next()){
                conjunto = new Conjunto(rst.getInt(1),rst.getString(2),rst.getString(3),rst.getString(4),rst.getString(5),rst.getString(6),rst.getString(7));
                return conjunto;
            }

        return null;
    }
}
