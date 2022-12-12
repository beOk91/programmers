package level1;

public class Problem131705 {
	public static void main(String[] args) {
		System.out.println(solution(new int[] { -3, -2, -1, 0, 1, 2, 3 }));
	}

	public static int solution(int[] number) {
		int answer = 0;
		for(int i=0;i<number.length;i++) {
            if(i+1<number.length){
                for(int j=i+1;j<number.length;j++) {
                    if(j+1<number.length){
                        for(int k=j+1;k<number.length;k++) {
                            if(number[i]+number[j]+number[k]==0) answer++;
                        }
                    }
                }
            }
		}
		return answer;
	}
}
