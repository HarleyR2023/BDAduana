package bdaduana.modelo;

import bdaduana.Formatos;

public class Consignatorio {
    private String orden;
    private String consignatario;
    private int ruc;
    private String estado;
    private String canal;
    private String nave;
    private String almacen;

    public Consignatorio() {

    }

    public String getOrden() {
        return orden;
    }

    public void setOrden(String orden) {

        this.orden = orden;
    }

    public String getConsignatario() {
        return consignatario;
    }

    public void setConsignatario(String consignatario) {
        this.consignatario = consignatario;
    }

    public int getRuc() {
        return ruc;
    }

    public void setRuc(int ruc) {
        this.ruc = ruc;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCanal() {
        return canal;
    }

    public void setCanal(String canal) {
        this.canal = canal;
    }

    public String getNave() {
        return nave;
    }

    public void setNave(String nave) {
        this.nave = nave;
    }

    public String getAlmacen() {
        return almacen;
    }

    public void setAlmacen(String almacen) {
        this.almacen = almacen;
    }

    public Object[] registrarNuevo(int num) {
        orden = Formatos.CONSIGNATORIO.format(num) + "-2023";

        Object[] fila = { orden, consignatario, ruc, estado, canal, nave, almacen };
        return fila;
    }
}
