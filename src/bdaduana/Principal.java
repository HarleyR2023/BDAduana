package bdaduana;

import bdaduana.conexion.BaseDatos;
import bdaduana.controlador.ControladorGerente;
import bdaduana.controlador.ControladorLogin;
import bdaduana.vista.PantallaGerente;
import bdaduana.vista.PantallaLogin;

public class Principal {
    public static final BaseDatos CONEXION_BD = new BaseDatos();

    public static void main(String[] args) {
        CONEXION_BD.crearConexion();
        
        new ControladorLogin(new PantallaLogin());
    }
}
