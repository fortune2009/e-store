/*
 * Copyright © 2020:
 * Fortune David
 * TDGE
 */

package smallStore;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberssTest {

    private String[] units;
    private String[] teens;
    private String[] tens;
    private String[] unitZero;

    @BeforeEach
    void setUp() {
        // set units in words
        units = new String[]{"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};
        // set teens in words
        teens = new String[]{"", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen",
                "nineteen"};
        // set tens in words
        tens = new String[]{"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
        // set unitZero in words
        unitZero = new String[]{"", "hundred", "thousand", "million"};

    }

    @AfterEach
    void tearDown() {
    }

    @Test
    @DisplayName("Testing Unit")
    void numbers(){
        int input = 4;
        if(input < 10){
            System.out.println(units[input]);
        }
        assertEquals(units[input], "four");

    }

    @DisplayName("Testing Teens")
    @Test
    void number2(){
        int input = 14;
        if (input > 10 && input < 20){
            input = input % 10;
            System.out.println(teens[input]);
        }
        assertEquals(teens[input], "fourteen");
    }

    @DisplayName("Testing Tens with split")
    @Test
    void number3(){
        int input = 25;
        String stringInput= "";
        int newTenInput = 0;
        int newUnitInput = 0;
        if(input > 20 && input < 99){
             newTenInput = input / 10;
            stringInput += tens[newTenInput];
            newUnitInput = input % 10;
            stringInput += " ";
            stringInput += units[newUnitInput];
        }
        System.out.println(stringInput);
        assertEquals(tens[newTenInput], "twenty");
        assertEquals(units[newUnitInput], "five");
    }

    @DisplayName("Testing hundreds")
    @Test
    void number4(){
        int input = 115;
        String stringInput = "";
        int newUnitZeroInput = 0;
        int newTensInput = 0;
        int newUnitsInput = 0;
        if(input >= 100){
            newUnitZeroInput = input / 100;
            stringInput = stringInput + units[newUnitZeroInput] + " ";
            stringInput = stringInput + unitZero[newUnitZeroInput] + " ";
            newTensInput = input % 100;
            newTensInput = newTensInput % 10;
            stringInput = stringInput + teens[newTensInput] + " ";
            newUnitsInput = newTensInput % 10;
        }
        System.out.println(stringInput);
        assertEquals(unitZero[newUnitZeroInput], "hundred");
        assertEquals(teens[newTensInput], "fifteen");
    }
}