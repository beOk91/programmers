package level0;

public class Problem120886 {
	public int solution(String before, String after) {
        int []arr =new int[26];
        for(int i=0;i<before.length();i++){
            arr[(int)before.charAt(i)-97]++;
            arr[(int)after.charAt(i)-97]--;
        }
        for(int i=0;i<26;i++){
            if(arr[i]!=0) return 0;
        }
        return 1;
    }
}
