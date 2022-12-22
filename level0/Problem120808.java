package level0;

public class Problem120808 {
	public int[] solution(int denum1, int num1, int denum2, int num2) {
        int gcd = gcd(Math.max(num1,num2),Math.min(num1,num2));
        int lcm = num1/gcd*num2/gcd*gcd;
        int[] answer=new int[]{lcm/num1*denum1+lcm/num2*denum2,lcm };
        gcd = gcd(Math.max(answer[0],answer[1]),Math.min(answer[0],answer[1]));
        return new int[]{answer[0]/gcd,answer[1]/gcd};
    }
    
    public int gcd(int num1,int num2){
        if(num2==0) return num1;
        return gcd(num2,num1%num2);
    }
}
