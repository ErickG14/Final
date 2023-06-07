package org.example.Vista;

import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame {
    private JPanel panel1;
    private JLabel lblid;
    private JLabel lblTraje;
    private JLabel lblAccesorioMochilero;
    private JLabel lblHerramientaDeRecoleccion;
    private JLabel lblAlaDelta;
    private JLabel lblGesto;
    private JLabel lblURL;
    private JTextField txtid;
    private JTextField txtTraje;
    private JTextField txtAccesorioMochilero;
    private JTextField txtHerramientaDeRecoleccion;
    private JTextField txtAlaDelta;
    private JTextField txtGesto;
    private JTextField txtURL;
    private JPanel panel2;
    private JPanel panel3;
    private JPanel panel4;
    private GridLayout layout;
    private JLabel espacio1;
    private JLabel espacio2;
    private JLabel espacio3;
    private JLabel espacio4;
    private JLabel espacio5;
    private JLabel espacio6;
    private JButton btnagregar;
    private JButton btncargar;
    private  JTable tblConjuntodeSkin;
    private JScrollPane scrollPane;
    public Ventana(String title) throws HeadlessException {
        super(title);
         this.setSize(1200,750);
         layout = new GridLayout(2,2);
         this.getContentPane().setLayout(layout);

         //PANEL 1
        panel1 = new JPanel();
        panel1.setBackground(new Color(25, 255, 255));
        panel1.setLayout(new FlowLayout());
        lblid = new JLabel("ID");
        txtid = new JTextField(5);
        txtid.setText("0");
        txtid.setEnabled(false);
        espacio1 = new JLabel("                                                                                                                                                                  ");
        lblTraje = new JLabel("Traje");
        txtTraje = new JTextField(20);
        espacio2 = new JLabel("                                                                                                          ");
        lblAccesorioMochilero = new JLabel("Accesorio Mochilero");
        txtAccesorioMochilero = new JTextField(20);
        espacio6 = new JLabel("                                                 ");
        lblHerramientaDeRecoleccion = new JLabel("Herramienta de recoleccion");
        txtHerramientaDeRecoleccion = new JTextField(20);
        espacio5  = new JLabel("                                                                                          ");
        lblAlaDelta = new JLabel("Ala Delta");
        txtAlaDelta = new JTextField(20);
        espacio3 = new JLabel("                                                                                                 ");
        lblGesto = new JLabel("Gesto");
        txtGesto = new JTextField(20);
        espacio4 = new JLabel("                                        ");
        lblURL = new JLabel("Imagen");
        txtURL = new JTextField(20);
        btnagregar =  new JButton("Agregar");




        panel1.add(lblid);
        panel1.add(txtid);
        panel1.add(espacio1);
        panel1.add(lblTraje);
        panel1.add(txtTraje);
        panel1.add(espacio2);
        panel1.add(lblAccesorioMochilero);
        panel1.add(txtAccesorioMochilero);
        panel1.add(espacio6);
        panel1.add(lblHerramientaDeRecoleccion);
        panel1.add(txtHerramientaDeRecoleccion);
        panel1.add(espacio5);
        panel1.add(lblAlaDelta);
        panel1.add(txtAlaDelta);
        panel1.add(espacio3);
        panel1.add(lblGesto);
        panel1.add(txtGesto);
        panel1.add(espacio4);
        panel1.add(lblURL);
        panel1.add(txtURL);
        panel1.add(btnagregar);
        this.getContentPane().add(panel1,0);

         //PANEL 2
        panel2 = new JPanel();
        panel2.setLayout(new FlowLayout());
        panel2.setBackground(new Color(220, 19, 132));
        btncargar = new JButton("Cargar");
        tblConjuntodeSkin = new JTable();
        scrollPane = new JScrollPane(tblConjuntodeSkin);


        panel2.add(btncargar);
        panel2.add(scrollPane);

        this.getContentPane().add(panel2,1);


         //PANEL 3
        panel3 = new JPanel();
        panel3.setBackground(new Color(90, 17, 206));
        panel3.setLayout(new FlowLayout());

        this.getContentPane().add(panel3,2);


         //PANEL 4
        panel4 = new JPanel();
        panel4.setBackground(new Color(157, 6, 6, 255));
        panel4.setLayout(new FlowLayout());

        this.getContentPane().add(panel4,3);








         this.setVisible(true);
         this.setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public JPanel getPanel1() {
        return panel1;
    }

    public void setPanel1(JPanel panel1) {
        this.panel1 = panel1;
    }

    public JLabel getLblid() {
        return lblid;
    }

    public void setLblid(JLabel lblid) {
        this.lblid = lblid;
    }

    public JLabel getLblTraje() {
        return lblTraje;
    }

    public void setLblTraje(JLabel lblTraje) {
        this.lblTraje = lblTraje;
    }

    public JLabel getLblAccesorioMochilero() {
        return lblAccesorioMochilero;
    }

    public void setLblAccesorioMochilero(JLabel lblAccesorioMochilero) {
        this.lblAccesorioMochilero = lblAccesorioMochilero;
    }

    public JLabel getLblHerramientaDeRecoleccion() {
        return lblHerramientaDeRecoleccion;
    }

    public void setLblHerramientaDeRecoleccion(JLabel lblHerramientaDeRecoleccion) {
        this.lblHerramientaDeRecoleccion = lblHerramientaDeRecoleccion;
    }

    public JLabel getLblAlaDelta() {
        return lblAlaDelta;
    }

    public void setLblAlaDelta(JLabel lblAlaDelta) {
        this.lblAlaDelta = lblAlaDelta;
    }

    public JLabel getLblGesto() {
        return lblGesto;
    }

    public void setLblGesto(JLabel lblGesto) {
        this.lblGesto = lblGesto;
    }

    public JLabel getLblURL() {
        return lblURL;
    }

    public void setLblURL(JLabel lblURL) {
        this.lblURL = lblURL;
    }

    public JTextField getTxtid() {
        return txtid;
    }

    public void setTxtid(JTextField txtid) {
        this.txtid = txtid;
    }

    public JTextField getTxtTraje() {
        return txtTraje;
    }

    public void setTxtTraje(JTextField txtTraje) {
        this.txtTraje = txtTraje;
    }

    public JTextField getTxtAccesorioMochilero() {
        return txtAccesorioMochilero;
    }

    public void setTxtAccesorioMochilero(JTextField txtAccesorioMochilero) {
        this.txtAccesorioMochilero = txtAccesorioMochilero;
    }

    public JTextField getTxtHerramientaDeRecoleccion() {
        return txtHerramientaDeRecoleccion;
    }

    public void setTxtHerramientaDeRecoleccion(JTextField txtHerramientaDeRecoleccion) {
        this.txtHerramientaDeRecoleccion = txtHerramientaDeRecoleccion;
    }

    public JTextField getTxtAlaDelta() {
        return txtAlaDelta;
    }

    public void setTxtAlaDelta(JTextField txtAlaDelta) {
        this.txtAlaDelta = txtAlaDelta;
    }

    public JTextField getTxtGesto() {
        return txtGesto;
    }

    public void setTxtGesto(JTextField txtGesto) {
        this.txtGesto = txtGesto;
    }

    public JTextField getTxtURL() {
        return txtURL;
    }

    public void setTxtURL(JTextField txtURL) {
        this.txtURL = txtURL;
    }

    public JPanel getPanel2() {
        return panel2;
    }

    public void setPanel2(JPanel panel2) {
        this.panel2 = panel2;
    }

    public JPanel getPanel3() {
        return panel3;
    }

    public void setPanel3(JPanel panel3) {
        this.panel3 = panel3;
    }

    public JPanel getPanel4() {
        return panel4;
    }

    public void setPanel4(JPanel panel4) {
        this.panel4 = panel4;
    }

    @Override
    public GridLayout getLayout() {
        return layout;
    }

    public void setLayout(GridLayout layout) {
        this.layout = layout;
    }

    public JLabel getEspacio1() {
        return espacio1;
    }

    public void setEspacio1(JLabel espacio1) {
        this.espacio1 = espacio1;
    }

    public JLabel getEspacio2() {
        return espacio2;
    }

    public void setEspacio2(JLabel espacio2) {
        this.espacio2 = espacio2;
    }

    public JLabel getEspacio3() {
        return espacio3;
    }

    public void setEspacio3(JLabel espacio3) {
        this.espacio3 = espacio3;
    }

    public JLabel getEspacio4() {
        return espacio4;
    }

    public void setEspacio4(JLabel espacio4) {
        this.espacio4 = espacio4;
    }

    public JLabel getEspacio5() {
        return espacio5;
    }

    public void setEspacio5(JLabel espacio5) {
        this.espacio5 = espacio5;
    }

    public JButton getBtnagregar() {
        return btnagregar;
    }

    public void setBtnagregar(JButton btnagregar) {
        this.btnagregar = btnagregar;
    }

    public JButton getBtncargar() {
        return btncargar;
    }

    public void setBtncargar(JButton btncargar) {
        this.btncargar = btncargar;
    }

    public JTable getTblConjuntodeSkin() {
        return tblConjuntodeSkin;
    }

    public void setTblConjuntodeSkin(JTable tblConjuntodeSkin) {
        this.tblConjuntodeSkin = tblConjuntodeSkin;
    }

    public JScrollPane getScrollPane() {
        return scrollPane;
    }

    public void setScrollPane(JScrollPane scrollPane) {
        this.scrollPane = scrollPane;
    }
    public void limpiar(){
        txtTraje.setText("");
        txtAccesorioMochilero.setText("");
        txtHerramientaDeRecoleccion.setText("");
        txtAlaDelta.setText("");
        txtGesto.setText("");
        txtURL.setText("");
    }

}
