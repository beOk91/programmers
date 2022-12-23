package level0;

public class Problem120912 {
	public int solution(int[] array) {
        int answer = 0;
        for(int i=0;i<array.length;i++){
            answer+=((array[i]+"").length()-(array[i]+"").replaceAll("7","").length());
        }
        return answer;
    }
}
