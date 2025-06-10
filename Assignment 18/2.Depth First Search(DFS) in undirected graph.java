import java.util.*;

public class GraphTraversalBFS {
// 	public static List<Integer> bfsOfGraph(int V, List<List<Integer>> adj) {
// 		List<Integer> bfs = new ArrayList<>();
// 		boolean[] visited = new boolean[V];
// 		Queue<Integer> queue = new LinkedList<>();


// 		queue.offer(0);
// 		visited[0] = true;

// 		while (!queue.isEmpty()) {
// 			int node = queue.poll();
// 			bfs.add(node);

// 			for (int neighbor : adj.get(node)) {
// 				if (!visited[neighbor]) {
// 					queue.offer(neighbor);
// 					visited[neighbor] = true;
// 				}
// 			}
// 		}
// 		return bfs;
// 	}
	public static List<Integer> dfsOfGraph(int V, List<List<Integer>> adj) {
		List<Integer> dfs = new ArrayList<>();
		boolean[] visited = new boolean[V];
		dfsHelper(0, adj, visited, dfs);
		return dfs;
	}

	private static void dfsHelper(int node, List<List<Integer>> adj, boolean[] visited, List<Integer> dfs) {
		visited[node] = true;
		dfs.add(node);
		for (int neighbor : adj.get(node)) {
			if (!visited[neighbor]) {
				dfsHelper(neighbor, adj, visited, dfs);
			}
		}
	}


	public static void main(String[] args) {
		int V = 6;
		List<List<Integer>> adj = new ArrayList<>();
		adj.add(Arrays.asList(1, 2));   //[1,2]
		adj.add(Arrays.asList(0, 2, 3));//[0,2,3]
		adj.add(Arrays.asList(0, 1, 4));//[0,1,4]
		adj.add(Arrays.asList(1, 4)); //[1,4]
		adj.add(Arrays.asList(2, 3)); //[2,3]

		for(int i=0; i<adj.size(); i++) {
			System.out.print(i+"-->");
			System.out.println(adj.get(i));
		}

// 		List<Integer> bfs = bfsOfGraph(V, adj);
// 		System.out.println("BFS Traversal: " + bfs);
		
		List<Integer> dfs = dfsOfGraph(V, adj);
        System.out.println("DFS Traversal: " + dfs);

	}
}
