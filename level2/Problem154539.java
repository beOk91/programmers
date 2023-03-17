package level2;

import java.util.Stack;

public class Problem154539 {
	 public int[] solution(int[] numbers) {
	        int[] answer = new int[numbers.length];
	        Stack <Integer> stack=new Stack<>();
	        for(int i=numbers.length-1;i>=0;i--){
	            while(stack.size()!=0){
	                if(stack.peek()>numbers[i]){
	                    answer[i]=stack.peek();
	                    break;
	                }else{
	                    stack.pop();
	                }
	            }
	            if(stack.size()==0) answer[i]=-1;
	            stack.push(numbers[i]);
	            
	        }
	        return answer;
	    }
}
