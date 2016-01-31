package projects;

public class GraphNode {
	public int data;
	public boolean visited;
	public GraphNode[] neighbors;
	
	public GraphNode(int n) {
		this.data = n;
		this.visited = false;
	}

}
