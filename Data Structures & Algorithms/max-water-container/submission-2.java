class Solution {
    public int maxArea(int[] heights) {
        int maxArea=0;
        for(int i=0;i<=(heights.length-2);i++)
        {
            for(int j=i+1;j<=(heights.length-1);j++)
            {
                int area=(j-i)*Math.min(heights[j],heights[i]);
                maxArea=Math.max(area,maxArea);
            }
        }
        return maxArea;
    }
}
