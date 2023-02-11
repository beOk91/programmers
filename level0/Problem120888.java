package level0;

public class Problem120888 {
	public String solution(String my_string) {
        boolean arr[]=new boolean[123];
        String answer = "";
        for(int i=0;i<my_string.length();i++){
            char temp = my_string.charAt(i);
            if(!arr[(int)my_string.charAt(i)]){
                answer+=my_string.charAt(i);
                arr[(int)my_string.charAt(i)]=true;
            }
        }
        return answer;
    }
}
