package cr.ac.ucenfotec.avance1.bl.entidades;

public class UsuarioFinal extends Usuarios{

    private int edad;
    private String pais;
    private String idenficacion;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getIdenficacion() {
        return idenficacion;
    }

    public void setIdenficacion(String idenficacion) {
        this.idenficacion = idenficacion;
    }

    public UsuarioFinal() {
    }

    public UsuarioFinal(String username, String avatar, String nombre, String apellido1, String apellido2, String password, String email, int edad, String pais, String idenficacion) {
        super(username, avatar, nombre, apellido1, apellido2, password, email);
        this.edad = edad;
        this.pais = pais;
        this.idenficacion = idenficacion;
    }

    @Override
    public String toString() {
        return "UsuarioFinal{" +
                "edad=" + edad +
                ", pais='" + pais + '\'' +
                ", idenficacion='" + idenficacion + '\'' +
                ", username='" + username + '\'' +
                ", avatar='" + avatar + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido1='" + apellido1 + '\'' +
                ", apellido2='" + apellido2 + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
