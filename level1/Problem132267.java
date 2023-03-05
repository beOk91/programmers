package level1;

public class Problem132267 {
	public int solution(int a, int b, int n) {
        int answer = 0;
        while(n>=a){
            answer+=(n/a)*b;
            n=n%a+(n/a)*b;
        }
        return answer;
    }
}
