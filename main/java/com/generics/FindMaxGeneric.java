package com.generics;
/*
 *@Description:- Extend the max method to also print the max to std out using Generic Method
 */
public class FindMaxGeneric<T extends Comparable<T>> {
    private final T a ;T b;T c;T p;T q;T r;
    public FindMaxGeneric(T a, T b, T c,T p,T q,T r) {
        this.a =a;
        this.b = b;
        this.c = c;
        this.p =p;
        this.q = q;
        this.r = r;

    }
    public T findMaximum() {
        return FindMaxGeneric.findMaximum(a, b, c,p ,q ,r);
    }

    public T findmaximum() {
        T findMax = FindMaxGeneric.findMaximum(a, b, c, p, q,r);
        printMax(findMax);
        return findMax;
    }
    public void printMax(T maximum) {
        System.out.println("Maximum : " + maximum);
    }
    public static <T extends Comparable> T findMaximum(T a, T b, T c,T p,T q,T r) {
        T max = a;
        if (b.compareTo(max) > 0) {
            max = b;
        }
        if (c.compareTo(max) > 0) {
            max = c;
        }
        if (p.compareTo(max) > 0) {
            max = p;
        }
        if (q.compareTo(max) > 0) {
            max = q;
        }
        if (r.compareTo(max) > 0) {
            max = r;
        }
        return max;
    }
}