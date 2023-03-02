package level1;

public class Problem134240 {
	public String solution(int[] food) {
        String answer="0";
        String temp="";
        for(int i=0;i<food.length;i++){
            for(int j=0;j<food[i]/2;j++){
                temp+=String.valueOf(i);
            }
        }
        return temp+answer+new StringBuffer(temp).reverse();
    }
}
