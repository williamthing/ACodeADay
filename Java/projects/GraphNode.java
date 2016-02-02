package projects;

import java.util.ArrayList;

public class GraphNode {
	public int data;
	public boolean visited;
	public ArrayList<GraphNode> path;
	
	public GraphNode(int n) {
		this.data = n;
		this.visited = false;
		this.path = new ArrayList<GraphNode>();
	}
}
