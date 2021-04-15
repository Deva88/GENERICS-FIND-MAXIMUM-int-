package com.generics;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
//private static final FindMaxGeneric findMax = new FindMaxGeneric(null, null, null);

public class FindMaxGenericTest {
    private static FindMaxGeneric findMax;

    @Test
    public void whenGivenThreeNumbers_ShouldReturnMaximumInteger()
    {
        Integer i1 = 10, i2 = 25, i3 = 20, i4=30, i5=40, i6=50;
        findMax = new FindMaxGeneric(i1, i2, i3, i4 ,i5, i6);
        Object result = findMax.findMaximum();    //stored in obj
        Assertions.assertEquals(i6, result);
    }

    @Test
    public void whenGivenThreeFloatValues_ShouldReturnMaximumFloat()
    {
        Float f1=2.5f, f2=5.5f, f3=10.25f, f4=12.25f, f5=8.24f, f6=2.524f;
        findMax = new FindMaxGeneric(f1, f2, f3, f4, f5, f6);
        Comparable result=findMax.findMaximum();  //Inorder to use object,i am using comparable type
        Assertions.assertEquals(f4, result);
    }

    @Test
    public void whenGivenThreeStrings_ShouldReturnMaximumString()
    {
        String s1="Grape",s2="Orange",s3="Gua",s4="Kiwi", s5="Promogranate",s6="";
        findMax=new FindMaxGeneric(s1, s2, s3, s4, s5, s6);
        String result=(String) findMax.findMaximum();   //typecasting
        Assertions.assertEquals(s5,result);
    }

}