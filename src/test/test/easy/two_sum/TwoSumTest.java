package easy.two_sum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TwoSumTest {

    @Test
    void test1() {
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;

        int[] twoSum = TwoSum.findTwoSumSquaredComplexity(nums, target);
        int[] expectedTwoSum = new int[]{0, 1};

        for (int i = 0; i < twoSum.length; i++) {
            Assertions.assertEquals(expectedTwoSum[i], twoSum[i]);

        }
    }

    @Test
    void test2() {
        int[] nums = new int[]{3, 2, 4};
        int target = 6;

        int[] twoSum = TwoSum.findTwoSumSquaredComplexity(nums, target);
        int[] expectedTwoSum = new int[]{1, 2};

        for (int i = 0; i < twoSum.length; i++) {
            Assertions.assertEquals(expectedTwoSum[i], twoSum[i]);

        }
    }

    @Test
    void test3() {
        int[] nums = new int[]{3, 3};
        int target = 6;

        int[] twoSum = TwoSum.findTwoSumSquaredComplexity(nums, target);
        int[] expectedTwoSum = new int[]{0, 1};

        for (int i = 0; i < twoSum.length; i++) {
            Assertions.assertEquals(expectedTwoSum[i], twoSum[i]);

        }
    }
}
