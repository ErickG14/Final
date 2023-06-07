package org.example.Modelo;

import org.example.Persistencia.ConjuntoDAO;

import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import java.sql.SQLException;
import java.util.ArrayList;

public class ModeloTablaConjunto implements TableModel {

    public static final int COLUMNS = 7;
    private ArrayList<Conjunto> datos;
    private ConjuntoDAO condao;

    public ModeloTablaConjunto() {
        condao = new ConjuntoDAO();
        datos = new ArrayList<>();
    }

    public ModeloTablaConjunto(ArrayList<Conjunto> datos) {
        this.datos = datos;
        condao = new ConjuntoDAO();
    }


    @Override
    public int getRowCount() {
        return datos.size();
    }

    @Override
    public int getColumnCount() {
        return COLUMNS;
    }

    @Override
    public String getColumnName(int rowIndex) {
        switch (rowIndex){
            case 0:
                return "ID";
            case 1:
                return "Traje";
            case 2:
                return "Accesorio Mochilero";
            case 3:
                return "Herramienta de Recoleccion ";
            case 4:
                return "Ala Delta";
            case 5:
                return "Gesto";
            case 6:
                return "URL";
        }
        return null;
    }

    @Override
    public Class<?> getColumnClass(int rowIndex) {
        switch (rowIndex){
            case 0:
                return Integer.class;
            case 1:
                return String.class;
            case 2:
                return String.class;
            case 3:
                return String.class;
            case 4:
                return String.class;
            case 5:
                return String.class;
            case 6:
                return String.class;

        }
        return null;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return true;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Conjunto tmp = datos.get(rowIndex);
        switch (columnIndex){
            case 0:
                return tmp.getId();
            case 1:
                return tmp.getTraje();
            case 2:
                return tmp.getAccesorioMochilero();
            case 3:
                return tmp.getHerramientaDeRecoleccion();
            case 4:
                return tmp.getAlaDelta();
            case 5:
                return tmp.getGesto();
            case 6:
                return tmp.getURL();

        }

        return null;
    }

    @Override
    public void setValueAt(Object o, int rowIndex, int columnIndex) {
        switch (columnIndex){
            case 0:
                //datos.get(rowIndex).setId(0);
                break;
            case 1:
                datos.get(rowIndex).setTraje((String) o);
            case 2:
                datos.get(rowIndex).setAccesorioMochilero((String) o);
            case 3:
                datos.get(rowIndex).setHerramientaDeRecoleccion((String) o);
            case 4:
                datos.get(rowIndex).setAlaDelta((String) o);
            case 5:
                datos.get(rowIndex).setGesto((String) o);
            case 6:
                datos.get(rowIndex).setURL((String) o);
                break;
            default:
                System.out.println("No se modifica nada");
        }

    }

    @Override
    public void addTableModelListener(TableModelListener l) {

    }

    @Override
    public void removeTableModelListener(TableModelListener l) {


    }

    public void cargarDatos(){
        try {
            datos = condao.obtenerTodo();
        }catch (SQLException sqle){
            System.out.println(sqle.getMessage());
        }
    }

    public boolean agragarConjunto (Conjunto conjunto){

        boolean resultado = false;
        try {
            if (condao.insertar(conjunto)){
                datos.add(conjunto);
                resultado = true;

            }else {
                resultado = false;
            }

        }catch (SQLException sqle){
            System.out.println(sqle.getMessage());
        }
        return resultado;
    }

}
