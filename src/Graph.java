import java.util.HashSet;
import java.util.Set;

public class Graph {

    private Set<Node> nodes;

    public Graph(){
        this.nodes = new HashSet<>();
    }

    public Node addNode(int value) {
        Node node = new Node(value);
        nodes.add(node);
        return node;
    }

    public void addEdge(Node src, Node dest){

    }

    public void printGrapg(){

    }

    public void getDFS(Node startNode){

    }

    public void getDFSUtil(Node node, boolean[] visited){

    }

    public void getBFS(Node startNode){

    }

    public int[][] getAdjancencyMatrix(){
        return new int[0][0];
    }

    public void printAdjancencyMatrix(){

    }
}
