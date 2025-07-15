package algo250716;

// 프로그래머스 - 푸드 파이트 대회 (Lv1)
public class Pro134240 {
    public String solution(int[] food) {
        StringBuilder sb = new StringBuilder();

        // 첫 번째 요소인 물은 고려하지 않기 때문에 1번째부터 조건을 고려
        for (int i = 1; i < food.length; i++) {
            sb.append(String.valueOf(i).repeat(food[i] / 2));
        }

        // 출력된 문자열 + "0" + 출력된 문자열의 역순
        return sb.toString() + "0" + sb.reverse().toString();
    }
}
