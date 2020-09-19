package com.isabella.taller.tour;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import com.isabella.taller.tour.Corredor;


public class Equipo {
    private String nombre;
    private short numeroCorredores;
    private String pais;
    private byte numeroTitulos;
    private ArrayList<Corredor> corredores;


    public Equipo() {
        this.corredores=new ArrayList<>();
    }

    public ArrayList<Corredor> getCorredores() {
        return corredores;
    }

    public static void getImprimirArrayCorredores(Corredor[] array) {
        for(int i=0;i< array.length;i++) {
            System.out.println((i+1) + "-" + array[i].getNombre()+ "- Edad: "+ array[i].getEdad());
        }
    }


    public void setCorredores(ArrayList<Corredor> corredores) {
        this.corredores = corredores;
    }


}
