package algo250228;

// 나열된 수에서 최솟값과 최댓값 구하기
/*
배열의 몇 번째에 있는지 순서를 찾는다.
반복문을 한번만 사용하여 문제를 해결한다.
 */

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Exercise01 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] numbers = {10, 55, 23, 2, 79, 101, 16, 82, 30, 45};

        int min = numbers[0];
        int max = numbers[0];
        int minPos = 0;
        int maxPos = 0;

        int length = numbers.length;
        for (int i = 0; i < length; i++) {
            if (min > numbers[i]) {
                min = numbers[i];
                minPos = i + 1;
            }

            if (max < numbers[i]) {
                max = numbers[i];
                maxPos = i + 1;
            }
        }

        bw.write("가장 큰 값은 " + max + "이고, 위치는 " + maxPos + "번째 입니다.");
        bw.newLine();
        bw.write("가장 작은 값은 " + min + "이고, 위치는 " + minPos + "번째 입니다.");

        bw.flush();
        bw.close();
    }
}
