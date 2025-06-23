package section1_arrays_strings;

import org.junit.Test;
import org.junit.Assert;

public class MajorityElementTest {
    
    @Test
    public void testMajorityElementExample1() {
        MajorityElement solution = new MajorityElement();
        
        // Example 1: nums = [3,2,3]
        int[] nums = {3, 2, 3};
        int expected = 3;
        int result = solution.majorityElement(nums);
        Assert.assertEquals(expected, result);
    }
    
    @Test
    public void testMajorityElementExample2() {
        MajorityElement solution = new MajorityElement();
        
        // Example 2: nums = [2,2,1,1,1,2,2]
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        int expected = 2;
        int result = solution.majorityElement(nums);
        Assert.assertEquals(expected, result);
    }
} 