package com.generics;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FindMaxGenericTest {
    private static final FindMaxGeneric findMax = new FindMaxGeneric();

    @Test
    public void whenGivenThreeIntegers_AndFirstNumberIsMax_ShouldReturn_true() {
        Integer[] intArray = {30, 20, 10};
        Integer result = findMax.findMaximum(intArray);
        Assertions.assertEquals(Integer.valueOf(intArray[0]), result);
    }

    @Test
    public void whenGivenThreeIntegers_AndSecondNumberIsMax_ShouldReturn_true() {
        Integer[] intArray = {10, 30, 20};
        Integer result = findMax.findMaximum(intArray);
        Assertions.assertEquals(Integer.valueOf(30), result);
    }

    @Test
    public void whenGivenThreeIntegers_AndThirdNumberIsMax_ShouldReturn_true() {
        Integer[] intArray = {10, 20, 30};
        Integer result = findMax.findMaximum(intArray);
        Assertions.assertEquals(Integer.valueOf(30), result);
    }

    //Maximum finding for float values
    @Test
    public void whenGivenThreeFloatValues_AndFisrtNumberIsMax_ShouldReturn_true() {
        Float[] floatArray= {3.5f,1.5f,2.5f};
        Float result=findMax.findMaximum(floatArray);
        Assertions.assertEquals(floatArray[0], result);
    }

    @Test
    public void whenGivenThreeFloatValues_AndSecondNumberIsMax_ShouldReturnTrue() {
        Float[] floatArray= {1.5f,3.5f,2.5f};
        Float result=findMax.findMaximum(floatArray);
        Assertions.assertEquals(floatArray[1], result);
    }

    @Test
    public void whenGivenThreeFloatValues_AndThirdNumberIsMax_ShouldReturnTrue() {
        Float[] floatArray= {1.5f,2.5f,3.5f};
        Float result=findMax.findMaximum(floatArray);
        Assertions.assertEquals(floatArray[2], result);
    }

    //finding max of strings
    @Test
    public void whenGivenThreeStrings_AndFirstStringIsMax_ShouldReturn_true() {
        String [] stringArray = {"Promogranate", "Gua", "Orange"};
        String result = findMax.findMaximum(stringArray);
        Assertions.assertEquals("Promogranate", result);
    }

    @Test
    public void whenGivenThreeStrings_AndSecondStringIsMax_ShouldReturn_true() {
        String [] stringArray = { "Gua","Promogranate", "Orange"};
        String result = findMax.findMaximum(stringArray);
        Assertions.assertEquals("Promogranate", result);
    }

    @Test
    public void whenGivenThreeStrings_AndThirdStringIsMax_ShouldReturn_true() {
        String [] stringArray = { "Gua", "Orange","Promogranate"};
        String result = findMax.findMaximum(stringArray);
        Assertions.assertEquals("Promogranate", result);
    }
}