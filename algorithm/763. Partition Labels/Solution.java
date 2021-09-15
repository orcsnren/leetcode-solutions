class Solution {
    public List<Integer> partitionLabels(String S) {
        int lastIndex, begin = -1, end = -1;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < S.length(); i++) {

            if (begin == -1)
                begin = i;

            lastIndex = S.lastIndexOf(S.charAt(i));
            end = Math.max(end, lastIndex);
            if (end == i) {
                list.add(end - begin + 1);
                begin = -1;
            }
        }
        return list;

    }
}