package level1;

public class Problem86051 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int solution(int[] numbers) {
		int answer=45;
		for(int i=0;i<numbers.length;i++) {
			answer-=numbers[i];
		}
        return answer;
    }

}
