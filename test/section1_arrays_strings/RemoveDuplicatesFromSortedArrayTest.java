package section1_arrays_strings;

import org.junit.Assert;
import org.junit.Test;

public class RemoveDuplicatesFromSortedArrayTest {

    @Test
    public void testRemoveDuplicatesExample1() {
        RemoveDuplicatesFromSortedArray solution = new RemoveDuplicatesFromSortedArray();

        // Example 1: nums = [1,1,2]
        int[] nums = {1, 1, 2};
        int expected = 2;
        int result = solution.removeDuplicates(nums);
        Assert.assertEquals(expected, result);

    }

    @Test
    public void testRemoveDuplicatesExample2() {
        RemoveDuplicatesFromSortedArray solution = new RemoveDuplicatesFromSortedArray();

        // Example 2: nums = [0,0,1,1,1,2,2,3,3,4]
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int expected = 5;
        int result = solution.removeDuplicates(nums);
        Assert.assertEquals(expected, result);

    }
} 