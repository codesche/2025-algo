package algo250111;

import java.util.Arrays;

// 가장 가까운 같은 글자 - Lv1
public class Pro142086 {
    public int[] solution(String s) {
        int length = s.length();
        int[] answer = new int[length];
        String[] arr = s.split("");
        answer[0] = -1;                         // 처음 나온 글자는 같은 글자 없으므로 -1로 처리

        for (int i = 1; i < length; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i].equals(arr[j])) {
                    answer[i] = i - j;
                }
            }

            if (answer[i] == 0) {
                answer[i] = -1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Pro142086 T = new Pro142086();
        System.out.println(Arrays.toString(T.solution("banana")));
    }
}
