class Solution {
    HashSet<Integer> visiting, visited;
    List<Integer> graph[];
    public boolean canFinish(int n, int[][] prerequisites) {
        visiting = new HashSet();
        visited = new HashSet();
        graph = new ArrayList[n];
        for(int i = 0; i < n; i++)
            graph[i] = new ArrayList<Integer>();
        for(int arr[] : prerequisites)
            graph[arr[1]].add(arr[0]);
        boolean ans = true;
        for(int i = 0; i < n; i++){
            if(!ans) break;
            if(!visited.contains(i)) ans = ans && dfs(i);
        }
        return ans;
    }
    boolean dfs(int x){
        visiting.add(x);
        boolean ans = true;
        for(int i : graph[x]){
            if(!ans) break;
            if(!visited.contains(i)){
                if(visiting.contains(i)) return false; 
                ans = ans && dfs(i);
            }
        }
        visiting.remove(x);
        visited.add(x);            
        return ans;
    }
}