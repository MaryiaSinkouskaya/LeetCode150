package arrays;

import org.junit.Test;
import org.junit.Assert;

public class MergeSortedArrayTest {
    
    @Test
    public void testMergeSortedArrayExample1() {
        MergeSortedArray solution = new MergeSortedArray();
        
        // Example 1: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;
        
        solution.merge(nums1, m, nums2, n);
        
        int[] expected = {1, 2, 2, 3, 5, 6};
        Assert.assertArrayEquals(expected, nums1);
    }
    
    @Test
    public void testMergeSortedArrayExample2() {
        MergeSortedArray solution = new MergeSortedArray();
        
        // Example 2: nums1 = [1], m = 1, nums2 = [], n = 0
        int[] nums1 = {1};
        int m = 1;
        int[] nums2 = {};
        int n = 0;
        
        solution.merge(nums1, m, nums2, n);
        
        int[] expected = {1};
        Assert.assertArrayEquals(expected, nums1);
    }
    
    @Test
    public void testMergeSortedArrayExample3() {
        MergeSortedArray solution = new MergeSortedArray();
        
        // Example 3: nums1 = [0], m = 0, nums2 = [1], n = 1
        int[] nums1 = {0};
        int m = 0;
        int[] nums2 = {1};
        int n = 1;
        
        solution.merge(nums1, m, nums2, n);
        
        int[] expected = {1};
        Assert.assertArrayEquals(expected, nums1);
    }
} 