package easy.array;

public class RemoveDuplicates {

    public static int removeDuplicates(int[] nums) {

        int count = 0;
        int flag = 0;
        int nextIndex = 0;
        for (int i = nextIndex; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    nextIndex = j;
                    flag = 1;
                }
            }

            if (flag == 1) {
                i = nextIndex;
                flag = 0;
            }

            nums[count] = nums[i];
            count++;

        }

        return count;

    }


    public static void main(String[] args) {

        int nums[] = {1, 1, 1, 3, 5, 5, 7, 9, 9};
        int k = removeDuplicates(nums);

        System.out.println(k);

//        int[] expectedNums = {1, 3, 5, 7, 9};
//
//        System.out.println(k == expectedNums.length);
//
//        for (int i = 0; i < k; i++) {
//            System.out.println(nums[i] == expectedNums[i]);
//        }
    }

}
