class Solution {
	public boolean isHappy(int n) {
		Map<Integer, Integer> num_map = new HashMap<>();
		int result = n;
		while (result != 1) {
			if (num_map.get(result) != null) {
				return false;
			}
			num_map.put(result, result);
			result = findSumPower(result);
		}
		return true;
	}

	public int findSumPower(int n) {
		int tmp = 0;
		while (n > 0) {
			tmp += Math.pow((n % 10), 2);
			n /= 10;
		}
		return tmp;
	}
}