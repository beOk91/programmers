package level0;

public class Problem120824 {
	public int[] solution(int[] num_list) {
        int[] answer = new int[2];
        for(int i=0;i<num_list.length;i++) {
        	if(num_list[i]%2==0) {
        		num_list[0]++;
        	}else {
        		num_list[1]++;
        	}
        }
        return answer;
    }
}
