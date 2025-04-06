package algo250406;

import java.io.*;
import java.util.*;

// 백준 - 뉴비의 기준은 뭘까? (브론즈 4)
// 올드비: N학년 이하이면서 뉴비가 아닌 학생
// 뉴비: 1학년 혹은 2학년인 학생
// TLE: 뉴비도 아니고 올드비도 아닌 학생
// M학년이 뉴비인지 올드비인지 TLE인지 구별
public class Baek19944 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        if (M < 3) {
            sb.append("NEWBIE!");
        } else if (M > N) {
            sb.append("TLE!");
        } else {
            sb.append("OLDBIE!");
        }

        System.out.print(sb);
    }
}
