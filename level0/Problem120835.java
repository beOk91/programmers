package level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Problem120835 {

	public int[] solution(int[] emergency) {
		int[] answer = new int[emergency.length];
		ArrayList list = (ArrayList<Integer>) Arrays.stream(emergency).boxed().collect(Collectors.toList());
		Collections.sort(list, Comparator.reverseOrder());
		for(int i=0;i<emergency.length;i++) {
			answer[i]=list.indexOf(emergency[i])+1;
		}
		return answer;
	}
	
	public int[] solution2(int[] emergency) {
		int[] answer = new int[emergency.length];
		for(int i=0;i<emergency.length;i++) {
			int cnt=0;
			for(int j=0;j<emergency.length;j++) {
				if(emergency[i]<=emergency[j]) cnt++;
			}
			answer[i]=cnt; cnt=0;
		}
		return answer;
	}
}
