package algo250223;

import java.io.*;
import java.util.*;

// 보물 - 실버 4
public class Baek1026 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int aN = N;
        int bN = N;

        // 각각의 리스트 선언
        List<Integer> aList = new ArrayList<>();
        List<Integer> bList = new ArrayList<>();

        // A 리스트 입력
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            aList.add(Integer.parseInt(st.nextToken()));
        }

        // A 리스트 재배열
        Collections.sort(aList);

        // B 리스트 입력
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            bList.add(Integer.parseInt(st.nextToken()));
        }

        int max = Integer.MIN_VALUE;        // 최댓값 선언 및 초기화
        int min = Integer.MAX_VALUE;        // 최솟값 선언 및 초기화
        int sum = 0;                        // 결과값 선언 및 초기화

        int aIdx = 0;
        int bIdx = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < aN; j++) {
                if (min > aList.get(j)) {
                    aIdx = j;
                    min = aList.get(aIdx);
                }
            }

            min = aList.remove(aIdx);       // 리스트에서 최솟값 제거

            for (int k = 0; k < bN; k++) {
                if (max < bList.get(k)) {
                    bIdx = k;
                    max = bList.get(bIdx);
                }
            }

            max = bList.remove(bIdx);       // 리스트에서 최댓값 제거

            sum += min * max;
            min = Integer.MAX_VALUE;        // 최솟값 초기화
            max = Integer.MIN_VALUE;        // 최댓값 초기화
            aN--;                           // A 리스트 길이를 고려하여 aN 감소
            bN--;                           // B 리스트 길이를 고려하여 bN 감소
        }

        bw.write(String.valueOf(sum));
        bw.flush();
        bw.close();
        br.close();
    }
}
