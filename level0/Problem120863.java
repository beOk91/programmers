package level0;

public class Problem120863 {
	public static void main(String[] args) {
		System.out.println(solution("5+7"));
	}

	public static String solution(String polynomial) {
        polynomial = polynomial.replaceAll(" ", "");
        String [] value = polynomial.split("\\+");
        String x_val="0", n_val="0";
        for(int i=0;i<value.length;i++){
            if(value[i].contains("x")){
            	if(value[i].equals("x")) x_val=(Integer.parseInt(x_val)+1)+"";
            	else {
            		x_val=(Integer.parseInt(x_val)+Integer.parseInt(value[i].substring(0, value[i].length()-1)))+"";
            	}
        	}else{
            	n_val=(Integer.parseInt(n_val)) + Integer.parseInt(value[i])+"";
            }
        }
        return x_val.equals("0") ? n_val :  ((x_val.equals("1") ? "x" : x_val+"x")+ "" + (n_val.equals("0") ? "" :  " + "+n_val));
    }

}
