package org.example.Controlador;

import org.example.Modelo.Conjunto;
import org.example.Modelo.ModeloTablaConjunto;
import org.example.Vista.Ventana;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ControladorConjunto extends MouseAdapter {

    private Ventana view;
    private ModeloTablaConjunto modelo;

    public ControladorConjunto (Ventana view){
        this.view = view;
        modelo = new ModeloTablaConjunto();
        this.view.getTblConjuntodeSkin().setModel(modelo);
        this.view.getBtncargar().addMouseListener(this);
        this.view.getBtnagregar().addMouseListener(this);

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == this.view.getBtncargar()){
            modelo = new ModeloTablaConjunto();
            modelo.cargarDatos();
            this.view.getTblConjuntodeSkin().setModel(modelo);
            this.view.getTblConjuntodeSkin().updateUI();
        }


        if (e.getSource() == this.view.getBtnagregar()){
            Conjunto conjunto = new Conjunto();
            conjunto.setId(0);
            conjunto.setTraje(this.view.getTxtTraje().getText());
            conjunto.setAccesorioMochilero(this.view.getTxtAccesorioMochilero().getText());
            conjunto.setHerramientaDeRecoleccion(this.view.getTxtHerramientaDeRecoleccion().getText());
            conjunto.setAlaDelta(this.view.getTxtAlaDelta().getText());
            conjunto.setGesto(this.view.getTxtGesto().getText());
            conjunto.setURL(this.view.getTxtURL().getText());

            if (modelo.agragarConjunto(conjunto)){
                JOptionPane.showMessageDialog(view,"SE AGREGO CORRECTAMENTE","AVISO",JOptionPane.INFORMATION_MESSAGE);
                this.view.getTblConjuntodeSkin().updateUI();
            }else {
                JOptionPane.showMessageDialog(view,"NO SE AGREGO A LA BASE DE DATOS","Error al insertar",JOptionPane.ERROR_MESSAGE);
            }

            this.view.limpiar();
        }

    }
}
