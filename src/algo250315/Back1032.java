package algo250315;

import java.io.*;

// 백준 - 명령 프롬프트 (브론즈 1)
public class Back1032 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        String[] arr = new String[N];
        for (int i = 0; i < N; i++) {
            arr[i] = br.readLine();         // 파일 이름 배열에 저장
        }

        int len = arr[0].length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < len; i++) {
            boolean b = true;               // 모든 파일의 i번째 단어가 같으면 true, 다르면 false
            char c = arr[0].charAt(i);      // 첫 파일의 i번째 단어
            for (int j = 1; j < N; j++) {
                if (c != arr[j].charAt(i)) {
                    b = false;              // 파일의 단어가 다르면 false 출력
                }
            }

            if (b) {
                sb.append(c);               // 모든 파일의 단어가 같으면 그 단어를 출력
            } else {
                sb.append("?");             // 다르면 ? 출력
            }
        }
        System.out.println(sb);
    }
}
