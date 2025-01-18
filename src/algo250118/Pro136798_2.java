package algo250118;

// 기사단원의 무기 - Lv1 (2번째 풀이)
public class Pro136798_2 {
    public int solution(int number, int limit, int power) {
        int answer = 0;

        // 이중 for문 통해 약수의 개수를 answer에 누적해서 더하기
        for (int i = 1; i <= number; i++) {
            int count = 0;

            // 약수의 개수 세기
            for (int j = 1; j*j <= i; j++) {
                if (j * j == i) {
                    count++;
                } else if (i % j == 0) {
                    count += 2;
                }
            }

            // limit을 넘어가는 약수의 개수들은 power로 변환하여 더하기
            if (count > limit) {
                count = power;
            }

            answer += count;
        }

        return answer;
    }

    public static void main(String[] args) {
        Pro136798_2 T = new Pro136798_2();
        System.out.println(T.solution(5, 3, 2));
    }

}
