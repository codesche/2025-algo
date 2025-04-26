package algo250426;

import java.io.*;
import java.util.*;

// [해시] 배열 안에서 두 수의 합 찾기
public class FindTwoSumEx {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int target = Integer.parseInt(br.readLine());
        String answer = "";

        int left = arr.length - 2;
        int right = arr.length - 1;
        while (true) {
            if (target == arr[right] + arr[left]) {
                answer = "YES";
                break;
            } else if (target != arr[right] + arr[left]) {
                left--;

                if (left < 0 && right == 0) {
                    answer = "NO";
                    break;
                }

                if (left < 0) {
                    right--;
                    left = right - 1;
                }
            }
        }

        System.out.print(answer);
    }
}
