class Solution {
    public int numIdenticalPairs(int[] nums) {  // O(n2)
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int y = i + 1; y < nums.length; y++) {
                if (nums[i] == nums[y]) {
                    count++;
                }
            }
        }
        return count;
    }
}


/* O(n)

public int numIdenticalPairs(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int count=0;
        for (int num: nums) {
            if (map.containsKey(num)) {
                count+=map.get(num);
            }
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        return count;
    }

*/