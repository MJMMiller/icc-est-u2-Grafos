public class App {
    public static void main(String[] args) throws Exception {

        Graph grafo = new  Graph();

        Node node0 = grafo.addNode(0);
        Node node5 = grafo.addNode(5);
        Node node3 = grafo.addNode(3);
        Node node1 = grafo.addNode(1);
        Node node2 = grafo.addNode(2);
        Node node4 = grafo.addNode(4);
        Node node9 = grafo.addNode(9);
        Node node7 = grafo.addNode(7);
        Node node8 = grafo.addNode(8);

        grafo.addEdge(node0, node5);
        grafo.addEdge(node0, node3);
        grafo.addEdge(node0, node1);
        grafo.addEdge(node1, node2);
        grafo.addEdge(node1, node4);
        grafo.addEdge(node1, node8);
        grafo.addEdge(node3, node2);
        grafo.addEdge(node3, node4);
        grafo.addEdge(node3, node7);
        grafo.addEdge(node3, node9);
        grafo.addEdge(node7, node8);

        grafo.printGraph();


    }
}
