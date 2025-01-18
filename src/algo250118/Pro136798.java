package algo250118;

// 기사단원의 무기 - Lv1 (시간초과)
public class Pro136798 {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        int[] arr = new int[number];

        // 기사단원 배열 생성
        for (int i = 0; i < number; i++) {
            arr[i] = i + 1;
        }

        // 이중 for문 통해 약수의 개수를 answer에 누적해서 더하기
        for (int i = 0; i < number; i++) {
            int count = 0;

            // 약수의 개수 세기
            for (int j = 1; j <= i + 1; j++) {
                if (arr[i] % j == 0) {
                    count++;
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
        Pro136798 T = new Pro136798();
        System.out.println(T.solution(5, 3, 2));
    }
}
