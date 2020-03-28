class Solution {
	public int[] smallerNumbersThanCurrent(int[] nums) {
		int[] clones = nums.clone();
		Arrays.sort(clones);
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < clones.length; i++) {
			if (!map.containsKey(clones[i])) {
				map.put(clones[i], i);
			}
		}

		int[] result = new int[nums.length];
		for (int index = 0; index < nums.length; index++) {
			result[index] = map.get(nums[index]);
		}
		return result;
	}
}