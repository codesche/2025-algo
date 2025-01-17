package algo250117;

// 2016년 - Lv1
public class Pro12901 {
    public String solution(int a, int b) {
        String[] day = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        int[] months = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int count = -1;     // 0 ~ 365일

        // 1일, 8일, 15일, 22일, 29일 => 금요일
        // 나머지 0, 나머지 1, 나머지 2, 나머지 3, 나머지 4, 나머지 5, 나머지 6
        for (int i = 0; i < a - 1; i++) {
            count += months[i];
        }

        return day[(count + b) % 7];
    }
}
