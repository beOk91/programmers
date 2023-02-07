package src.level0;

public class Problem120866 {
    public static void main(String args[]){

    }

    public int solution(int[][] board) {
        int answer = 0;
        int direction[][]=new int[][]{{-1,-1},{-1,0},{-1,1},{0,-1},{0,0},{0,1},{1,-1},{1,0},{1,1}};
        boolean [][] temp = new boolean[board.length][board.length];
        for(int i=  0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                if(board[i][j]==1){
                    for(int[] dir: direction){
                        int mY=i+dir[0];
                        int mX=j+dir[1];
                        if(mY==-1 || mY==board.length || mX==-1 || mX==board.length) continue;
                        temp[mY][mX]= true;
                    }
                }
            }
        }
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                if(!temp[i][j]) answer++;
            }
        }
        return answer;
    }
}

/*
temp[i][j]=true;
if(i-1>=0) temp[i-1][j]=true;
if(j-1>=0) temp[i][j-1]=true;
if(i+1<board.length) temp[i+1][j]=true;
if(j+1<board.length) temp[i][j+1]=true;
if(i-1>=0 && j-1>=0) temp[i-1][j-1]=true;
if(i-1>=0 && j+1<board.length) temp[i-1][j+1]=true;
if(i+1<board.length && j-1>=0) temp[i+1][j-1]=true;
if(i+1<board.length && j+1<board.length) temp[i+1][j+1]=true;
 */
