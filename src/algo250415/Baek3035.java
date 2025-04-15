package algo250415;

import java.io.IOException;
import java.util.StringTokenizer;
import java.io.InputStreamReader;
import java.io.BufferedReader;

// 백준 - 스캐너 (브론즈 1)
// 신문 기사는 글자로 이루어진 R*C 행렬로 나타낸다. 글자는 알파벳과 숫자, 그리고 마침표로 이루어져 있다.
// 스캐너는 ZR과 ZC를 입력으로 받는다. 스캐너는 1*1크기였던 각 문자를 ZR*ZC크기로 확대해서 출력해 준다.
// ZR - 가로의 ZR배, ZC - 세로의 ZC배
public class Baek3035 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int R = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        int ZR = Integer.parseInt(st.nextToken());
        int ZC = Integer.parseInt(st.nextToken());

        // R개의 줄
        for (int i = 0; i < R; i++) {
            String str = br.readLine();
            StringBuilder sb = new StringBuilder();

            // 각 문자에 대한 가로(ZC) 확대
            for (int j = 0; j < C; j++) {
                char ch = str.charAt(j);
                sb.append(String.valueOf(ch).repeat(ZC));
            }

            // 각 문자에 대한 세로(ZR) 확대
            for (int k = 0; k < ZR; k++) {
                System.out.println(sb);
            }
        }
    }
}
