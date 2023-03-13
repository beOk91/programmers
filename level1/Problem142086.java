package level1;
import java.util.HashMap;
import java.util.Map;

public class Problem142086 {
	public static void main(String[] args) {
		System.out.println(solution("baaab"));
	}

	public static int[] solution(String s) {
		int[] answer = new int[s.length()];
		int temp[] = new int[] {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
		for (int i = 0; i < s.length(); i++) {
			if(temp[(int)s.charAt(i)-97]==0) {
                answer[i]=-1; 
                temp[(int)s.charAt(i)-97]=i;
            }else {
				answer[i]=i-temp[(int)s.charAt(i)-97];
                temp[(int)s.charAt(i)-97]=i;
			}
		}
		for(int i=0;i<answer.length;i++) {
			System.out.println(answer[i]);
		}
		return answer;
	}
	
	public static int[] solution2(String s) {
		int[] answer = new int[s.length()];
		Map <Character,Integer> map =new HashMap<Character,Integer>();
		for(int i=0;i<s.length();i++) {
			answer[i]= i - map.getOrDefault(s.charAt(i), i+1);
			map.put(s.charAt(i), i);
		}
		return answer;
	}
}
