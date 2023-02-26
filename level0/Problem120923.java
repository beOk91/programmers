package level0;

public class Problem120923 {
	public int[] solution(int num, int total) {
        int[] answer = new int[num];
        for(int i=num*-1;i<=1000;i++){
            int temp=0;
            int idx=0;
            for(int j=i;j<i+num;j++){
                temp+=j;
                answer[idx++]=j;
            }
            if(idx==num && temp==total) break;
        }
        return answer;
    }
	public int[] solution2(int num, int total) {
        int[] answer = new int[num];
        int a = total/num+ (1-num)/2;
        System.out.println(a);
        for(int i=0;i<num;i++) {
        	answer[i]=a+i;
        }
        return answer;
    }
}
