class Solution {
    public int maxArea(int[] heights) {
        int len= heights.length;
        int max=0;
        int left= 0;
            int right= len-1;
            while(left<right)
            {
                if(heights[left]<heights[right])
                {
                    max= Math.max(max,heights[left]*(right-left));
                    left++;
                }
                else
                {
                    max= Math.max(max,heights[right]*(right-left));
                    right--;
                }
            }
        return max;
    }
}
