package level0;

import java.util.Arrays;

public class Problem120880 {
	public int[] solution(int[] numlist, int n) {
        Arrays.sort(numlist);
        int[] answer = new int[numlist.length];
        int l_idx= 0;
        for(int i=0;i<numlist.length;i++){
            if(Math.abs(numlist[i]-n)<Math.abs(numlist[l_idx]-n)){
                l_idx=i;
            }
        }
        int r_idx = l_idx+1;
        int idx=0;
        while(idx!=numlist.length){
            if(l_idx>=0 && r_idx<=numlist.length-1){
                if(numlist[l_idx]-n==0){
                    answer[idx++]=numlist[l_idx--];
                }else if(numlist[r_idx]-n==0){
                    answer[idx++]=numlist[r_idx--];
                }else if(Math.abs(n-numlist[l_idx])>=Math.abs(numlist[r_idx]-n)){
                    answer[idx++]=numlist[r_idx++];
                }else{
                    answer[idx++]=numlist[l_idx--];
                }
            }else if(l_idx>=0){
                answer[idx++]=numlist[l_idx--];
            }else{
                answer[idx++]=numlist[r_idx++];
            }
        }
        return answer;
    }
}
