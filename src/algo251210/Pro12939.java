package algo251210;

// 프로그래머스 - Lv2 (최댓값과 최솟값)
// 문자열 출력 - StringBuilder 활용해서 최적화 진행
public class Pro12939 {

    public String solution(String s) {
        String[] array = s.split(" ");
        StringBuilder sb = new StringBuilder();

        // 최댓값, 최솟값 지정
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (String value : array) {
            int num = Integer.parseInt(value);
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        sb.append(min).append(" ").append(max);

        return sb.toString();
    }

}
