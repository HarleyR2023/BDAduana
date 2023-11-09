package bdaduana;

import bdaduana.conexion.BaseDatos;
import bdaduana.controlador.ControladorEmpleados;
import bdaduana.vista.PantallaEmpleados;

public class Principal {

    public static void main(String[] args) {
        BaseDatos.INSTANCE.crearConexion();
        
        new ControladorEmpleados(new PantallaEmpleados());
    }
}
