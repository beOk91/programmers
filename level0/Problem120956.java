package level0;

import java.util.ArrayList;
import java.util.List;

public class Problem120956 {
	public int solution(String[] babbling) {
        int answer = 0;
        List <String> list=new ArrayList<String>();
        String [] p= new String[]{"aya", "ye", "woo", "ma"}; 
        for(int i=0;i<4;i++){
            list.add(p[i]);
            for(int j=0;j<4;j++){
                if(i!=j) list.add(p[i]+p[j]);
                for(int k=0;k<4;k++){
                    if(i!=j && j!=k) list.add(p[i]+p[j]+p[k]);
                    for(int l=0;l<4;l++){
                        if(i!=j && j!=k && k!=l){
                            list.add(p[i]+p[j]+p[k]+p[l]);
                        }
                    }
                }
            }
        }
        
        for(int i=0;i<babbling.length;i++){
            if(list.contains(babbling[i])) answer++;
        }
        return answer;
    }
	public int solution2(String[] babbling) {
        int answer = 0;
        for(int i=0;i<babbling.length;i++) {
        	babbling[i]=babbling[i].replace("aya","0");
        	babbling[i]=babbling[i].replace("ye","0");
        	babbling[i]=babbling[i].replace("woo","0");
        	babbling[i]=babbling[i].replace("ma","0");
            babbling[i]=babbling[i].replace("0","");
        	if(babbling[i].isEmpty()) answer++;
        }
        return answer;
    }
}
