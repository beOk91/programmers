package level0;

public class Problem120869 {
	public int solution(String[] spell, String[] dic) {
        int answer = 0;
        for(int i=0;i<dic.length;i++){
            if(dic[i].length()!=spell.length) continue;
            for(int j=0;j<spell.length;j++){
                dic[i]=dic[i].replaceFirst(spell[j],"");
            }
        }
        for(int i=0;i<dic.length;i++){
            if(dic[i].equals("")) return 1;
        }
        return 2;
    }
}
