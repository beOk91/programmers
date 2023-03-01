package level0;

public class Problem120878 {
	public int solution(int a, int b) {
        int minValue = Math.max(a,b);
        for(int i=2;i<=minValue;i++){
            while(a%i==0 && b%i==0){
                a/=i;
                b/=i;
            }
        }
        while(b%2==0 || b%5==0){
            if(b%2==0) b/=2;
            if(b%5==0) b/=5;
        }
        
        return b==1? 1:2;
    }
}
