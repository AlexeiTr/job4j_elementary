package ru.job4j.calculator;

public class MathFuncBad {
    public static int func1() {
        int x = 100;
        return x;
    }

    public static void main(String[] args) {

        int result3 = MathFuncBad.func1();
        System.out.println(result3);

    }
}