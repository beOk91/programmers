package level0;

import java.util.ArrayList;
import java.util.List;

public class Problem120905 {
	public Integer[] solution(int n, int[] numlist) {
        List<Integer> list = new ArrayList<Integer>();
        for(int i=0;i<numlist.length;i++){
            if(numlist[i]%n==0){
                list.add(numlist[i]);
            }
        }
        return list.toArray(new Integer[0]);
    }
}
