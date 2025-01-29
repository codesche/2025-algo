package algo250129;

import java.util.Arrays;

// 체육복 - Lv1
public class Pro42862 {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;

        Arrays.sort(lost);
        Arrays.sort(reserve);

        // 도난 당하지 않은 학생의 수
        answer = n - lost.length;

        // 여벌 체육복을 가져왔지만 도난당한 학생 수
        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if (lost[i] == reserve[j]) {
                    answer++;
                    lost[i] = -1;
                    reserve[j] = -1;
                    break;
                }
            }
        }

        // 도난당했지만 체육복을 빌릴 수 있는 학생 수
        for (int k : lost) {
            for (int j = 0; j < reserve.length; j++) {
                if (k - 1 == reserve[j] || k + 1 == reserve[j]) {
                    answer++;
                    reserve[j] = -1;
                    break;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Pro42862 T = new Pro42862();
        System.out.println(T.solution(5, new int[]{2, 4}, new int[]{1, 3, 5}));
    }

}
