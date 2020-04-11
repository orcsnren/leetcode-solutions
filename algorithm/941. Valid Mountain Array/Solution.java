class Solution {
	public boolean validMountainArray(int[] A) {
		int size = A.length;
		if (size < 3) {
			return false;
		}
		boolean isDecreasing = false;
		int peak = A[0];
		for (int i = 1; i < size; i++) {
			if (isDecreasing) {
				if (A[i] >= A[i - 1]) {
					return false;
				}
			} else if (A[i] < A[i - 1]) {
				peak = A[i - 1];
				isDecreasing = true;
			}

		}
		return (A[0] != peak && A[size - 1] != peak);

	}
}