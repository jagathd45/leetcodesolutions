class Solution {
    public int networkDelayTime(int[][] graph, int n, int k) {
        int dist[] = new int[n+1];
        int max = -1;
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[k] = 0;
        for(int i=1;i<=n;++i){
            for(int j=0;j<graph.length;++j){
                int u = graph[j][0];
                int v = graph[j][1];
                int w = graph[j][2];
                if(dist[u] + w < dist[v] && dist[u] != Integer.MAX_VALUE){
                    dist[v]=dist[u] + w;
                }
            }
        }
        for (int i=1;i<dist.length;i++){
            if(dist[i] > max)
            {
                max = dist[i];
            }
        }
        return (max == Integer.MAX_VALUE) ? -1 : max;
    }
}