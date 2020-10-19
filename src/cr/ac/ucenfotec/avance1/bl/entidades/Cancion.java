package cr.ac.ucenfotec.avance1.bl.entidades;

public class Cancion {
    private String nombre;
    private String genero;
    private String artista;
    private String compositor;
    private String lazamiento;
    private String album;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getCompositor() {
        return compositor;
    }

    public void setCompositor(String compositor) {
        this.compositor = compositor;
    }

    public String getLazamiento() {
        return lazamiento;
    }

    public void setLazamiento(String lazamiento) {
        this.lazamiento = lazamiento;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public Cancion() {
    }

    public Cancion(String nombre, String genero, String artista,
                   String compositor, String lazamiento, String album) {
        this.nombre = nombre;
        this.genero = genero;
        this.artista = artista;
        this.compositor = compositor;
        this.lazamiento = lazamiento;
        this.album = album;
    }

    @Override
    public String toString() {
        return "Cancion{" +
                "nombre='" + nombre + '\'' +
                ", genero='" + genero + '\'' +
                ", artista='" + artista + '\'' +
                ", compositor='" + compositor + '\'' +
                ", lazamiento='" + lazamiento + '\'' +
                ", album='" + album + '\'' +
                '}';
    }

}
