package easy.array;

public class MoveZeroes {

    public void moveZeroes(int[] nums) {
        int temp;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == 0 && nums[j] != 0) {
                    temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                    break;
                }

            }
        }

    }

    public static void main(String[] args) {

    }

}
