//compareTo -- boolean
//https://deepeshdarshan.wordpress.com/2013/01/17/finding-max-value-using-java-generics/
package com.generics;

public class FindMaxGeneric{
    public <T extends Comparable>T findMaximum(T[] numberArray) {
        T max = numberArray[0];
        for (T element : numberArray) {
            if (element.compareTo(max) > 0) {
                max = element;
            }
        }
        return max;
    }
}