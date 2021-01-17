package lesson1;

import java.util.Scanner;

public class Calculate {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Введиде первое число");
        float a = scanner.nextFloat();
        System.out.println("Введите второе число");
        float b = scanner.nextFloat();
        System.out.println("Введите третье число");
        float c = scanner.nextFloat();
        System.out.println("Введите четвертое число");
        float d = scanner.nextFloat();{
            if (d == 0) {
            System.out.println("Не верное значение,повторите ввод!" ); d = scanner.nextFloat();
            }

        }
         float result = a * (b + (c / d));
            System.out.println(" Результат " + result);




    }
}



