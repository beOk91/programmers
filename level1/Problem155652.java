package level1;

public class Problem155652 {
	public String solution(String s, String skip, int index) {
        String answer = "";
        for(int i=0;i<s.length();i++) {
        	char temp = s.charAt(i);
        	for(int j=0;j<index;j++) {
                temp+=1;
                if(temp>122) temp -=26;
        		if(skip.contains(String.valueOf(temp))) j--;
        	}
            answer+=temp;
        }
        return answer;
    }
}
