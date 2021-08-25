class Solution {
	public int findKthPositive(int[] arr, int k) {

		int i = 1;
		for (int index = 0; index < arr.length && k != 0; i++) {

			if (arr[index] != i) {
				k--;
			} else
				index++;

		}

		if (k != 0)
			return arr[arr.length - 1] + k;

		return i - 1;

	}

}