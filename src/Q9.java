/**
 * @(#)Path.java
 * Problem 9: Node Path Existence
 *
 * @author 
 * @version 1.00 2023/9/2
 */


import java.util.*;

class Graph {
    private Map<Character, List<Character>> list;

    public Graph() {
        list = new HashMap<>();
    }

    public void addEdge(char start, char end) {
        list.putIfAbsent(start, new ArrayList<>());
        list.get(start).add(end);
        //the edge will be stored corresponding to their start node
       
    }

    public boolean hasPath(char start, char end, List<Character> path) {
    	
    	//self connected node
        if (start == end) {
            path.add(start);
            return true;
        }

		//when the start node is not contain in the list
        if (!list.containsKey(start)) {
            return false;
        }

        for (char neighbor : list.get(start)) {
            if (!path.contains(neighbor)) {
                path.add(start);
                if (hasPath(neighbor, end, path)) {
                    return true;
                }
                path.remove(path.size() - 1); // backtrack
            }
        }

        return false;
    }
}

public class Q9 {
    public static void main(String[] args) {
        Graph graph = new Graph();

        // Add edges to the graph
        graph.addEdge('A', 'B');
        graph.addEdge('B', 'D');
        graph.addEdge('B', 'F');
        graph.addEdge('D', 'E');
        graph.addEdge('F', 'A');
        graph.addEdge('F', 'B');


		//test for node A to node D
        char start = 'A';
        char end = 'D';

        List<Character> path = new ArrayList<>();
        boolean pathExists = graph.hasPath(start, end, path);

        System.out.println("Start = " + start);
        System.out.println("End = " + end);

		//display the path if it exists
        if (pathExists) {
            System.out.println("Connected path: " + path);
        }
    }
}
