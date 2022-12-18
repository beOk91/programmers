package level0;

public class Problem120818 {
	public int solution(int price) {
        return price>=500000 ? (int)(price*0.8) : price>=300000 ? (int)(price*0.9) : price>=100000 ? (int)(price*0.95) : price;
    }
}
