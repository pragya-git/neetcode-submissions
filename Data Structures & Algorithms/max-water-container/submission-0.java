class Solution {
    public int maxArea(int[] heights) {
        int max=0;
        int area=0;
        int start=0;
        int end= heights.length-1;
        while(start<end)
        {
            if(heights[start]<heights[end])
            {
            area= heights[start]*(end-start);
            start++;
            }
            else
            {
            area= heights[end]*(end-start);
            end--;
            }
            max=Math.max(max,area);
        }
        return max;
    }
}
