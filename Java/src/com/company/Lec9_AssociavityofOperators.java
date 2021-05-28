package com.company;

public class Lec9_AssociavityofOperators {
    public static void main(String[] args) {
        int a = 6*5 - 34/2;
        // a = 30-17
        //a = 13

        // associativity left to right

        int b = 60/5 - 34*2 ;
        // 12-34/2
        // 12- 68
        // 56

        System.out.println(a);
        System.out.println(b);

        char n = 'a';
        System.out.println(n+1);

        // i++  --->   first use i then invrement i
        //++i   ---> first increment i then use i

        int k=10;
        int l = k++;
        System.out.println(l);
        int m = 10;
        int p = ++m;
        System.out.println(p);

    }
}
