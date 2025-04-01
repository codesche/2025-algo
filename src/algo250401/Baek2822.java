package algo250401;

import java.io.*;
import java.util.Arrays;

// 백준 - 점수 계산 (실버 5)
// 참가자의 총 점수는 가장 높은 점수 5개의 합
// 20 30 50 48 33 66 0 64
public class Baek2822 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] arr = new int[8];

        int length = arr.length;
        for (int i = 0; i < length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        // 랭킹 배열 생성
        int[] rank = Arrays.copyOfRange(arr, 0, 8);

        // 랭킹 배열 정렬
        Arrays.sort(rank);
        int sum = rank[7] + rank[6] + rank[5] + rank[4] + rank[3];
        bw.write(String.valueOf(sum));
        bw.newLine();

        for (int i = 0; i < length; i++) {
            for (int j = length - 1; j >= 3; j--) {
                if (arr[i] == rank[j]) {
                    bw.write(i + 1 + " ");
                }
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
