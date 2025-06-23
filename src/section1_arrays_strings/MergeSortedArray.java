package section1_arrays_strings;

class MergeSortedArray {
  public void merge(int[] nums1, int m, int[] nums2, int n) {
    if (n == 0) {
      return;
    }

    for (int i = m; i < nums1.length; i++) {
      nums1[i] = Integer.MAX_VALUE;
    }

    int i = 0;
    int j = 0;

    int val1 = nums1[i];
    int val2 = nums2[j];

    while (j < nums2.length) {
      if (val1 < val2 && i < nums1.length - 1) {
        i++;
        val1 = nums1[i];
        continue;
      }

      moveAllAfterValues(nums1, i);
      nums1[i] = val2;
      val1 = val2;
      j++;
      if (j < nums2.length) {
        val2 = nums2[j];
      }

    }
  }

  private void moveAllAfterValues(int[] nums1, int pos) {
    for (int i = nums1.length - 2; i >= pos; i--) {
      nums1[i + 1] = nums1[i];
    }
  }
}