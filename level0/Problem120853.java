package level0;

import java.util.Stack;

public class Problem120853 {
	public int solution(String s) {
        Stack <String>stack=new Stack<>();
        String []list = s.split(" ");
        int answer = 0;
        for(int i=0;i<list.length;i++){
            if(list[i].equals("Z")) stack.pop();
            else{
                stack.push(list[i]);
            }
        }
        
        while(stack.size()!=0){
            answer+=Integer.parseInt(stack.pop());
        }
        
        return answer;
    }
}
