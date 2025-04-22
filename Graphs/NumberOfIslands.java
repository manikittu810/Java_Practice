package InterviewPrep.Graphs;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class NumberOfIslands {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0;i<t;i++){
            System.out.println("Enter no. of rows and columns : ");
            int m = sc.nextInt();
            int  n= sc.nextInt();
            sc.nextLine();
            char[][] grid = new char[m][n];
            System.out.println("Enter the grid one row per line : ");
            for(int k = 0;k<m;k++){
                String rowInput = sc.nextLine();
                for(int l =0;l<n;l++){
                    grid[k][l]= rowInput.charAt(l);
                }
            }
            int NumberofIslands = countIslands(grid);
            System.out.println(NumberofIslands);
        }
    }

    private static int countIslands(char[][] grid) {
        if(grid.length==0 || grid == null){return 0;}
        int m = grid.length;
        int n =grid[0].length;
        int count =0;
        boolean[][] visited = new boolean[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(!visited[i][j] && grid[i][j]=='1'){
                    BFSIslands(grid,i,j,visited);
                    count++;
                }
            }
        }
        return count;
    }

    private static void BFSIslands(char[][] grid, int x, int y, boolean[][] visited) {
        int[] dx = {-1,1,0,0};
        int[] dy = {0,0,1,-1};

        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{x,y});
        visited[x][y] = true;
        while(!q.isEmpty()){
            int[] cur= q.poll();
            int curX= cur[0];
            int curY = cur[1];
            for(int f = 0;f<4;f++){
                int newX = curX+dx[f];
                int newY = curY+dy[f];

                if(newX >= 0
                        && newY >= 0
                        && newX < grid.length
                        && newY < grid[0].length
                        && !visited[newX][newY]
                        && grid[newX][newY] == '1'){

                    visited[newX][newY] = true;
                    q.add(new int[]{newX,newY});
                }
            }
        }
    }
}
