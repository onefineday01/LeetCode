class Solution {
    HashSet<Integer>visited, visiting;
    Stack<Integer> sorted;
    List<Integer> graph[];
    public int[] findOrder(int n, int[][] prerequisites) {
        visited = new HashSet();
        visiting = new HashSet();
        sorted = new Stack();
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
        if(!ans)
            return new int[]{};
        int arr[] = new int[n];
        for(int i =0 ;i < n; i++)
            arr[i] = sorted.pop();
        return arr;
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
        sorted.add(x);
        visiting.remove(x);
        visited.add(x);            
        return ans;
    }
}