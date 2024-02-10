package com.company;

import Beans.Kompact;
import Beans.Optimal;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    /*@BeforeAll
    void setUp() {
        Optimal opt=new Optimal();
        Kompact kom = new Kompact();
    }*/
// Add Initialization and test the object initialzed
    // chack the names and commit
    @Test
    void testCalculate() {
        Optimal opt=new Optimal();
        Kompact kom = new Kompact();
        double d = opt.calculateSum(10);
        //Test Initiazation


        //Variante1
        assertEquals(7000,Main.calculate(opt,10));
        assertEquals(6500,Main.calculate(kom,10));

        //Variante2
        assertEquals(7000,opt.calculateSum(10));
        assertEquals(6500,kom.calculateSum(10));
    }


}