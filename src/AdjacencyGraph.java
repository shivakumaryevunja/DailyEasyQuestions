import java.util.ArrayList;
import java.util.LinkedList;

public class AdjacencyGraph {
    static class Edge{
        int src;
        int dest;
        Edge(int s,int d){
            this.src = s;
            this.dest = d;
        }
    }
    public static void creatGraph(ArrayList<Edge> graph[]){

        for(int i=0;i< graph.length;i++){
            graph[i] = new ArrayList<>(); // to make the ArrayList empty instead of null value
        }
        //undirected and un-weighted graph
        graph[0].add(new Edge(0,2)); //adding the edges to the ArrayList

        graph[1].add(new Edge(1,2));
        graph[1].add(new Edge(1,3));

        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2,1));
        graph[2].add(new Edge(2,3));

        graph[3].add(new Edge(3,1));
        graph[3].add(new Edge(3,2));
    }
    public static void main(String[] args){
        int v = 4;
        ArrayList<Edge> graph[] = new ArrayList[v];
        creatGraph(graph);

        for(int i=0;i<graph[2].size();i++){ //this prints the neighbors of the vertex 2:
            Edge e = graph[2].get(i);
            System.out.print(e.dest+" ");
        }
    }
}


