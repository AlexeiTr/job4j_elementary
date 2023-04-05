package ru.job4j;
/** Допишите в методе main код, который вызовет метод func1 с аргументом x = 100,
 *  Результат вычисления запишите в переменную result3.
 */
public class MathFunc {
    public static int func1() {
        int x = 100;
        return x;
    }

    public static void main(String[] args) {

        int result3 = MathFunc.func1();
        System.out.println(result3);
    }
}