package cr.ac.ucenfotec.avance1.bl.entidades;

import java.util.ArrayList;

public class ListaReproduccion {

    private String fechaCreacion;
    private String nombreLista;
    private ArrayList<Cancion> cancioneslista = new ArrayList<>();



    public ListaReproduccion(String nombreLista, String fechaCreacion) {

        this.fechaCreacion = fechaCreacion;
        this.nombreLista = nombreLista;

    }


    public String getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacionLista(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getNombreLista() {
        return nombreLista;
    }

    public void setNombreLista(String nombreLista) {
        this.nombreLista = nombreLista;
    }

    public ListaReproduccion() {
    }

    public void agregarCancionEnListaRepro(Cancion cancion1){
    getCancioneslista().add(cancion1);
    }

    public ArrayList<Cancion> getCancioneslista() {
        return cancioneslista;
    }

    public void setCancioneslista(ArrayList<Cancion> cancioneslista) {
        this.cancioneslista = cancioneslista;
    }

    @Override
    public String toString() {
        return "ListaReproduccion{" +
                "fechaCreacion='" + fechaCreacion + '\'' +
                ", nombreLista='" + nombreLista + '\'' +
                ", cancioneslista=" + cancioneslista +
                '}';
    }
}