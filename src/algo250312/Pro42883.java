package algo250312;

import java.util.*;

// 큰 수 만들기 - Lv2 (실패)
public class Pro42883 {
    public String solution(String number, int k) {
        String answer = "";
        List<Integer> list = new ArrayList<>();
        int start = 0;
        int end = start + 1;

        int length = number.length();
        char[] arr = new char[length];                // 배열 선언
        int idx = 0;
        for (char c : number.toCharArray()) {
            arr[idx++] = c;
        }

        StringBuilder sb = new StringBuilder();
        while (start != length - 1) {
            for (int i = 0; i < k - 1; i++) {
                sb.append(arr[start]);
                sb.append(arr[end]);
            }

            list.add(Integer.parseInt(sb.toString()));
            sb = new StringBuilder();

            if (end == length - 1) {
                start++;
                end = start + 1;
            } else {
                end++;
            }
        }

        Collections.sort(list);
        int size = list.size();
        answer = String.valueOf(list.get(size - 1));

        return answer;
    }

    public static void main(String[] args) {
        Pro42883 T = new Pro42883();
        System.out.println(T.solution("1924", 2));
    }
}
