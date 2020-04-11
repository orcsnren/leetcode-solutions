class Solution {
	public int countElements(int[] arr) {
		int count = 0;
		int[] arr2 = new int[arr.length + 1];
		for (int i = 0; i < arr.length; i++) {
			arr2[arr[i]] += 1;
		}

		for (int k = 0; k < arr2.length - 1; k++) {
			if (arr2[k] > 0 && arr2[k + 1] > 0) {
				count += arr2[k];
			}

		}
		return count;
	}
}