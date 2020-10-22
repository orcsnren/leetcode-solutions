class Solution {
	public int findDuplicate(int[] nums) {
		// Floyd's Tortoise and Hare Algorithm O(1) space
		int slow = nums[0];
		int fast = nums[0];
		do {
			// slow jumps 1 step
			slow = nums[slow];
			// fast jumps 2 steps
			fast = nums[nums[fast]];
		} while (slow != fast);
		// fast pointer to index0
		fast = nums[0];
		while (slow != fast) {
			slow = nums[slow];
			fast = nums[fast];
		}
		return fast;
	}
}