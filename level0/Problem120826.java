package level0;

public class Problem120826 {
	public String solution(String my_string, String letter) {
        String answer = my_string.replaceAll(letter,"");
        return answer;
    }
}
