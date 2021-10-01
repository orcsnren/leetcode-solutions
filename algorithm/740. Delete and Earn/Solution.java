// referenced by another leetcode user
class Solution {
    public int deleteAndEarn(int[] nums) {
        int count[] = new int[10001];
        for (int i : nums)
            count[i]++;

        int joined = 0;
        int dropped = 0;

        for (int i = 0; i < 10001; i++) {
            int newJoined = dropped + count[i] * i;
            int newDropped = Math.max(joined, dropped);
            joined = newJoined;
            dropped = newDropped;
        }

        return Math.max(joined, dropped);
    }
}