package com.isabella.taller.tour;

import java.util.ArrayList;

public class Etapa {
    private float kilometros;
    private String dificultad;
    private Corredor ganador;
    private ArrayList posiciones;
    private int numeroEtapa;

    public Etapa(Corredor ganador, int numeroEtapa) {
        this.ganador = ganador;
        this.numeroEtapa = numeroEtapa;
        this.posiciones= new ArrayList<>();
    }

    public void setKilometros(float kilometros) {
        this.kilometros = kilometros;
    }

    public void setDificultad(String dificultad) {
        this.dificultad = dificultad;
    }

    public void setGanador(Corredor ganador) {
        this.ganador = ganador;
    }

    public void setPosiciones(ArrayList posiciones) {
        this.posiciones = posiciones;
    }

    public float getKilometros() {
        return kilometros;
    }

    public String getDificultad() {
        return dificultad;
    }

    public Corredor getGanador() {
        return ganador;
    }

    public ArrayList getPosiciones() {
        return posiciones;
    }

    public int getNumeroEtapa() {
        return numeroEtapa;
    }
}
