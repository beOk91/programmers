package level0;

public class Problem120904 {
	public int solution(int num, int k) {
        for(int i=0;i<(num+"").length();i++){
            if((num+"").charAt(i)==(char)(k+48)) return i+1;
        }
        return -1;
    }
}
