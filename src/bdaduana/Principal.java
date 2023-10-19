package bdaduana;

import bdaduana.conexion.BaseDatos;
import bdaduana.controlador.ControladorLogin;
import bdaduana.vista.PantallaLogin;

public class Principal {

    public static void main(String[] args) {
        BaseDatos.INSTANCE.crearConexion();
        
        new ControladorLogin(new PantallaLogin());
    }
}
