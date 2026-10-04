class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        int rows= matrix.length;
        int cols= matrix[0].length;

        int top=0;
        int bot =matrix.length-1;
        int mid=0;
        while(top<=bot)
        {
            mid= (top+bot)/2;
            if(target>matrix[mid][cols-1])
            {
                top=mid+1;
            }
            else if(target<matrix[mid][0])
            {
                bot=mid-1;
            }
            else
            {
                break;
            }
        }
        
        int start=0;
        int end=cols-1;
        while(start<=end)
        {
            int m= (start+end)/2;
            if(target<matrix[mid][m])
            {
                end=m-1;
            }
            else if(target>matrix[mid][m])
            {
                start= m+1;
            }
            else
            {
                return true;
            }
        }
        return false;
    }
}
