package level1;

public class Problem67256 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = { 7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2 };
		String hand = "left";

		System.out.println(solution(numbers, hand));
	}

	public static String solution(int[] numbers, String hand) {
		int keypad[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, { -1, 0, -1 } };
		String answer = "";
		int l_x = 0, l_y = 3;
		int r_x = 2, r_y = 3;
		for (int number : numbers) {
			if (number == 1 | number == 4 | number == 7) {
				answer += "L";
				for (int i = 0; i < 4; i++) {
					for (int j = 0; j < 3; j++) {
						if (keypad[i][j] == number) {
							l_x = j; l_y = i; break;
						}
					}
				}
			} else if (number == 3 | number == 6 | number == 9) {
				answer += "R";
				for (int i = 0; i < 4; i++) {
					for (int j = 0; j < 3; j++) {
						if (keypad[i][j] == number) {
							r_x = j; r_y = i; break;
						}
					}
				}
			} else {
				int t_x = 0; int t_y = 0;
				for (int i = 0; i < 4; i++) {
					for (int j = 0; j < 3; j++) {
						if (keypad[i][j] == number) {
							t_x = j; t_y = i; break; //2,5,8,0 좌표
						}
					}
				}
				int t_l = Math.abs(t_x - l_x) + Math.abs(t_y - l_y);
				int t_r = Math.abs(t_x - r_x) + Math.abs(t_y - r_y);
				if (t_l > t_r) {
					answer += "R"; r_x = t_x; r_y = t_y;
				} else if (t_l < t_r) {
					answer += "L"; l_x = t_x; l_y = t_y;
				} else {
					if (hand.equals("right")) {
						answer += "R"; r_x = t_x; r_y = t_y;
					} else {
						answer += "L"; l_x = t_x; l_y = t_y;
					}
				}
			}
		}
		return answer;
	}

}
