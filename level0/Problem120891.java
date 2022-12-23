package level0;

public class Problem120891 {
	public int solution(int order) {
        int answer = 0;
        for(int i=0;i<(order+"").length();i++){
            if((order+"").charAt(i)=='3' ||(order+"").charAt(i)=='6' || (order+"").charAt(i)=='9') answer++;
        }
        return answer;
    }
}
