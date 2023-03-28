package level0;
import java.math.BigInteger;
public class Problem120840 {
	public int solution(int balls, int share) {
        if(balls == share) return 1;
        BigInteger answer = new BigInteger("1");
        for(int i=balls;i>balls-share;i--){
            answer=answer.multiply(new BigInteger((i+"")));
        }
        for(int i=share;i>1;i--){
            answer=answer.divide(new BigInteger((i+"")));
        }
        return answer.intValue();
    }
}
