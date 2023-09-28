package bdaduana.modelo;

import java.text.DecimalFormat;

public class Empleado extends Trabajador {
    private static final DecimalFormat FORMATO_EMPLEADO = new DecimalFormat("SEC0000");
    private static int contador = 0;
    
    private final String codigo;
    
    public Empleado() {
        contador++;
        this.codigo = FORMATO_EMPLEADO.format(contador);
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
