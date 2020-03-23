package Lesson3;

import java.util.Random;
import java.util.Scanner;

public class Zagadka {
    public static Scanner num = new Scanner(System.in);
    public static Scanner ans = new Scanner(System.in);
    public static int x = Enter("Введите любое число от 0 до 9 :", 0, 9);
    public static void main(String[] args) {
        Random rand = new Random();
        int z = rand.nextInt(10);
        for (int i = 0; i < 9; i++) {               //счётчик попыток
            if (x < z) {
                System.out.println("Вы ввели слишком маленькое число. Попробовать ещё? 1 – да / 0 – нет");
                Answer(1, 0);
            } else if (x > z) {
                System.out.println("Вы ввели слишком большое число. Попробовать ещё? 1 – да / 0 – нет");
                Answer(1, 0);
            } else if (x == z) {
                System.out.println("УРА! Вы угадали!");
                break;
            }
        }
        System.out.println("Игра закончена");
    }


    private static int Enter(String str, int min, int max) {
        int x;
        do {
            System.out.println(str);
            x = num.nextInt();
        } while (x < min || x > max);
        return x;
    }

    private static int Answer(int yes, int no) {
        yes = 1;
        no = 0;
        int y = ans.nextInt();
            if (y == no) {
                System.out.println("Спасибо за игру");
                System.exit(0);
            } else if (y == yes) {
                x = Enter("Введите любое число от 0 до 9 :", 0, 9);
            }
        return y;
    }
}
