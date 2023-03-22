package level0;

public class Problem120876 {
	public int solution(int[][] lines) {
        int answer = 0;
        int []line_plus=new int[101];
        int []line_minus=new int[101];
        for(int i=0;i<lines.length;i++){
            for(int j=lines[i][0];j<lines[i][1];j++){
                if(j<0){
                    line_minus[j*-1]++;
                }else{
                    line_plus[j]++;
                }
            }
        }
        for(int i=0;i<101;i++){
            if(line_plus[i]>=2) answer++;
            if(line_minus[i]>=2) answer++;
        }
        return answer;
    }
}
