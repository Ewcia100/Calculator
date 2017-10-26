package com.kodilla;

public class Calculator {


    public void sum(int argA, int argB) {
        int suma = argA + argB;
        System.out.println("The sum is equal " + suma);
    }

    public void subtraction(int argA, int argB) {
        int sub = argA - argB;
        System.out.println("The subtraction is equal " + sub);
    }

    public static void main(String args[]) {
        Calculator calculator = new Calculator();
        calculator.sum(8, 9);
        calculator.subtraction(12, 18);
    }
}
