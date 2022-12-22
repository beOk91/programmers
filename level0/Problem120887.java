package level0;

public class Problem120887 {
	public int solution(int i, int j, int k) {
        String temp = "";
        for(int l=i;l<=j;l++){
            temp+=l+"";
        }
        return temp.length()-temp.replaceAll(k+"","").length();
    }
}
