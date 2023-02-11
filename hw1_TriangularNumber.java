// Написать программу вычисления n-ого треугольного числа
// если перефразировать задание, то требуется найти сумму натуральных чисел от 1 до N

import java.util.Scanner;
public class hw1_TriangularNumber {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите число n: ");
            int n = scanner.nextInt();
            long sumN = 0;
             for (int i = 1; i <= n; i++) 
             {
                sumN = sumN + i;
             }
            System.out.println("результат вычисления n-ого треугольного числа: " + sumN);
        }
    }
}