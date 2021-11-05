package com.ID1018;

public class Main {

    public static void main(String[] args) {
        int results = 1 + 2; // 1 + 2 = 3
        System.out.println("1+2 = " + results);
        int prevoiusResults = results;
        System.out.println("prevoiusResults = " + prevoiusResults);
        results = results - 1;
        System.out.println("3-1 = "+results);
        System.out.println("prevoiusResults = " + prevoiusResults);

        results = 4;
        System.out.println("results are " + results);
        results= results % 3; //gives us the remainder of 4/3 i.e. 4 modulo 3
        System.out.println("4 % 3 = " + results);
        System.out.println(results);

        results++; // same as writing results+1
        System.out.println(results);

        results--; // same as writing results - 1
        System.out.println(results);

        results += 2; // same as writing results + 2
        System.out.println(results);

        results *= 10; // same as writing results * 10
        System.out.println(results);

        results /= 3; // same as writing results/10
        System.out.println(results);

        results -= 2; // same as writing results - 2
        System.out.println(results);
    }
}
