package level1;

import java.util.Arrays;

public class Problem12933 {
	public long solution(long n) {
		char[] temp=(n+"").toCharArray();
		Arrays.sort(temp);
        return Long.parseLong(new StringBuilder(new String(temp)).reverse().toString());
    }
}
