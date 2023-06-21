

import java.util.Scanner;

public class MyLib {
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println('\n');
    }

    public static int[] quickSort(int[] subs, int left, int right) {
        int pivot = subs[(subs.length - 1) / 2];
        int i = left;
        int j = right;
        while (i <= j) {
            while (subs[i] <= pivot) {
                i++;
            }
            while (subs[j] > pivot) {
                j--;
            }
            if (i > j) {
                int t = subs[i];
                subs[i] = subs[j];
                subs[j] = t;
                i++;
                j--;
            }
        }
        if (i < right) quickSort(subs, i, right);
        if (left < j) quickSort(subs, left, j);
        return subs;

    }

    public static int[] getSubsequence() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Сколько чисел в Вашей последовательности?");

        while (!sc.hasNextInt()) {
            System.out.println("Это не целое число, попробуйте еще раз");
            sc.next();
        }
        int n = sc.nextInt();

        int[] subs = new int[n];
        String primeNumbers;
        System.out.println("Введите числа последовательности: ");
        for (int i = 0; i < n; i++) {
            while (!sc.hasNextInt()) {
                System.out.println("Это не целое число, попробуйте еще раз");
                sc.next();
            }
            subs[i] = sc.nextInt();
        }
        sc.close();
        System.out.println(subs.length);
        return subs;
    }
}
