class Solution {
	public int countLargestGroup(int n) {
		Map<Integer, Integer> map = new HashMap<>();
		int maxCount = 1;
		int exist = 0;
		Integer cur;
		for (int i = 1; i <= n; i++) {
			int sum = sumOfDigits(i);
			map.put(sum, map.getOrDefault(sum, 0) + 1);
			maxCount = Math.max(map.get(sum), maxCount);
		}
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getValue() == maxCount) {
				exist++;
			}
		}
		return exist;

	}

	public int sumOfDigits(int num) {
		if (num < 10) {
			return num;
		}
		int sum = 0;
		while (num > 0) {
			sum = sum + num % 10;
			num = num / 10;
		}
		return sum;
	}
}