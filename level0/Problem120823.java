package level0;

import java.util.Scanner;

public class Problem120823 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String star = "";
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				star += "*";
			}
			star += "\n";
		}
		System.out.println(star);
	}
}
