package com.generics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FindMaxGenericTest {

    private static final FindMaxGeneric findMax = new FindMaxGeneric();

    @Test
    public void whenGivenThreeNumbers_AndFirstNumberIsMax_ShouldReturn_true() {
        Integer[] intArray = {30, 20, 10};
        Integer result = findMax.findMaximum(intArray);
        Assertions.assertEquals(Integer.valueOf(intArray[0]), result);
    }

    @Test
    public void whenGivenThreeNumbers_AndSecondNumberIsMax_ShouldReturn_true() {
        Integer[] intArray = {10, 30, 20};
        Integer result = findMax.findMaximum(intArray);
        Assertions.assertEquals(Integer.valueOf(30), result);
    }

    @Test
    public void whenGivenThreeNumbers_AndThirdNumberIsMax_ShouldReturn_true() {
        Integer[] intArray = {10, 20, 30};
        Integer result = findMax.findMaximum(intArray);
        Assertions.assertEquals(Integer.valueOf(30), result);
    }

}