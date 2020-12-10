public class Solution {
    public int maxArea(int[] height) {
        int maxArea = 0, l = 0, r = height.length - 1;
        while (l < r) {
            maxArea = Math.max(maxArea, Math.min(height[l], height[r]) * (r - l));
            if (height[l] < height[r]) {
                l++;
            } else {
                r--;
            }
        }
        return maxArea;
    }

    /* Brute Force

    public int maxArea(int[] height) {
        int maxArea = 0;
        for(int i=0;i<height.length-1;i++){
            for(int y=i+1;y<height.length;y++){
                maxArea = Math.max(maxArea,(y-i) * Math.min(height[i],height[y]));
            }
        }
        return maxArea;
    }
}

    */
}