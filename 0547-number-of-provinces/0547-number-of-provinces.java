class Solution {
    public int findCircleNum(int[][] isConnected) {
        int ans = 0;
        int n = isConnected.length;
        for(int i=0;i<n;i++)
        {
            if(isConnected[i][i] == 0)
            {
                continue;
            }
            ans++;
            dfs(isConnected,i);
            
        }
        return ans;
    }
    
  public  void dfs(int[][] graph, int i) {
    graph[i][i] = 0;
    for (int j = 0; j < graph.length; j++) {
      if (graph[i][j] == 0  || graph[j][j] == 0) continue;
      dfs(graph, j);
    }
  }
}