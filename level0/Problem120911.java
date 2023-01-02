package level0;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Problem120911 {
	public String solution(String my_string) {
		String ms = my_string.toLowerCase();
		String[] answer = ms.split("");
		Arrays.sort(answer);
		return Arrays.stream(answer).collect(Collectors.joining());
	}
}
