package algo250619;

import java.io.*;
import java.util.*;

// 백준 - 체스판 다시 칠하기 (실버 4)
public class Baek1018 {

    public static boolean[][] arr;
    public static int min = 64;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력부
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        // 체스판 배열
        arr = new boolean[n][m];

        // 체스판 생성 = 행렬 생성
        for (int i = 0; i < n; i++) {
            String line = br.readLine();
            for (int j = 0; j < m; j++) {
                if (line.charAt(j) == 'W') {
                    arr[i][j] = true;           // W일 때는 true
                } else {
                    arr[i][j] = false;          // B일 때는 false
                }
            }
        }

        int nRow = n - 7;
        int mCol = m - 7;

        for (int i = 0; i < nRow; i++) {
            for (int j = 0; j < mCol; j++) {
                find(i, j);                     // 모든 8 X 8에 대한 색칠 횟수 계산
            }
        }
        System.out.println(min);
    }

    public static void find(int x, int y) {
        int end_x = x + 8;
        int end_y = y + 8;
        int count = 0;

        boolean TF = arr[x][y];     // 첫 번째 칸의 색

        for (int i = x; i < end_x; i++) {
            for (int j = y; j < end_y; j++) {
                // 올바른 색이 아닐 경우 count 1 증가
                if (arr[i][j] != TF) {
                    count++;
                }

                // 다음 칸은 색이 바뀌므로 true 라면 false로, false 라면 true로 값을 변경
                TF = (!TF);
            }

            TF = !TF;           // 체스판의 색깔은 상하좌우가 달라야 하기 때문에 값 변경
        }

        /*
         * 첫 번째 칸을 기준으로 할 때의 색칠할 개수(count)와
         * 첫 번째 칸의 색의 반대되는 색을 기준으로 할 때의
         * 색칠할 개수(64 - count) 중 최솟값을 count 에 저장
         */
        count = Math.min(count, 64 - count);

        /*
        이전까지의 경우 중 최솟값보다 현재 count 값이
        더 작을 경우 최솟값을 갱신
         */
        min = Math.min(min, count);
    }

}
