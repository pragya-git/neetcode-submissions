class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int start=1;
        int end= Arrays.stream(piles).max().getAsInt();
        int res =end;
        while(start<=end)
        {
            int mid= (start+end)/2;
            int totalTime =0;
            for(int p: piles)
            {
                totalTime= totalTime + (int) Math.ceil((double)p/mid);
            }

            if( totalTime<= h)
            {
                res = mid;
                end=mid-1;
            }
            else if(totalTime> h)
            {
                start=mid+1;
            }
        }
        return res; 
     }
}
