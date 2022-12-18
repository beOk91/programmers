package level0;

public class Problem120851 {
	public int solution(String my_string) {
        int answer = 0;
        for(int i=0;i<my_string.length();i++) {
        	if(Character.isDigit(my_string.charAt(i))) {
        		answer+=(int)my_string.charAt(i)-48;
        	}
        }
        return answer;
    }
}
