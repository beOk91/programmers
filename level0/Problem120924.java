package src.level0;

public class Problem120924 {
    public static void main(String args[]){
        System.out.println("hello world");
    }

    public static int solution(int[] common) {
        if(common[1]-common[0] == common[2]-common[1]){
            return common[common.length-1]+common[2]-common[1];
        }else{
            return common[common.length-1]*common[1]/common[0];
        }
    }
}
