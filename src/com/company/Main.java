package com.company;
import Beans.*;

public class Main {

    public static double calculate(HouseholdProduct p , double area){
        return area * p.getPricePerMS();
    }


    public static void main(String[] args) {

        Optimal optObjekt = new Optimal();
        Kompact komObjekt = new Kompact();
        //Variante1:
        System.out.println("Der Preis bei 100 QM und optimale Paket liegt bei: "+optObjekt.calculateSum(100));
        System.out.println("Der Preis bei 100 QM und kompakte Paket liegt bei: "+komObjekt.calculateSum(100));
        //Variante2:
        System.out.println("optimal: "+ calculate(optObjekt,100));
        System.out.println("Kompact: "+ calculate(komObjekt,100));
    }
}
