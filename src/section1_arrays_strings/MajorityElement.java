package section1_arrays_strings;

import java.util.Arrays;

class MajorityElement {

    //nums = [2,2,1,3,1,2,2] 1122223
    public int majorityElement(int[] nums) {

        if (nums.length <= 2){
            return nums[0];
        }
        Arrays.sort(nums);

        int k = 0;
        int maxOccur = 0;
        int val = nums[0];
        int maxVal = nums[0];
        for (int num : nums) {
            if (num == val) {
                k++;
            } else {
                if (k > maxOccur) {
                    maxOccur = k;
                    maxVal = val;
                }
                val = num;
                k = 1;
            }
        }
        return k > maxOccur ? val : maxVal;

    }
} 