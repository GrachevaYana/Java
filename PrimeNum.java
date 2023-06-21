import java.util.Scanner;

// Дана последовательность N целых чисел. Найти сумму простых чисел.
public class PrimeNum {



    public static boolean primeInt(int num) {
        if (num == 1) {
            return true;
        }
        if ((num % 2 == 0 && num!=2) || (num %3 ==0 && num !=3) || (num%5 == 0 && num != 5)) {
            return false;
        }
        for (int i = 2; i < num * num; i++) {
            if (i != num) {
                if (num % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }

}