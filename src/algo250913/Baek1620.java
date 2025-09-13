package algo250913;

import java.io.*;
import java.util.*;

// 백준 - 나는야 포켓몬 마스터 이다솜 (실버 4)
public class Baek1620 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // 포켓몬 도감 생성 위한 nameToIdx 생성
        Map<String, Integer> nameToIdx = new HashMap<>();

        // 숫자 N, M 입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        // 번호 -> 이름 매핑용 배열
        String[] idxToName = new String[N + 1];

        for (int i = 1; i <= N; i++) {
            String name = br.readLine();
            nameToIdx.put(name, i);
            idxToName[i] = name;
        }

        // M개 질의 처리
        for (int i = 0; i < M; i++) {
            String str = br.readLine();
            char c = str.charAt(0);
            if (c >= '0' && c <= '9') {
                int num = Integer.parseInt(str);
                sb.append(idxToName[num]).append('\n');
            } else {
                sb.append(nameToIdx.get(str)).append('\n');
            }
        }

        System.out.println(sb);
    }
}
