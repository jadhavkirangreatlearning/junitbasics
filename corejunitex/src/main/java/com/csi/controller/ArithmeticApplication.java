package com.csi.controller;

public class ArithmeticApplication {

    public static void main(String[] args) {
        System.out.println("Addition Result: " + add(4, 5));

        System.out.println("Substraction Result: " + sub(10, 2));

        System.out.println("Multiplication Result: " + mul(4, 5));

        System.out.println("Division Result: " + div(10, 2));


    }

    public static int add(int n1, int n2) {
        return n1 + n2;
    }

    public static int sub(int n1, int n2) {
        return n1 - n2;
    }

    public static int mul(int n1, int n2) {
        return n1 * n2;
    }

    public static int div(int n1, int n2) {
        return n1 / n2;
    }


}
