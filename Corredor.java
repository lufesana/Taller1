package com.isabella.taller.tour;

public class Corredor {
    private String nombre;
    private short numero;
    private String equipo;
    private int edad;
    private byte titulos;
    private String nacionalidad;

    public Corredor(String nombre, String equipo) {
        this.nombre = nombre;
        this.equipo = equipo;
    }

    public Corredor(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Corredor(String nombre, String equipo, int edad, String nacionalidad) {
        this.nombre = nombre;
        this.equipo = equipo;
        this.edad = edad;
        this.nacionalidad = nacionalidad;
    }


    public String getNombre() {
        return nombre;
    }

    public short getNumero() {
        return numero;
    }

    public String getEquipo() {
        return equipo;
    }

    public int getEdad() {
        return edad;
    }

    public byte getTitulos() {
        return titulos;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNumero(short numero) {
        this.numero = numero;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setTitulos(byte titulos) {
        this.titulos = titulos;
    }

}
