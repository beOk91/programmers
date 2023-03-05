package level0;

public class Problem120882 {
	public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        for(int i=0;i<score.length;i++){
            int temp=1;
            for(int j=0;j<score.length;j++){
                if(i!=j && score[i][0]+score[i][1] <score[j][0]+score[j][1]) temp++;
            }
            answer[i]=temp;
        }
        return answer;
    }
}
