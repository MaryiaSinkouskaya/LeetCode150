package section1_arrays_strings;

import org.junit.Assert;
import org.junit.Test;

public class RemoveElementTest {

    @Test
    public void testRemoveElementExample1() {
        RemoveElement solution = new RemoveElement();

        // Example 1: nums = [3,2,2,3], val = 3
        int[] nums = {3, 2, 2, 3};
        int val = 3;
        int expected = 2;
        int result = solution.removeElement(nums, val);
        Assert.assertEquals(expected, result);

        // Verify the array is modified correctly
        // The first 2 elements should not contain val
        for (int i = 0; i < result; i++) {
            Assert.assertNotEquals(val, nums[i]);
        }
    }

    @Test
    public void testRemoveElementExample2() {
        RemoveElement solution = new RemoveElement();

        // Example 2: nums = [0,1,2,2,3,0,4,2], val = 2
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;
        int expected = 5;
        int result = solution.removeElement(nums, val);
        Assert.assertEquals(expected, result);

        // Verify the array is modified correctly
        // The first 5 elements should not contain val
        for (int i = 0; i < result; i++) {
            Assert.assertNotEquals(val, nums[i]);
        }
    }
} 