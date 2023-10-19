package bdaduana.modelo;

public class Trabajador {
    private String usuario;
    private String contraseña;
    private String correo;
    private String dni;

    public Trabajador() {
        
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    
    public String getCorreo() {
        return correo;
    }
    
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    public String getDNI() {
        return dni;
    }
    
    public void setDNI(String dni) {
        this.dni = dni;
    }
}
