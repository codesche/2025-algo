package algo251013;

import java.io.*;
import java.util.*;

// 백준 - 스위치와 램프 (실버 4), [17120 KB, 160 ms]
// 쉽게 이해 안 되는 문제
public class Baek16960 {

    static int N;
    static int M;
    static int[] arr;                   // 램프 갯수 배열
    static List<Integer>[] list;        // 램프 정보 저장 리스트

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[M + 1];
        list = new ArrayList[N + 1];
        for (int i = 1; i <= N; i++) {
            list[i] = new ArrayList<>();
        }

        for (int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());

            while (x-- > 0) {
                int tmp = Integer.parseInt(st.nextToken());
                list[i].add(tmp);
                arr[tmp]++;
            }
        }

        // 가능 여부 확인
        for (int i = 1; i <= N; i++) {
            if (isCheck(i)) {
                System.out.print(1);
                return;
            }
        }
        System.out.print(0);
    }

    private static boolean isCheck(int idx) {
        boolean flag = true;

        // 하나씩 빼면서 유지되는지 확인
        for (int x : list[idx]) {
            arr[x]--;

            if (arr[x] <= 0) {
                flag = false;
            }
        }

        // 확인한 값 원상복구
        for (int x : list[idx]) {
            arr[x]++;
        }

        return flag;
    }
}
