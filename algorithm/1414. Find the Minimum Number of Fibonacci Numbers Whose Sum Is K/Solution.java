class Solution {
	public int findMinFibonacciNumbers(int k) {
		int sum = 0;
		int[] array = new int[33];
		List<Integer> list = new ArrayList<>();
		list.add(0);
		list.add(1);
		list.add(1);
		int i = 3;
		while (sum < k) {
			sum = list.get(i - 1) + list.get(i - 2);
			list.add(sum);
			i++;
		}
		int count = 0, j = list.size() - 1;
		while (k > 0) {

			count += (k / list.get(j));
			k %= (list.get(j));

			j--;
		}
		return count;

	}
}