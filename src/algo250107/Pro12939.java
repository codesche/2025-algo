package algo250107;

import java.util.Arrays;

// 최댓값과 최솟값
public class Pro12939 {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        String[] arr = s.split(" ");
        Arrays.sort(arr);

        int max = Integer.parseInt(arr[0]);
        int min = Integer.parseInt(arr[0]);

        for (String value : arr) {
            int realMax = Integer.parseInt(value);
            int realMin = Integer.parseInt(value);
            if (max < Integer.parseInt(value)) {
                max = realMax;
            }

            if (min > Integer.parseInt(value)) {
                min = realMin;
            }
        }

        sb.append(min).append(" ").append(max);

        return sb.toString();
    }
}
