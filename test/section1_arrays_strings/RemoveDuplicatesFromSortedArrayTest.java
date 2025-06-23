package section1_arrays_strings;

import org.junit.Test;
import org.junit.Assert;

public class RemoveDuplicatesFromSortedArrayTest {
    
    @Test
    public void testRemoveDuplicatesExample1() {
        RemoveDuplicatesFromSortedArray solution = new RemoveDuplicatesFromSortedArray();
        
        // Example 1: nums = [1,1,2]
        int[] nums = {1, 1, 2};
        int expected = 2;
        int result = solution.removeDuplicates(nums);
        Assert.assertEquals(expected, result);
        
        // Verify the array is modified correctly
        // The first 2 elements should be unique
        Assert.assertArrayEquals(new int[]{1, 2, 2}, nums);
    }
    
    @Test
    public void testRemoveDuplicatesExample2() {
        RemoveDuplicatesFromSortedArray solution = new RemoveDuplicatesFromSortedArray();
        
        // Example 2: nums = [0,0,1,1,1,2,2,3,3,4]
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int expected = 5;
        int result = solution.removeDuplicates(nums);
        Assert.assertEquals(expected, result);
        
        // Verify the array is modified correctly
        // The first 5 elements should be unique
        Assert.assertArrayEquals(new int[]{0, 1, 2, 3, 4, 2, 2, 3, 3, 4}, nums);
    }
} 