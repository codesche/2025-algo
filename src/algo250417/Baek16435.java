package algo250417;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;
import java.util.Arrays;

// 백준 - 스네이크버드 (실버 5)
// 과일을 먹으면 길이가 1만큼 늘어난다!
public class Baek16435 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        // 과일의 개수, 스네이크버드 초기 길이 정수 입력
        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine(), " ");
        int[] arr = new int[N];             // 과일 관련 배열 생성
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);       // 최대 길이를 구해야 하므로 정렬을 활용

        for (int k = 0; k < N; k++) {
            if (L >= arr[k]) {
                L++;
            } else {
                break;
            }
        }

        System.out.print(L);
    }
}
