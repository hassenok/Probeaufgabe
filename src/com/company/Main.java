package com.company;
import Classes.*;

public class Main {

    public static double calculate(HouseholdProduct product , double area){
        return area * product.getPricePerMS();
    }


    public static void main(String[] args) {

        Optimal optObjekt = new Optimal();
        Compact komObjekt = new Compact();
        //Variante1:
        System.out.println("Das optimale Paket für 100 QM kostet: "+optObjekt.calculateSum(100));
        System.out.println("Das kompakte Paket für 100 QM kostet: "+komObjekt.calculateSum(100));
        //Variante2:
        System.out.println("Das optimale Paket für 100 QM kostet: "+ calculate(optObjekt,100));
        System.out.println("Das kompakte Paket für 100 QM kostet: "+ calculate(komObjekt,100));
    }
}
