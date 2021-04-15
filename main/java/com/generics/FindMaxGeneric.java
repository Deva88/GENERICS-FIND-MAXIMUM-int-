//compareTo -- boolean
//https://deepeshdarshan.wordpress.com/2013/01/17/finding-max-value-using-java-generics/
package com.generics;
/*@Description:- Given 3 Floats find the maximum
 *Given Max at 1st Position return the Same Number
 *Given Max at 2nd Position return the Same Number
 *Given Max at 3rd Position return the Same Number
 */

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