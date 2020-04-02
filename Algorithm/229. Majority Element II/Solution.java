class Solution {
	public List<Integer> majorityElement(int[] nums) {
		List<Integer> elements = new ArrayList<>();
		Integer count = 0;
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			count = map.get(nums[i]);
			count = count == null ? 1 : ++count;
			if (count > nums.length / 3 && !elements.contains(nums[i])) {
				elements.add(nums[i]);
				if (elements.size() == 2) {
					break;
				}
			}
			map.put(nums[i], count);

		}
		return elements;
	}
}