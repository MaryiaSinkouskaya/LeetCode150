package section1_arrays_strings;

class RemoveDuplicatesFromSortedArrayII {


    // Example 2: nums = [0, 0,1, 0, 0,1,1,1,1,2,3,3]
    public int removeDuplicates(int[] nums) {
        if (nums.length <= 2){
            return nums.length;
        }

        int pos = 2;
        for(int i = 2; i < nums.length; i++) {
            if (nums[i] != nums[pos - 2]) {
                nums[pos] = nums[i];
                pos++;
            }
        }
        return pos;
    }
} 