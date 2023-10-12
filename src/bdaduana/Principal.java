package bdaduana;

import bdaduana.conexion.BaseDatos;

public class Principal {

    public static void main(String[] args) {
        BaseDatos.INSTANCE.crearConexion();
    }
}
