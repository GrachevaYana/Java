// Дана последовательность целых чисел, оканчивающаяся нулем. 
// Найти сумму положительных чисел, после которых следует отрицательное число.

class hw_1_1 {
    public static void main(String[] args)
    {
        int count = 0;
        Integer[] nums = { 1, -2, 3, -4 , 0};
        for (int i = 1; i < nums.length; i++) 
        {
            if ((nums[i] < 0) && (nums[i-1] > 0)); 
            {
                count += 1;
            }
        };
        System.out.println(count);
    }
}