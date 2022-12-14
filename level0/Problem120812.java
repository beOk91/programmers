package level0;

import java.util.HashMap;
import java.util.Map;

public class Problem120812 {
	public int solution(int[] array) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int answer = 0, maxVal = -1, maxValCnt = 0;
		for (int i = 0; i < array.length; i++) {
			int t = map.getOrDefault(array[i], 0) + 1;
			map.put(array[i], t);
			if(maxValCnt<t) {maxVal = array[i]; maxValCnt = t;}
		}
		for(Integer i: map.keySet()) {
			if(map.get(i)==maxValCnt && i!=maxVal) return -1;
		}
		return maxVal;
	}
}