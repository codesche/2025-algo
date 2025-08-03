package algo250803;

import java.io.*;
import java.util.*;

// 백준 - 수강신청 (실버 3)
public class Baek13414 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int k = Integer.parseInt(st.nextToken());       // 수강 가능 인원
        int l = Integer.parseInt(st.nextToken());       // 신청 로그 수

        // LinkedHashMap: 입력 순서 유지하며, 키 중복 시 갱신
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();

        for (int i = 0; i < l; i++) {
            String studentId = br.readLine();
            // 기존에 있는 경우 제거 후 다시 put -> 마지막 신청 기준으로 위치 갱신
            map.remove(studentId);
            map.put(studentId, i);
        }

        // 출력: 앞에서부터 최대 K명
        int count = 0;
        for (String studentId : map.keySet()) {
            if (count == k) break;
            System.out.println(studentId);
            count++;
        }

    }
}
