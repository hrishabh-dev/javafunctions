package ratproblem;
public class mazePath {
    static  int counter=1;
    public static void maze(int sr, int sc, int er, int ec,String s,boolean[][]visited) {
     
        if (sr<0||sc<0){
            return;
        }

        if (sr>er||sc>ec){
            return;
        };
        if (visited[sr][sc]==true){
            return;
            
        }
        if (sr==er&&sc==ec){
            System.out.println(s);
            counter++;
            return;
        }
        visited[sr][sc]=true;
        //go down
        maze(sr+1,sc,er,ec,s+"D",visited);
        //go right
        maze(sr,sc+1,er,ec,s+"R",visited);
        //go up
        maze(sr-1,sc,er,ec,s+"U",visited);
        //go left
        maze(sr,sc-1,er,ec,s+"L",visited);
        //backtracking
        visited[sr][sc]=false;

    }
    public static void main (String[]args){
        int rows=3;
        int cols=3;
        boolean [][] visited=new boolean[rows][cols];
        maze(0,0,rows-1,cols-1,"",visited);
        System.out.println("Total ways  rat can go :-"+(counter-1));

    }
    
}
