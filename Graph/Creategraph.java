package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Creategraph {
    static class Edge {
        int src;
        int des;
        int wt;

        Edge(int s,int d,int w){
            this.src=s;
            this.des=d;
            this.wt = w;
        }
        
    };

    public static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 2,2));

        graph[1].add(new Edge(1, 2,10));
        graph[1].add(new Edge(1, 3,0));

        graph[2].add(new Edge(2,0,2));
        graph[2].add(new Edge(2, 1,10));
        graph[2].add(new Edge(2, 3,-1));

        graph[3].add(new Edge(3, 2,-1));
        graph[3].add(new Edge(3, 1,0));

    }
    public static void helper(ArrayList<Edge> graph[],boolean vis[],int ind){
        Queue<Integer>  qu= new LinkedList<>();
        qu.add(ind);
        while (!qu.isEmpty()) {
            int curr = qu.remove();
            if(vis[curr] == false){
                System.out.print(curr+" ");
                vis[curr] = true;
                for(int i=0; i<graph[curr].size(); i++){
                    Edge e = graph[curr].get(i);
                    qu.add(e.des);
                }

            }
        }
    }
    public static void BFS(ArrayList<Edge> graph[]){
        boolean vis[] = new boolean[graph.length];
        for(int i=0; i<graph.length; i++){
            if(vis[i]!= true)
            helper(graph,vis,i);
        }
    }
    public static void helper1(ArrayList<Edge> graph[],boolean vis[],int curr){
        System.out.print(curr+" ");
        vis[curr] = true;
        for(int i=0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if(!vis[e.des])
            helper1(graph, vis, e.des);
        }
    }
    public static void DFS(ArrayList<Edge> graph[]){
        boolean vis[] = new boolean[graph.length];
        for(int i=0; i<graph.length; i++){
            if(!vis[i]){
                helper1(graph, vis, i);
            }
        }
    }
    public static void main(String[] args) {
        int v = 4;
        ArrayList<Edge> graph[] = new ArrayList[v];
        createGraph(graph);
        BFS(graph);
        System.out.println();
        DFS(graph);
    }
}
