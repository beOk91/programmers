package level0;

public class Problem120816 {
	public static void main(String[] args) {

	}
	public static int solution(int slice, int n) {
        return n%slice==0 ? n/slice : n/slice+1;
    }
}
