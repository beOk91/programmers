package level1;

import java.util.HashMap;
import java.util.Map;

public class Problem178871 {
	public String[] solution(String[] players, String[] callings) {
        String[] answer = {};
        Map<String, Integer> map = new HashMap<String,Integer>();
        for(int i=0;i<players.length;i++){
            map.put(players[i],i);
        }
        
        for(String call: callings){
            int idx = map.get(call)-1;
            String p = players[idx];
            players[idx]= call;
            players[idx+1]=p;
            map.put(call,idx);
            map.put(p,idx+1);
        }
        answer=players.clone();
        return answer;
    }
}
