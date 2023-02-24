package level0;

public class Problem120838 {
	public String solution(String letter) {
        String answer = "";
        String morse []= {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        String [] letterArr = letter.split(" ");
        for(int i=0;i<letterArr.length;i++){
            for(int j=0;j<morse.length;j++){
                if(morse[j].equals(letterArr[i]))
                    answer+=(char)(97+j)+"";
            }
        }
        return answer;
    }
}
