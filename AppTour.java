package com.isabella.taller.tour;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import com.isabella.taller.tour.Corredor;
import com.isabella.taller.tour.Equipo;
import com.isabella.taller.tour.Etapa;
import com.isabella.taller.tour.TourDeFrance;


public class AppTour {
    public static void main(String[] args) {
//Equipo1
        Corredor rigo= new Corredor("Rigoberto Uran","Procycling EF", (int) 33, "Colombiano");
        Corredor alejo= new Corredor("Rigoberto Uran","Procycling EF", (int) 43, "Colombiano");
        Corredor nairo= new Corredor("Rigoberto Uran","Procycling EF", (int) 13, "Colombiano");
        Corredor pipe= new Corredor("Rigoberto Uran","Procycling EF", (int) 20, "Colombiano");
        Corredor isa= new Corredor("Rigoberto Uran","Procycling EF", (int) 30, "Colombiano");
        Corredor egan= new Corredor("Rigoberto Uran","Procycling EF", (int) 28, "Colombiano");
        Corredor jose= new Corredor("Rigoberto Uran","Procycling EF", (int) 34, "Colombiano");
//Equipo2

        Equipo procycling = new Equipo();
        procycling.getCorredores().add(rigo);
        procycling.getCorredores().add(alejo);
        procycling.getCorredores().add(nairo);
        procycling.getCorredores().add(pipe);
        procycling.getCorredores().add(isa);
        procycling.getCorredores().add(egan);
        procycling.getCorredores().add(jose);

        Corredor jairo= new Corredor("Rigoberto Uran","Procycling EF", (int) 33, "Colombiano");
        Corredor jaime= new Corredor("Rigoberto Uran","Procycling EF", (int) 43, "Colombiano");
        Corredor camilo= new Corredor("Rigoberto Uran","Procycling EF", (int) 13, "Colombiano");
        Corredor carlos= new Corredor("Rigoberto Uran","Procycling EF", (int) 20, "Colombiano");
        Corredor julian= new Corredor("Rigoberto Uran","Procycling EF", (int) 30, "Colombiano");
        Corredor juan= new Corredor("Rigoberto Uran","Procycling EF", (int) 28, "Colombiano");
        Corredor alberto= new Corredor("Rigoberto Uran","Procycling EF", (int) 34, "Colombiano");

        Equipo movistar = new Equipo();
        movistar.getCorredores().add(jairo);
        movistar.getCorredores().add(jaime);
        movistar.getCorredores().add(camilo);
        movistar.getCorredores().add(carlos);
        movistar.getCorredores().add(julian);
        movistar.getCorredores().add(juan);
        movistar.getCorredores().add(alberto);

        Corredor fernando= new Corredor("Rigoberto Uran","Procycling EF", (int) 33, "Colombiano");
        Corredor luis= new Corredor("Rigoberto Uran","Procycling EF", (int) 43, "Colombiano");
        Corredor felipe= new Corredor("Rigoberto Uran","Procycling EF", (int) 13, "Colombiano");
        Corredor hernan= new Corredor("Rigoberto Uran","Procycling EF", (int) 20, "Colombiano");
        Corredor yeison= new Corredor("Rigoberto Uran","Procycling EF", (int) 30, "Colombiano");
        Corredor isabella= new Corredor("Rigoberto Uran","Procycling EF", (int) 28, "Colombiano");
        Corredor karla= new Corredor("Rigoberto Uran","Procycling EF", (int) 34, "Colombiano");

        Equipo elRetiro = new Equipo();
        elRetiro.getCorredores().add(fernando);
        elRetiro.getCorredores().add(luis);
        elRetiro.getCorredores().add(felipe);
        elRetiro.getCorredores().add(hernan);
        elRetiro.getCorredores().add(yeison);
        elRetiro.getCorredores().add(isabella);
        elRetiro.getCorredores().add(karla);

        TourDeFrance equipos = new TourDeFrance();
        equipos.getEquipos().add(procycling);
        equipos.getEquipos().add(movistar);
        equipos.getEquipos().add(elRetiro);

        System.out.println("\n Los equipos son: ");
        TourDeFrance.getEquipos().stream().map(equipo -> equipos.getEquipos()).forEach(System.out::println);

        System.out.println("los corredores ordenados segun la edad son: ");
        List<Corredor> corredores = Arrays.asList();
                new Corredor("Rigoberto Uran",(int) 33);
                new Corredor("Rigoberto Uran",(int) 43);
                new Corredor("Rigoberto Uran", (int) 13);
                new Corredor("Rigoberto Uran", (int) 20);
                new Corredor("Rigoberto Uran", (int) 30);
                new Corredor("Rigoberto Uran", (int) 28);
                new Corredor("Rigoberto Uran", (int) 34);
                new Corredor("Rigoberto Uran",(int) 33);
                new Corredor("Rigoberto Uran",(int) 43);
                new Corredor("Rigoberto Uran", (int) 13);
                new Corredor("Rigoberto Uran", (int) 20);
                new Corredor("Rigoberto Uran", (int) 30);
                new Corredor("Rigoberto Uran", (int) 28);
                new Corredor("Rigoberto Uran", (int) 34);
                new Corredor("Rigoberto Uran",(int) 33);
                new Corredor("Rigoberto Uran",(int) 43);
                new Corredor("Rigoberto Uran", (int) 13);
                new Corredor("Rigoberto Uran", (int) 20);
                new Corredor("Rigoberto Uran", (int) 30);
                new Corredor("Rigoberto Uran", (int) 28);
                new Corredor("Rigoberto Uran", (int) 34);
                new Corredor("Rigoberto Uran",(int) 33);
                new Corredor("Rigoberto Uran",(int) 43);
                new Corredor("Rigoberto Uran", (int) 13);
                new Corredor("Rigoberto Uran", (int) 20);
                new Corredor("Rigoberto Uran", (int) 30);
                new Corredor("Rigoberto Uran", (int) 28);
                new Corredor("Rigoberto Uran", (int) 34);

         corredores.sort(Comparator.comparingInt(Corredor::getEdad)
                .reversed());

        corredores.forEach(System.out::println);

        List<Etapa> posiciones = Arrays.asList();
        Etapa uno= new Etapa(rigo,(int) 1);
        Etapa dos=new Etapa(carlos,(int) 2);
        Etapa tres=new Etapa(juan, (int) 3);
        Etapa cuatro=new Etapa(karla, (int) 4);
        Etapa cinco=new Etapa(rigo, (int) 5);
        Etapa seis=new Etapa(rigo, (int) 6);
        Etapa siete=new Etapa(camilo, (int) 7);
        Etapa ocho=new Etapa(jaime,(int) 8);
        Etapa nueve=new Etapa(camilo,(int) 9);
        Etapa diez=new Etapa(jose, (int) 10);
        Etapa once=new Etapa(pipe, (int) 11);
        Etapa doce=new Etapa(rigo, (int) 12);
        Etapa trece=new Etapa(carlos, (int) 13);
        Etapa catorce=new Etapa(camilo, (int) 14);
        Etapa quince=new Etapa(pipe,(int) 15);
        Etapa diesiseis=new Etapa(isa,(int) 16);
        Etapa diesinueve=new Etapa(alberto, (int) 17);
        Etapa diesiocho=new Etapa(alejo, (int) 18);
        Etapa diesinueve=new Etapa(luis, (int) 19);
        Etapa veinte=new Etapa(luis, (int) 20);
        Etapa veintiuno=new Etapa(julian, (int) 21);

        posiciones.get().stream().map(etapa -> etapa.getCorredor()).forEach(System.out::println);


    }

}
