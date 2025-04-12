package algo250412;

import java.io.*;
import java.util.*;

/*
첫 번째 조각의 수가 두 번째 수보다 크다면, 둘의 위치를 서로 바꾼다.
두 번째 조각의 수가 세 번째 수보다 크다면, 둘의 위치를 서로 바꾼다.
세 번째 조각의 수가 네 번째 수보다 크다면, 둘의 위치를 서로 바꾼다.
네 번째 조각의 수가 다섯 번째 수보다 크다면, 둘의 위치를 서로 바꾼다.
만약 순서가 1, 2, 3, 4, 5 순서가 아니라면 1 단계로 다시 간다.
 */

// 백준 - 나무조각 (브론즈 1)
public class Baek2947 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[5];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 5; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // 배열의 인덱스가 3을 초과하지 않도록 하는 조건을 추가
        while (true) {
            boolean swapped = false;
            for (int i = 0; i < 4; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    swapped = true;

                    for (int j = 0; j < 5; j++) {
                        System.out.print(arr[j] + " ");
                    }
                    System.out.println();
                }
            }
            if (!swapped) {
                break;
            }
        }
    }
}
