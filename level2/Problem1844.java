package level2;

import java.util.LinkedList;
import java.util.Queue;

public class Problem1844 {
	
	int result =Integer.MAX_VALUE;
    //dfs풀
	public int solution(int[][] maps) {
        int[][] visited =new int[maps.length][maps[0].length];
        dfs(0,0,maps,visited);
        return result == Integer.MAX_VALUE ? -1 : result;
    }
    
     public void dfs(int y,int x,int[][] maps, int visited[][]){
    	if(y==maps.length-1 && x==maps[0].length-1) {
            result = Math.min(visited[y][x]+1,result);
        }
        if(y+1<visited.length && maps[y+1][x]==1 && visited[y+1][x]==0){
            visited[y+1][x] = visited[y][x]+1;
            dfs(y+1,x,maps,visited);
            visited[y+1][x] = 0;
        }
        if(x+1<visited[0].length && maps[y][x+1]==1 && visited[y][x+1]==0){
            visited[y][x+1] = visited[y][x]+1;
            dfs(y,x+1,maps,visited);
            visited[y][x+1] = 0;
        }
        if(y-1>=0 && maps[y-1][x]==1 && visited[y-1][x]==0){
            visited[y-1][x] = visited[y][x]+1;
            dfs(y-1,x,maps,visited);
            visited[y-1][x] = 0;
        }
        if(x-1>=0 && maps[y][x-1]==1 && visited[y][x-1]==0){
            visited[y][x-1] = visited[y][x]+1;
            dfs(y,x-1,maps,visited);
            visited[y][x-1] = 0;
        }
    }
     //dfs 풀
     public int solution2(int[][] maps) {
		 int answer = -1;
		 boolean[][] visited =new boolean[maps.length][maps[0].length];
		 Queue<Integer> y_queue =new LinkedList<Integer>();
		 Queue<Integer> x_queue =new LinkedList<Integer>();
         Queue<Integer> result = new LinkedList<Integer>();
		 x_queue.add(0); y_queue.add(0); result.add(1);
		 
		 while(!x_queue.isEmpty()) {
			 int y = y_queue.poll();
			 int x = x_queue.poll();
             int r = result.poll();
			 if(y==maps.length-1 && x==maps[0].length-1) {answer=r; break;}
			 for(int []arr : new int[][] {{0,1},{1,0},{-1,0},{0,-1}}) {
				 int ny = y+arr[0]; 
                 int nx = x+arr[1];
				 if(ny>=0 && nx>=0 && ny<maps.length && nx <maps[0].length) {
                     if(!visited[ny][nx] && maps[ny][nx]!=0){
                         visited[ny][nx]=true;  y_queue.add(ny); x_queue.add(nx); result.add(r+1);
                     }
				 }
			 }
		 }
		 return answer;
	 }
}
