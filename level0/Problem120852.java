package level0;

import java.util.ArrayList;
import java.util.List;

public class Problem120852 {
	public Integer[] solution(int n) {
        Integer[] answer = {};
        List <Integer> list = new ArrayList<Integer>();
        int factor = 2;
        while(n!=1){
            if(n%factor==0){
            	list.add(factor);
            	while(n%factor==0) {
                    n/=factor;            		
            	}
            }else{
            	factor++;    
            }    
        }
        answer=list.toArray(new Integer[list.size()]);
        return answer;
    }
}
