package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int perCh = sc.nextInt();
        System.out.println("Введите второе число: ");
        int vtorChi = sc.nextInt();
        System.out.println("Введите номер операции: 1.Сложение 2.Вычитание 3.Умножение");
        int a = sc.nextInt();
        if (a <= 3 && a >= 0) {
            int vich = 0;
            switch (a) {
                case 1:
                    vich = perCh + vtorChi;
                    System.out.println("сложение= " + vich);
                    break;
                case 2:
                    vich = perCh - vtorChi;
                    System.out.println("вычитание= " + vich);
                    break;
                case 3:
                    vich = perCh * vtorChi;
                    System.out.println("умножение= " + vich);
                    break;
            }
        } else {
            System.out.println("Неверно введена операция");

        }
        System.out.println("Hello World");
        System.out.println("My name is Andrei Sherel");
    }
}