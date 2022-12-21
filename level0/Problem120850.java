package level0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Problem120850 {
	public Integer[] solution(String my_string) {
        List <Integer> list = new ArrayList<Integer>();
        for(int i=0;i<my_string.length();i++){
            if(!Character.isDigit(my_string.charAt(i))){
                list.add((int)my_string.charAt(i)-48);
            }
        }
        Collections.sort(list);
        return list.toArray(new Integer[0]);
    }
}
