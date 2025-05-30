package algo250530;

import java.io.*;
import java.util.*;

// 백준 - 햄버거 만들기 (브론즈 4)
public class Baek25628 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());       // 햄버거 개수 (2개)
        int B = Integer.parseInt(st.nextToken());       // 패티 개수 (1개)

        A /= 2;
        System.out.println(Math.min(A, B));
    }
}
