package ru.job4j.loop;

import java.util.Scanner;

public class DoWhileExample {
    // Цикл Do-While
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int password;
        do {                                         // Потом проверка условия! В данном случае ввод пользователя
            System.out.println("Введите пароль: ");
            password = scanner.nextInt();
        } while (password != 555);                   // C начала выполняется код
        System.out.println("Пароль введён успешно!");
    }
}
