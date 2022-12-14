package level0;

import java.util.Arrays;

public class Problem120849 {
	public String solution(String my_string) {
        String answer = "";
        String[] vowel = new String[]{"a","e","i","o","u"};
        for(int i=0;i<my_string.length();i++){
        	if(!Arrays.asList(vowel).contains(my_string.charAt(i)+"")) {
        		answer+=my_string.charAt(i);
        	}
        }
        return answer;
    }
	public String solution2(String my_string) {
        my_string.replaceAll("[aeiou]", "");
        return my_string.replaceAll("[aeiou]", "");
    }
}
