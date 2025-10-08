package algo251008;

import java.io.*;
import java.util.*;

// 백준 - 색종이 만들기 (실버 2), [15612 KB, 136 ms]

/**
 * * 문제 요약:
 *  - N x N 종이(0=흰, 1=파랑)가 주어질 때,
 *  - 전체 영역이 단색이면 그 색의 색종이 1장으로 카운트.
 *  - 섞여 있다면 4등분하여 같은 규칙을 재귀적으로 적용.
 *  - 최종적으로 흰색, 파란색 색종이 개수를 출력(순서: 흰 → 파랑).
 *  접근(분할 정복 / 재귀):
 *  1) 현재 정사각형 영역이 단색인지 검사(isUniform).
 *  2) 단색이면 해당 색 카운트 +1 하고 종료.
 *  3) 섞여 있으면 4개로 분할해서 각각 재귀 호출.
 *
 *  시간복잡도:
 *  - 최악 O(N^2).
 *  각 칸은 상위 영역에서 섞임 판단 후 더 작은 영역들에서 다시 검사되지만,
 *  전체적으로 각 칸은 많아야 소수 번 확인되므로 N^2에 수렴.
 *
 * 구현 포인트:
 *  - isUniform에서 다른 색을 발견하는 즉시 false 반환(조기 종료).
 *  - 4분할 순서: (좌상)→(우상)→(좌하)→(우하). 문제 정답엔 영향 없으나 일관성 유지.
 *  - 출력 순서: "흰색 줄바꿈 파란색".
 */
public class Baek2630 {

    static int N;
    static int[][] paper;

    // 결과 카운터(문제 요구 출력 순서: white -> blue)
    static int white = 0;
    static int blue = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // N은 2^k (2, 4, 8, ... , 128)
        N = Integer.parseInt(br.readLine());

        // 종이 색상 입력(0=white, 1=blue)
        paper = new int[N][N];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                paper[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // 전체 영역(0, 0)에서 시작, 한 변 길이 N
        cut(0, 0, N);

        // 출력: 흰색, 파란색 순서
        StringBuilder sb = new StringBuilder();
        sb.append(white).append('\n').append(blue);
        System.out.println(sb);
    }

    /**
     * 현재 정사각형 영역을 분할/계산하는 재귀 함수.
     *
     * @param row - 영역의 왼쪽 위 행 인덱스
     * @param col - 영역의 왼쪽 위 열 인덱스
     * @param size - 영역의 한 변 길이
     */
    private static void cut(int row, int col, int size) {
        // 현재 영역이 단색이면 해당 색 카운트 후 종료
        if (isUniform(row, col, size)) {
            // paper[row][col]를 대표 색으로 사용(단색이므로 어느 칸이든 동일)
            if (paper[row][col] == 0) {
                white++;
            } else {
                blue++;
            }
            return;
        }

        // 섞여 있다면 4등분 후에 각각 재귀 호출
        int half = size / 2;

        // 좌상
        cut(row, col, half);

        // 우상
        cut(row, col + half, half);

        // 좌하
        cut(row + half, col, half);

        // 우하
        cut(row + half, col + half, half);
    }

    /**
     * 주어진 정사각형 영역이 단색인지 검사.
     * 단색이면 true, 섞여 있으면 false
     *
     * @param row - 시작 행
     * @param col - 시작 열
     * @param size - 한 변 길이
     * @return - 단색 여부 확인
     */
    private static boolean isUniform(int row, int col, int size) {
        int base = paper[row][col];     // 기준 색

        // 영역 내 모든 칸을 확인, 다른 색을 찾는 즉시 false 반환 (조기 종료)
        for (int i = row; i < row + size; i++) {
            for (int j = col; j < col + size; j++) {
                if (paper[i][j] != base) {
                    return false;               // 다른 색 발견 시 즉시 종료
                }
            }
        }
        return true;        // 끝까지 다 같다면 단색
    }

}
