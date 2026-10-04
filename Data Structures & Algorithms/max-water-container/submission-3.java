class Solution {
    public int maxArea(int[] heights) {
        int maxArea=0;
        int left=0;
        int right= heights.length-1;
        while(left<right)
        {
            int area=0;
            if(heights[left]<heights[right])
            {
                area= (right-left)*heights[left];
                left++;
            }
            else
            {
                area= (right-left)*heights[right];
                right--;
            }
            maxArea=Math.max(area,maxArea);
        }
        return maxArea;
    }
}
