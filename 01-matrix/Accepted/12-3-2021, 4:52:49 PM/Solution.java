// https://leetcode.com/problems/01-matrix

class Solution {
   private static class Pair {
        int x;
        int y;

        Pair(int x, int y) {
          this.x = x;
          this.y = y;
        }  
    }
    
    public static int[][] calls = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};
    
    public int[][] updateMatrix(int[][] matrix) {
          Queue<Pair> que = new ArrayDeque<>();
          for(int i = 0; i < matrix.length; i++) {
              for(int j = 0; j < matrix[0].length; j++) {
                  if(matrix[i][j] == 1)
                      matrix[i][j] = -1;
                  else
                      que.add(new Pair(i, j));
              }
          }

          while(que.size() > 0) {
              Pair pq = que.remove();
              for(int i = 0; i < 4; i++) {
                  int nr = pq.x + calls[i][0];
                  int nc = pq.y + calls[i][1];
                  if(nr >= 0 && nc >= 0 && nr < matrix.length && nc < matrix[0].length && matrix[nr][nc] == -1) {
                      matrix[nr][nc] = matrix[pq.x][pq.y] + 1;
                      que.add(new Pair(nr, nc));
                  }
              }
          }
          return matrix;
    }
}