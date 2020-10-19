package cr.ac.ucenfotec.avance1.bl.entidades;

public class Album {
    private String nombreAlbum;
    private String lanzamiento;
    private String artistas;
    private String imagen;

    public String getNombreAlbum() {
        return nombreAlbum;
    }

    public void setNombreAlbum(String nombreAlbum) {
        this.nombreAlbum = nombreAlbum;
    }

    public String getLanzamiento() {
        return lanzamiento;
    }

    public void setLanzamiento(String lanzamiento) {
        this.lanzamiento = lanzamiento;
    }

    public String getArtistas() {
        return artistas;
    }

    public void setArtistas(String artistas) {
        this.artistas = artistas;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public Album() {
    }

    public Album(String nombreAlbum, String lanzamiento, String artistas, String imagen) {
        this.nombreAlbum = nombreAlbum;
        this.lanzamiento = lanzamiento;
        this.artistas = artistas;
        this.imagen = imagen;
    }

    @Override
    public String toString() {
        return "Album{" +
                "nombreAlbum='" + nombreAlbum + '\'' +
                ", lanzamiento='" + lanzamiento + '\'' +
                ", artistas='" + artistas + '\'' +
                ", imagen='" + imagen + '\'' +
                '}';
    }
}
