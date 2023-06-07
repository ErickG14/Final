package org.example.Modelo;

public class Conjunto {
    private int id;
    private  String Traje;
    private String AccesorioMochilero ;
    private String HerramientaDeRecoleccion;
    private String AlaDelta;
    private String Gesto;
    private String URL;

    public Conjunto() {
    }

    public Conjunto(int id, String traje, String accesorioMochilero, String herramientaDeRecoleccion, String alaDelta, String gesto, String URL) {
        this.id = id;
        Traje = traje;
        AccesorioMochilero = accesorioMochilero;
        HerramientaDeRecoleccion = herramientaDeRecoleccion;
        AlaDelta = alaDelta;
        Gesto = gesto;
        this.URL = URL;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTraje() {
        return Traje;
    }

    public void setTraje(String traje) {
        Traje = traje;
    }

    public String getAccesorioMochilero() {
        return AccesorioMochilero;
    }

    public void setAccesorioMochilero(String accesorioMochilero) {
        AccesorioMochilero = accesorioMochilero;
    }

    public String getHerramientaDeRecoleccion() {
        return HerramientaDeRecoleccion;
    }

    public void setHerramientaDeRecoleccion(String herramientaDeRecoleccion) {
        HerramientaDeRecoleccion = herramientaDeRecoleccion;
    }

    public String getAlaDelta() {
        return AlaDelta;
    }

    public void setAlaDelta(String alaDelta) {
        AlaDelta = alaDelta;
    }

    public String getGesto() {
        return Gesto;
    }

    public void setGesto(String gesto) {
        Gesto = gesto;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    @Override
    public String toString() {
        return "Conjunto{" +
                "id=" + id +
                ", Traje='" + Traje + '\'' +
                ", AccesorioMochilero='" + AccesorioMochilero + '\'' +
                ", HerramientaDeRecoleccion='" + HerramientaDeRecoleccion + '\'' +
                ", AlaDelta='" + AlaDelta + '\'' +
                ", Gesto='" + Gesto + '\'' +
                ", URL='" + URL + '\'' +
                '}';
    }
}
