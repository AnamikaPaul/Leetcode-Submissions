// https://leetcode.com/problems/all-paths-from-source-to-target

class Solution {
    
    public void dfs(int[][] graph,List<List<Integer>> paths,List<Integer> path, int start, int end ){
    
        path.add(start);
        for(int node: graph[start])
        {
            dfs(graph, paths, path,node,end);
        }
        if(start==end)
        {
            paths.add(new ArrayList<>(path));
            
        }
        path.remove(path.size()-1);
    
    }
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> paths= new ArrayList<>();
        List<Integer> path= new ArrayList<>();
        
        dfs(graph, paths, path, 0,graph.length-1);
        
        return paths; 
        
    }
}