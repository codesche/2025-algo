package algo250529;

import java.io.*;
import java.util.*;

// 백준 - SASA 모형을 만들어보자 (브론즈 4)
// 알파벳 S 모양의 블록 N개와 알파벳 A 모양의 블록 M개
// SASA 모형 1개를 만들기 위해 - S 모양 블록 2개, A 모양 블록 2개
public class Baek23825 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());   // S 갯수
        int M = Integer.parseInt(st.nextToken());   // A 갯수

        bw.write(String.valueOf(Math.min(N, M) / 2));
        bw.flush();
        br.close();
        bw.close();
    }
}
