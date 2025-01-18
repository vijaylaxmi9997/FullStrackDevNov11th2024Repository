package com.gentech.methodes;
class FibDemo
{
    void Fib()
    {
        int n = 10;
        int[] fibArray = new int[n];

        fibArray[0] = 0;
        fibArray[1] = 1;

        System.out.print(fibArray[0] + " " + fibArray[1] + " ");

        for (int i = 2; i < n; i++) {
            fibArray[i] = fibArray[i - 1] + fibArray[i - 2];
            System.out.print(fibArray[i] + " ");
        }

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += fibArray[i];
        }

        System.out.println("\nSum of Fibonacci numbers: " + sum);
    }
}
public class SumofFibanocciNum {
    public static void main(String[] args) {
        FibDemo o = new FibDemo();
        o.Fib();
    }
}
