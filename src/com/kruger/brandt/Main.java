package com.kruger.brandt;

import java.util.Arrays;

public class Main {

    private static int fib(int n, int[] memo){

        int result = 0;

        if(memo[n] != 0){
            return memo[n];
        }

        if (n == 0 || n == 1)
            result = 1;
        else
            result = fib(n - 1, memo) + fib(n - 2, memo);

        memo[n] = result;
        System.out.println(Arrays.toString(memo));

        return result;
    }


    public static void main(String[] args) {

        int[] memo = new int[9];
        System.out.println(fib(8, memo));

    }
}
