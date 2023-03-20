package level0;

public class Problem120902 {
	public int solution(String my_string) {
        String [] string_arr = my_string.split(" ");
        int answer = Integer.parseInt(string_arr[0]);
        for(int i=1;i<string_arr.length;i++){
            if(string_arr[i].equals("+")){
                answer+=Integer.parseInt(string_arr[++i]);
            }else{
                answer-=Integer.parseInt(string_arr[++i]);
            }
        }
        return answer;
    }
}
