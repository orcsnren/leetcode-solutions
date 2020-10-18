class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        if (nums.length == 1 || nums.length == 0) {
            return nums;
        }
        Arrays.sort(nums);
        int[] frequency = new int[k];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer num = new Integer(nums[i]);
            int count = map.getOrDefault(num, 0);
            map.put(num, ++count);
        }

        Object[] a = map.entrySet().toArray();
        Arrays.sort(a, new Comparator() {
            public int compare(Object o1, Object o2) {
                return ((Map.Entry<Integer, Integer>) o2).getValue()
                        .compareTo(((Map.Entry<Integer, Integer>) o1).getValue());
            }
        });

        for (Object e : a) {
            if (k == 0) {
                break;
            }
            frequency[frequency.length - (k--)] = ((Map.Entry<Integer, Integer>) e).getKey();
        }

        return frequency;
    }
}