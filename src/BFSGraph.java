import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
//Breadth First Search(BFS) or undirected level order traversal in undirected graph
public class BFSGraph {
    static class edge1{
        int src;
        int dest;
        edge1(int s,int d){
            this.src = s;
            this.dest = d;
        }
    }
    public static void createGraph(ArrayList<edge1> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i] = new ArrayList<edge1>();
        }

        graph[0].add(new edge1(0,1));
        graph[0].add(new edge1(0,2));

        graph[1].add(new edge1(1,0));
        graph[1].add(new edge1(1,3));

        graph[2].add(new edge1(2,0));
        graph[2].add(new edge1(2,4));

        graph[3].add(new edge1(3,1));
        graph[3].add(new edge1(3,4));
        graph[3].add(new edge1(3,5));

        graph[4].add(new edge1(4,2));
        graph[4].add(new edge1(4,3));
        graph[4].add(new edge1(4,5));

        graph[5].add(new edge1(5,3));
        graph[5].add(new edge1(5,4));
        graph[5].add(new edge1(5,6));

        graph[6].add(new edge1(6,5));

    }

    public static void bfs(ArrayList<edge1> graph[],int v,boolean vis[],int start){
        Queue<Integer> q = new LinkedList<>();  //Queue for adding the edges

        q.add(start);   //start is the starting vertex or node
        while(!q.isEmpty()){
            int curr = q.remove();
            if(vis[curr] == false){
                System.out.print(curr+" ");
                vis[curr] = true;

                for(int i=0;i<graph[curr].size();i++){
                    edge1 e = graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }
    }
    public static void main(String[] args){
        int v = 7;
        /*  graph image
            1----3
           /     | \
          0      |  5 -- 6
           \     | /
             2---4
         */
        ArrayList<edge1> graph[] = new ArrayList[v];
        createGraph(graph);
        boolean vis[] = new boolean[v]; // for the visited vertex
        for(int i=0;i<v;i++){
            if(vis[i] == false){
                bfs(graph,v,vis,i);
            }
        }

    }
}
