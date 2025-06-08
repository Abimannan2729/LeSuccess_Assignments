import java.util.*;

public class RatInMaze {
    static List<String> result;
    static boolean[][] visited;
    static int[][] directions = {{1, 0}, {0, -1}, {0, 1}, {-1, 0}};
    static char[] dirChar = {'D', 'L', 'R', 'U'};

    public static List<String> findPath(int[][] maze, int n) {
        result = new ArrayList<>();
        visited = new boolean[n][n];
        if (maze[0][0] == 0 || maze[n - 1][n - 1] == 0) return result;

        visited[0][0] = true;
        backtrack(0, 0, "", maze, n);
        return result;
    }

    private static void backtrack(int x, int y, String path, int[][] maze, int n) {
        if (x == n - 1 && y == n - 1) {
            result.add(path);
            return;
        }

        for (int i = 0; i < 4; i++) {
            int newX = x + directions[i][0];
            int newY = y + directions[i][1];

            if (newX >= 0 && newY >= 0 && newX < n && newY < n &&
                maze[newX][newY] == 1 && !visited[newX][newY]) {
                visited[newX][newY] = true;
                backtrack(newX, newY, path + dirChar[i], maze, n);
                visited[newX][newY] = false;
            }
        }
    }

    // Example
    public static void main(String[] args) {
        int[][] maze = {
            {1, 0, 0, 0},
            {1, 1, 0, 1},
            {0, 1, 0, 0},
            {1, 1, 1, 1}
        };
        System.out.println(findPath(maze, 4));
    }
}
