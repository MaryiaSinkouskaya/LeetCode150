package section1_arrays_strings;

class RemoveElement {
    public int removeElement(int[] nums, int val) {
        if (nums.length == 0) {
            return 0;
        }

        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                k++;
                moveElements(nums, i);
                i--;
            }
        }
        return nums.length - k;
    }

    private void moveElements(int[] nums, int pos){
        for (int i = pos; i < nums.length - 1; i++) {
            nums[i] = nums[i+1];
        }
        nums[nums.length-1] = Integer.MAX_VALUE;
    }
} 