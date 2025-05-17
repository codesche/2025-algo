package algo250517;

import java.io.*;
import java.util.*;

// 백준 - 헛간 청약 (브론즈 4)
// N마리의 소, 헛간 크기 = W X H
// 소 한 마리당 L X L 크기 배정
// 직사각형 각 변에 대해 수평 혹은 수직
public class Baek19698 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int W = Integer.parseInt(st.nextToken());
        int H = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());

        int answer = (W / L) * (H / L);
        System.out.println(answer >= N ? N : answer);
    }
}
