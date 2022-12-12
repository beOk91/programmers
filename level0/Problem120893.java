package level0;

public class Problem120893 {
	public String solution(String my_string) {
		String answer = "";
		for(int i=0;i<my_string.length();i++) {
			if(Character.isLowerCase(my_string.charAt(i))) {
				answer+=(my_string.charAt(i)+"").toUpperCase();
			}else {
				answer+=(my_string.charAt(i)+"").toLowerCase();
			}
		}
		return answer;
	}
}
