package level2;

import java.util.Arrays;

public class Problem87390 {
	public int[] solution(int n, long left, long right) {
        int[] answer = new int[n*n];
        int[][] temp= new int[n][n];
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                temp[i-1][j-1]=Math.max(i,j);
            }
        }
        for(int i=0;i<n*n;i++){
            answer[i]=temp[i/n][i%n];
        }
        answer = Arrays.copyOfRange(answer, (int)left, (int)right+1);
        return answer;
        
    }
	public int[] solution2(int n, long left, long right) {
        int[] answer = new int[(int)(right-left+1)];
        for(long i=left;i<=right;i++){
            answer[(int)(i-left)]=Math.max((int)(i/n)+1,(int)(i%n)+1);
        }
        return answer;
    }
}
