package cr.ac.ucenfotec.avance1.bl.entidades;

public class Admin extends Usuarios{
    // Need to check recordings from 10/12

    public Admin() {
    }

    public Admin(String username, String avatar, String nombre, String apellido1, String apellido2, String password, String email) {
        super(username, avatar, nombre, apellido1, apellido2, password, email);
    }



    @Override
    public String toString() {
        return "Admin{" +
                "username='" + username + '\'' +
                ", avatar='" + avatar + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido1='" + apellido1 + '\'' +
                ", apellido2='" + apellido2 + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
