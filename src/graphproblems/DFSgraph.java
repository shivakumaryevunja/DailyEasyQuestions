package graphproblems;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class DFSgraph {
    static class Edge{
        int src;
        int dest;
        Edge(int s,int d){
            this.src = s;
            this.dest = d;
        }
    }
    public static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0;i< graph.length;i++){  //in this we add the empty values in the graph where initially there was null values
            graph[i] = new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,2));

        graph[1].add(new Edge(1,0));
        graph[1].add(new Edge(1,3));

        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2,4));

        graph[3].add(new Edge(3,1));
        graph[3].add(new Edge(3,4));
        graph[3].add(new Edge(3,5));

        graph[4].add(new Edge(4,2));
        graph[4].add(new Edge(4,3));
        graph[4].add(new Edge(4,5));

        graph[5].add(new Edge(5,3));
        graph[5].add(new Edge(5,4));
        graph[5].add(new Edge(5,6));

        graph[6].add(new Edge(6,5));
    }

    public static void dfsGraph(ArrayList<Edge> graph[],boolean vis[],int curr){
        System.out.print(curr+" ");
        vis[curr] = true;
        for(int i=0;i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);
            if(vis[e.dest] == false){
                dfsGraph(graph,vis,e.dest);
            }
        }
    }
    public static void main(String[] args){
        int v = 7;
        ArrayList<Edge> graph[] = new ArrayList[v];
        createGraph(graph);
        /*  graph image
             1---3
           /     | \
          0      |  5 -- 6
           \     | /
             2---4
         */
        boolean vis[] = new boolean[v];
        for(int i=0;i<v;i++){
            if(vis[i] == false){
                dfsGraph(graph,vis,i);
            }
        }
    }
}
