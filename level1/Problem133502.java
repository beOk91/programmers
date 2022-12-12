package level1;

import java.util.Arrays;
import java.util.Stack;
public class Problem133502 {
	public static void main(String[] args) {
		System.out.println(solution2(new int[] {1, 3, 2, 1, 2, 1, 3, 1, 2}));

	}
	public static int solution(int[] ingredient) {
        int answer = 0;
        String s = Arrays.toString(ingredient).replace(", ","").replace("[","").replace("]","");
        while(s.contains("1231")){
        	s=s.replaceFirst("1231", "");
        	System.out.println(s);
        	answer++;
        }
        return answer;
    }
	public static int solution2(int [] ingredient) {
		int answer = 0;
		Stack<Integer>st = new Stack<Integer>();
		for(int i=0;i<ingredient.length;i++) {
			st.push(ingredient[i]);
			while(st.size()>=4 && st.peek()==1) {
				String t="";
				for(int j=0;j<4;j++) {
					t=st.pop()+t;
				}
				if(!t.equals("1231")) {
					for(int j=0;j<4;j++) {
						st.push(Integer.parseInt(t.charAt(j)+""));
					}
					break;
				}else {answer++;}
			}
		}
		return answer;
	}
}
