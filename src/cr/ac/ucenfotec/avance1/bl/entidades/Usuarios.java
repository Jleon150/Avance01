package cr.ac.ucenfotec.avance1.bl.entidades;

public class Usuarios {
    protected String username;
    protected String avatar; //Imagen
    protected String nombre;
    protected String apellido1;
    protected String apellido2;
    protected String password;
    protected String email;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Usuarios() {
    }

    public Usuarios(String username, String avatar, String nombre, String apellido1, String apellido2, String password, String email) {
        this.username = username;
        this.avatar = avatar;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.password = password;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Usuarios{" +
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
