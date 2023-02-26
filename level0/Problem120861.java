package level0;

public class Problem120861 {
	public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[]{0,0};
        for(int i=0;i<keyinput.length;i++){
            if("left".equals(keyinput[i])){
                if(answer[0]>board[0]/2*-1){
                    answer[0]-=1;
                }
            }else if("right".equals(keyinput[i])){
                if(answer[0]<board[0]/2){
                    answer[0]+=1;
                }
            }else if("up".equals(keyinput[i])){
                if(answer[1]<board[1]/2){
                    answer[1]+=1;
                }
            }else{
                if(answer[1]>board[1]/2*-1){
                    answer[1]-=1;
                }
            }
        }
        return answer;
    }
}
