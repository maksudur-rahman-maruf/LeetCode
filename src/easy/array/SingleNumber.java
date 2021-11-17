package easy.array;

import java.util.Arrays;

public class SingleNumber {
    public static int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int singleNumber = nums[nums.length - 1];

        for (int i = 0; i < nums.length - 1; i++) {

            if (nums[i] == nums[i + 1]) {
                i = i + 1;
            } else {
                singleNumber = nums[i];
                break;
            }
        }

        return singleNumber;
    }


    public static void main(String[] args) {
        int arr[] = {4, 1, 2, 1, 2, 4, 3};

        System.out.println(singleNumber(arr));
    }

}
