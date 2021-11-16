package easy.array;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    public static boolean containsDuplicate(int[] arr) {

        Integer[] nums = Arrays.stream(arr)
                .boxed()
                .toArray(Integer[]::new);

        int lengthInArray = nums.length;

        Set set = new HashSet(Arrays.asList(nums));
        int lengthInSet = set.size();

        if (lengthInArray == lengthInSet)
            return false;
        else
            return true;
    }


    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4};

        System.out.println(containsDuplicate(arr));

    }

}
