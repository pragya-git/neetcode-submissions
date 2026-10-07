class Solution {
    public int countComponents(int n, int[][] edges) {
        ArrayList<ArrayList<Integer>> adj= new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++)
        {
            int u= edges[i][0];
            int w=edges[i][1];
            adj.get(u).add(w);
            adj.get(w).add(u);
        }
        Queue<Integer> q= new LinkedList<>();
        boolean[] visited= new boolean[n];
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(visited[i]!=true)
            {
                count++;
                q.add(i);
                visited[i]=true;
                while(q.size()!=0)
                {
                    int rn= q.remove();
                    for(int nbr: adj.get(rn))
                    {
                        if(visited[nbr]!=true)
                        {
                            q.add(nbr);
                            visited[nbr]=true;
                        }
                    }
                }
            }
            
        }
        return count;
    }
}
