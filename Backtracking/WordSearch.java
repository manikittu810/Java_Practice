package InterviewPrep.Backtracking;
import java.util.Scanner;

public class WordSearch {
    static boolean[][] visited;
    public static boolean wordSearch(char[][] a,String word){
        int n= a.length;
        int m = a[0].length;

        visited = new boolean[n][m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(word.charAt(0) == a[i][j] && backTrack(i,j,0,a,word)){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean backTrack(int i,int j, int index, char[][] a,String word){

        if(word.length() == index){
            return true;
        }

        if(i<0 || j<0 || i>=a.length || j>=a[i].length|| visited[i][j] || a[i][j]==word.charAt(index)){
            return false;
        }
        visited[i][j] = true;

        if(
                        backTrack(i+1,j,index+1,a,word) ||
                        backTrack(i-1,j,index+1,a,word) ||
                        backTrack(i,j+1,index+1,a,word) ||
                        backTrack(i,j-1,index+1,a,word)
        ){
            return true;
        }
        visited[i][j] = false;
        return false;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            int m = sc.nextInt();
            char[][] a = new char[n][m];
            String w = sc.next();
            for(int k =0;k<n;k++){
                for(int j =0;j<m;j++){
                    a[k][j] = sc.next().charAt(0);
                }
            }
            boolean res = wordSearch(a,w);
            System.out.println(res);
        }
    }
}

//INPUT
//1
//        3
//        4
//        F I N D
//        F R E I
//        N O D E
//        Q T E S