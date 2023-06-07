package org.example;

import org.example.Controlador.ControladorConjunto;
import org.example.Modelo.Conjunto;
import org.example.Persistencia.ConjuntoDAO;
import org.example.Persistencia.DemoConjunto;
import org.example.Vista.Ventana;

import javax.swing.table.TableRowSorter;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        Ventana ventana = new Ventana("prueba");
        ControladorConjunto cotroller = new ControladorConjunto(ventana);


    }
}
