package algo250908;

import java.util.*;
import java.io.*;

// 백준 - 럭비 클럽 (브론즈 4)
public class Baek2083 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 문자열 출력
        StringBuilder sb = new StringBuilder();

        // 테스트 케이스 확인
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            int age = Integer.parseInt(st.nextToken());
            int weight = Integer.parseInt(st.nextToken());

            if (name.equals("#") && age == 0 && weight == 0) {
                break;
            }

            // 조건 확인
            if (age > 17 || weight >= 80) {
                sb.append(name).append(" ").append("Senior").append('\n');
            } else {
                sb.append(name).append(" ").append("Junior").append('\n');
            }
        }

        System.out.println(sb);
    }

}
