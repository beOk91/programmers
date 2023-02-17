package level1;

public class Problem159994 {
	public static void main(String[] args) {

	}
	
	public String solution(String[] cards1, String[] cards2, String[] goal) {
        int card1Idx=0,card2Idx=0;
        for(int i=0;i<goal.length;i++) {
        	if(card1Idx<cards1.length && goal[i].equals(cards1[card1Idx])) {
        		card1Idx++;
        	}else if(card2Idx<cards2.length && goal[i].equals(cards2[card2Idx])) {
        		card2Idx++;
        	}else {
        		return "No";
        	}
        }
        return "Yes";
    }
}
