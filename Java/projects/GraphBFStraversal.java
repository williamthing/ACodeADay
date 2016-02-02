/* William Thing
 * practing graph traversal
 * 
 */

package projects;

import java.util.LinkedList;
import java.util.Queue;

public class GraphBFStraversal {
	
	public static void main(String[] arg) {
		GraphNode head = new GraphNode(1);
		GraphNode temp2 = new GraphNode(2);
		GraphNode temp3 = new GraphNode(3);
		GraphNode temp4 = new GraphNode(4);
		GraphNode temp5 = new GraphNode(5);
		GraphNode temp6 = new GraphNode(6);
		GraphNode temp7 = new GraphNode(7);
		GraphNode temp8 = new GraphNode(8);
		GraphNode temp9 = new GraphNode(9);
		
		head.path.add(temp2);
		head.path.add(temp3);
		head.path.add(temp4);
		temp2.path.add(temp5);
		temp3.path.add(temp6);
		temp3.path.add(temp7);
		temp3.path.add(temp8);
		temp4.path.add(temp8);
		temp4.path.add(temp9);
		temp9.path.add(head);
		
		BFS(head);
	}
	
	public static void BFS(GraphNode head) {
		Queue<GraphNode> q = new LinkedList<GraphNode>();
		head.visited = true;
		q.add(head);
		while (!q.isEmpty()) {
			GraphNode temp = q.remove();
			System.out.print(temp.data);
			for (GraphNode node : temp.path) {
				if (!node.visited) {
					node.visited = true;
					q.add(node);
				}
			}
		}
	}
}
