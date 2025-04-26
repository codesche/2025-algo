package algo250426;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

// [해시] 배열 안에서 두 수의 합 찾기
public class FindTwoSumEx_refactor {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[n];
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int target = Integer.parseInt(br.readLine());
        String answer = "NO";

        for (int num : arr) {
            if (set.contains(target - num)) {
                answer = "YES";
                break;
            }
            set.add(num);
        }

        System.out.print(answer);
    }
}
