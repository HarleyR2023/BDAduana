package bdaduana.modelo;

import bdaduana.Formatos;

public class Empleado extends Trabajador {
    private static int contador = 0;
    
    private final String codigo;
    
    public Empleado() {
        contador++;
        this.codigo = Formatos.EMPLEADO.format(contador);
    }
    
    public Object[] registrarNuevo() {
        Object[] filas = {
            this.codigo,
            this.getNombre(),
            this.getApellido(),
            this.getUsuario(),
            this.getContraseña()
        };
        return filas;
    }
}
