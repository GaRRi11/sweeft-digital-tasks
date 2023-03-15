package org.gary;

public class Functions {


    //Task #1
    static int singleNumber(int [] nums){
        for (int i = 0; i <= nums.length; i++) {
            boolean isRepeated = false;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j] && j != i) {
                    isRepeated = true;
                    break;
                }
            }
            if (!isRepeated){
                return nums[i];
            }
        }
        return -1;
    }

    //another way using XOR operator
    public static int singleNumber2(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            result ^= nums[i];
        }
        return result;
    }



    //Task #2

    static int minSplit(int amount) {
        int num1 = amount/20;
        int num2 = amount - (20 * num1);
        int num3 = num2/10;
        int num4 = num2 - (10 * num3);
        int num5 = num4/5;
        int num6 = num4 - (5 * num5);
        return num1 + num3 + num5 + num6;
    }

    //Task #3

    static int notContains(int [] array){
        int n = array.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (array[j]>array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        int smallestNumber = 1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] <= smallestNumber) {
                smallestNumber = array[i] + 1;
            }
        }

        return smallestNumber;
    }

    //Task #4

     static String binaryString(String a, String b) {
        StringBuilder result = new StringBuilder();
        int carry = 0;
        int i = a.length() - 1;
        int j = b.length() - 1;
        while (i >= 0 || j >= 0 || carry > 0) {
            int sum = carry;
            if (i >= 0) {
                sum += a.charAt(i--) - '0';
            }
            if (j >= 0) {
                sum += b.charAt(j--) - '0';
            }
            result.insert(0, sum % 2);
            carry = sum / 2;
        }
        return result.toString();
    }

    //Task #5


     static int countVariants(int stearsCount) {
        if (stearsCount < 0) {
            return 0;
        } else if (stearsCount == 0) {
            return 1;
        } else {
            int[] memo = new int[stearsCount + 1];
            memo[0] = 1;
            memo[1] = 1;

            for (int i = 2; i <= stearsCount; i++) {
                memo[i] = memo[i - 1] + memo[i - 2];
            }

            return memo[stearsCount];
        }
    }


}
