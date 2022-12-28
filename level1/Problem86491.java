package level1;

public class Problem86491 {
	public int solution(int[][] sizes) {
        int val1 = 0,val2=0;
        for(int i=0;i<sizes.length;i++) {
        	if(Math.max(sizes[i][0], sizes[i][1]) > val1) val1 = Math.max(sizes[i][0], sizes[i][1]);
        	if(Math.min(sizes[i][0], sizes[i][1]) > val2) val2 = Math.min(sizes[i][0], sizes[i][1]);
        }
        return val1*val2;
    }
}
