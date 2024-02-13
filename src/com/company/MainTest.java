package com.company;

import Classes.Compact;
import Classes.Optimal;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    Optimal optimal=new Optimal();
    Compact compact= new Compact();

    @Test
    @DisplayName("Test_Calculate")
    void testCalculate() {
        assertAll("Variante 1",
                ()-> assertEquals(7000,Main.calculate(optimal,10)),
                ()-> assertEquals(6500,Main.calculate(compact,10))
        );
        assertAll("Variante 2",
                ()-> assertEquals(7000, optimal.calculateSum(10)),
                ()-> assertEquals(6500, compact.calculateSum(10))
        );

    }


}