package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        retur sum(first, second)
                + multiply(first, second);
    }

    public static double sumTwo(double first, double second) {
        return minus(first, second)
                + div(first, second);
    }

    public static double allSum(double first, double second) {
        return sumAndMultiply(first, second)
                + sumTwo(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета равен: " + sumTwo(20, 10));
        System.out.println(allSum(10, 20));
    }
}
