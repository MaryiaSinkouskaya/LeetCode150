package section1_arrays_strings;

import org.junit.Assert;
import org.junit.Test;

public class RemoveDuplicatesFromSortedArrayIITest {

    @Test
    public void testRemoveDuplicatesExample1() {
        RemoveDuplicatesFromSortedArrayII solution = new RemoveDuplicatesFromSortedArrayII();

        // Example 1: nums = [1,1,1,2,2,3]
        int[] nums = {1, 1, 1, 2, 2, 3};
        int expected = 5;
        int result = solution.removeDuplicates(nums);
        Assert.assertEquals(expected, result);

        // Verify the array is modified correctly
        // The first 5 elements should have at most 2 of each
        Assert.assertArrayEquals(new int[]{1, 1, 2, 2, 3, 3}, nums);
    }

    @Test
    public void testRemoveDuplicatesExample2() {
        RemoveDuplicatesFromSortedArrayII solution = new RemoveDuplicatesFromSortedArrayII();

        // Example 2: nums = [0,0,1,1,1,1,2,3,3]
        int[] nums = {0, 0, 1, 1, 1, 1, 2, 3, 3};
        int expected = 7;
        int result = solution.removeDuplicates(nums);
        Assert.assertEquals(expected, result);

        // Verify the array is modified correctly
        // The first 7 elements should have at most 2 of each
        Assert.assertArrayEquals(new int[]{0, 0, 1, 1, 2, 3, 3, 3, 3}, nums);
    }
} 