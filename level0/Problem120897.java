package level0;

import java.util.ArrayList;
import java.util.List;

public class Problem120897 {
	public Integer[] solution(int n) {
	    List <Integer> list = new ArrayList<Integer>();
	        Integer[] answer = {};
	        for(int i=1;i<=n;i++){
	            if(n%i==0) list.add(i);
	        }
	        answer=list.toArray(new Integer[0]);
	        return answer;
	    }
}
