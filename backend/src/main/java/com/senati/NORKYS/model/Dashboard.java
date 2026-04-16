package com.senati.NORKYS.model;

public class Dashboard {
    private long totalEmpleados;
    private long asistieron;
    private long faltaron;
    private long llegaronTarde;
    private boolean asistenciaTomadaHoy;
    private String mensaje;


    //Construtor vacio, es necesario para recibir JS0N
    public Dashboard(){}

    //Constructor con parametros
    public Dashboard(long totalEmpleados, long asistieron, long faltaron, long llegaronTarde,
                     boolean asistenciaTomadaHoy, String mensaje){
        this.totalEmpleados = totalEmpleados;
        this.asistieron = asistieron;
        this.faltaron = faltaron;
        this.llegaronTarde = llegaronTarde;
        this.asistenciaTomadaHoy = asistenciaTomadaHoy;
        this.mensaje = mensaje;

    }



    //SETTERS Y GETTERS
    public long getTotalEmpleados() {
        return totalEmpleados;
    }

    public void setTotalEmpleados(long totalEmpleados) {
        this.totalEmpleados = totalEmpleados;
    }

    public long getAsistieron() {
        return asistieron;
    }

    public void setAsistieron(long asistieron) {
        this.asistieron = asistieron;
    }

    public long getFaltaron() {
        return faltaron;
    }

    public void setFaltaron(long faltaron) {
        this.faltaron = faltaron;
    }

    public long getLlegaronTarde() {
        return llegaronTarde;
    }

    public void setLlegaronTarde(long llegaronTarde) {
        this.llegaronTarde = llegaronTarde;
    }

    public boolean isAsistenciaTomadaHoy() {
        return asistenciaTomadaHoy;
    }

    public void setAsistenciaTomadaHoy(boolean asistenciaTomadaHoy) {
        this.asistenciaTomadaHoy = asistenciaTomadaHoy;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
}
