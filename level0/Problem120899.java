package level0;

import java.util.Arrays;

public class Problem120899 {
	public int[] solution(int[] array) {
        return new int[] { Arrays.stream(array).max().getAsInt(), Arrays.binarySearch(array, Arrays.stream(array).max().getAsInt())};
    }
}
