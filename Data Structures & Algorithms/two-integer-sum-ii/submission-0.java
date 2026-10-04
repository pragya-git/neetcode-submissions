class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int start=0;
        int end= numbers.length-1;
        int[] ans= new int[2];
        for(int i=0;i<=numbers.length-1;i++)
        {
            if(numbers[start]+numbers[end]>target)
            {
                end--;
            }
            else if(numbers[start]+numbers[end]<target)
            {
                start++;
            }
            else if(numbers[start]+numbers[end]==target)
            {
                ans[0]=start+1;
                ans[1]=end+1;
            }
        }
        return ans;
    }
}
