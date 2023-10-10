package bdaduana;

import bdaduana.conexion.BaseDatos;

public class Principal {
    public static final BaseDatos CONEXION_BD = new BaseDatos();

    public static void main(String[] args) {
        CONEXION_BD.crearConexion();
    }
}
