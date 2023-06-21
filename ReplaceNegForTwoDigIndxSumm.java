// Дан массив целых чисел. Заменить отрицательные элементы на сумму индексов двузначных элементов массива.
public class ReplaceNegForTwoDigIndxSumm {

    public static int twoDigIndxSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {

            int temp = arr[i];
            if (temp < 0) {
                temp *= -1;
            }
            if (temp > 9 && temp <= 99) {
                sum += i;
            }
        }
        return sum;
    }

    public static int[] replaceNeg(int[] arr, int replacer) {
        int[] resArr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                resArr[i] = replacer;
            } else {
                resArr[i] = arr[i];
            }
        }
        return resArr;

    }


}
