package agendafinal;

public class CONTACTOS {
    String nombre;
    String apellido;
    int cel;
    String mail;
    String contrasenia;
    String usuario;

    public CONTACTOS() {
    }

    public CONTACTOS(String nombre, String apellido, int cel, String mail) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cel = cel;
        this.mail = mail;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getCel() {
        return cel;
    }

    public void setCel(int cel) {
        this.cel = cel;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

}