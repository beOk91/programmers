package level0;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Problem120896 {
	public String solution(String s) {
		String answer = "";
		char s2[] = s.toCharArray();
		Arrays.sort(s2);
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < s.length(); i++) {
			map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
		}
		for (int i = 0; i < s2.length; i++) {
			if (map.get(s2[i]) == 1) answer += s2[i] + "";
		}
		return answer;
	}
}
