class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int[] arr = new int[nums.length];
        int j = 0;
        for (int i : nums) {
            if (i < pivot) {
                arr[j++] = i;
            }
        }
        for (int i : nums) {
            if (i == pivot) {
                arr[j++] = i;
            }
        }
        for (int i : nums) {
            if (i > pivot) {
                arr[j++] = i;
            }
        }

        return arr;
      }
}