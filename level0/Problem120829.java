package level0;

public class Problem120829 {
    public int solution(int angle) {
        return angle>=180 ? 4: angle>90 ? 3 : angle==90 ? 2:1;
    }
}
