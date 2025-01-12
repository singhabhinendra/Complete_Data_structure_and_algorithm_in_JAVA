package contests.Weeklycontest132;
import java.util.*;
public class minimizeTheMaxEdgWOfGraph {
    public int minMaxWeight(int n, int[][] e, int th) {
        List<int[]> g[] = new ArrayList[n];
        for(int i=0;i<n;i++)
            g[i]=new ArrayList<>();
        int[] cnt = new int[n];
        int[] vis = new int[n];
        for(int[] ed : e)
        {
            g[ed[1]].add(new int[]{ed[0],ed[2]});
        }
        for(int i=0;i<n;i++)
        {
            g[i].sort(Comparator.comparingInt(a -> a[1]));
        }
        int ans = 0;
        PriorityQueue<int[]> q = new PriorityQueue<>((q1,q2)->(q1[1]-q2[1]));
        q.add(new int[]{0,0});
        while(q.size() > 0)
        {
            int[] rem = q.poll();
            int node = rem[0];
            int wt = rem[1];
            if(vis[node] == 1 || cnt[node] >= th)
                continue;
            ++cnt[node];
            vis[node] = 1;
            ans = Math.max(ans,wt);
            for(int i=0;i<g[node].size();i++)
            {
                int[] nbr =  g[node].get(i);
                q.add(nbr);
            }
        }
        for(int i=0;i<n;i++)
            if(vis[i] == 0)
                return -1;
        return ans;
    }
    public static void main(String[] args) {
        minimizeTheMaxEdgWOfGraph obj = new minimizeTheMaxEdgWOfGraph();
        System.out.println(obj.minMaxWeight(5,new int[][]{{1,0,1},{2,0,2},{3,0,1},{4,3,1},{2,1,1}},2));
    }
}
