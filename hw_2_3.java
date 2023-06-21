public class hw_2_3 {
    public static void main(String[] args) {
        int[] myArray = MyLib.getSubsequence();
        MyLib.printArray(myArray);
        int sum = ReplaceNegForTwoDigIndxSumm.twoDigIndxSum(myArray);
        System.out.println("two digit numbers indexes sum " + sum);
        int[] newArr = ReplaceNegForTwoDigIndxSumm.replaceNeg(myArray, sum);
        MyLib.printArray(newArr);

    }
}