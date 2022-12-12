package level0;

public class Problem120848 {
	public int solution(int n) {
        int answer = 1,temp=1;
        while(answer!=n){
            answer*=++temp;
            if(answer>n) { temp-=1; break;}
        }
        return temp;
    }
}
