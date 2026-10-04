class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        int rows=matrix.length;
        int cols= matrix[0].length;
        int top= 0, bottom= rows-1;
        int mid=0;
        while(top<=bottom)
        {
            mid=(top+bottom)/2;
            if(target> matrix[mid][cols-1])
            {
                top=mid+1;
            }
            else if(target<matrix[mid][0])
            {
                bottom= mid-1;
            }
            else
            {
                break;
            }
        }
        // no valid row found
        if(!(top<=bottom))
        {
            return false;
        }

        int start=0, end= cols-1;
        while(start<=end)
        {
            int m= (start+end)/2;
             if(target> matrix[mid][m])
            {
                start= m+1;
            }
            else if(target< matrix[mid][m])
            {
                end= m-1;
            }
            else
            {
                return true;
            }
        }
        return false;
        
    }
}
