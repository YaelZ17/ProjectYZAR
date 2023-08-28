package org.example;

public class Socio {

    private String Nombre;
    private int Identificacion;
    private String Direccion;
    private int Telefono;
    private String FechaAlta;

    public String getNombre() {return Nombre;}

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public int getIdentificacion() {
        return Identificacion;
    }

    public void setIdentificacion(int identificacion) {
        Identificacion = identificacion;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int telefono) {
        Telefono = telefono;
    }

    public String getFechaAlta() {
        return FechaAlta;
    }

    public void setFechaAlta(String fechaAlta) {
        FechaAlta = fechaAlta;
    }
    protected void RealizarPrestamo(){}
}
