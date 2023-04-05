package ru.job4j;

/** Ниже приведен код. Он не компилируется. Программа должна 4 раза вывести на консоль "Hello, Job4j, age = 6".

 Ваша задача поправить код, чтобы он компилировался.

 Метод hello принимает два аргумента: первый аргумент имеет тип String, второй аргумент имеет тип int.

 В методе main мы вызывает 4 раза метод hello. Вам нужно написать правильные аргументы.


 *
 */
public class ArgMethod {
    public static void hello(String name, int age) {
        System.out.println("Hello, " + name + ", age + " + age);
    }

    public static void main(String[] args) {
        String name = "Job4j";
        int age = 6;
        ArgMethod.hello(name, age);
        ArgMethod.hello(name, age);
        ArgMethod.hello(name, age);
        ArgMethod.hello(name, age);
      //  ArgMethod.hello(age);
    }
}

