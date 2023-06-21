// Дана последовательность N целых чисел. Верно ли, что последовательность является возрастающей.


public class hw_2_2 {
    public static void main(String[] args) {
        int[] myArray = MyLib.getSubsequence();
        if (AscendingSequence.IsAcsending(myArray)) {
            System.out.println("Последовательность возрастает");
        } else {
            System.out.println("Последовательность НЕ возрастает");
        }
    }
}