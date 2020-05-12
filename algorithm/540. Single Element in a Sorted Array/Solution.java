/*
class binarySearchSolution  {
    public int singleNonDuplicate(int[] nums) {
        int lo = 0, len = nums.length, hi = len / 2;

        while (lo < hi){
            int mid = lo + ((hi - lo) >> 1);
            if (nums[2 * mid] == nums[2 * mid + 1]){
                lo = mid + 1;
            } else {
                hi = mid;
            }
        }
        return nums[2 * lo];

    }
}

*/

class Solution {
	public int singleNonDuplicate(int[] nums) {
		if (nums.length == 1) {
			return nums[0];
		}
		for (int i = 0, y = 1; i < nums.length - 1; i += 2) {
			if (nums[i] != nums[y]) {
				return nums[i];
			}
			y += 2;
		}
		return nums[nums.length - 1];
	}
}