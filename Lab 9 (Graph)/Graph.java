public class Graph<T extends Comparable<T>> extends WeightedGraph<T, Integer> {

    public boolean addEdge(T source, T destination) {
        return super.addEdge(source, destination, 1);
    }

    public boolean addUndirectedEdge(T v1, T v2) {
        boolean a, b;
        a = addEdge(v1, v2, 1);
        b = addEdge(v2, v1, 1);
        return (a && b);
    }
}
