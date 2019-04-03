package com.buffalo.DSLearning;

public class GCDFinder {

    public static void main(String[] args) {
        System.out.println(new GCDFinder().gcd(10,291));
    }
    public int gcd(int a, int b ){
        if( b ==0 )
            return a;
        return gcd(b,a%b);
    }

}
