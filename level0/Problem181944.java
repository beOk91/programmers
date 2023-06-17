package level0;

import java.util.Scanner;

public class Problem181944 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(n+" is "+ (n%2==0 ? "even" : "odd"));
    }
}
