class Solution {

    /*
    Visualization for solution 1:
        I: 7,0 - 4,4 - 7,1 - 5,0 - 6,1 - 5,2
        O after sort(): 7,0 - 7,1 - 6,1 - 5,0 - 5,2 - 4,4
        1: 7,0
        2: 7,0 - 7,1
        3: 7,0 - 6,1 - 7,1
        4: 5,0 - 7,0 - 6,1 - 7,1
        5: 5,0 - 7,0 - 5,2 - 6,1 - 7,1
        6: 5,0 - 7,0 - 5,2 - 4,4 - 6,1 - 7,1
*/
    public int[][] reconstructQueue(int[][] people) {

        Arrays.sort(people, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0] != o2[0]) { // diff height, compare order
                    return o2[0] - o1[0]; // higher first
                } else {
                    return o1[1] - o2[1]; // smaller order first
                }
            }
        });

        LinkedList<int[]> list = new LinkedList<>();
        for (int i = 0; i < people.length; i++) {
            list.add(people[i][1], people[i]);
        }
        return list.toArray(people);
    }
}