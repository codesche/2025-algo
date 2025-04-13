package algo250413;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

// 백준 - 이상한 나라의 암호 (브론즈 2)
// 조건 : i번째 줄의 문장은 문장의 첫 번째 글자에서 시작하여 i칸씩 건너뛰며 읽어야 한다
public class Baek18245 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int count = 2;

        while (true) {
            String str = br.readLine();

            if (str.equals("Was it a cat I saw?")) {
                break;
            }

            sb.append(str.charAt(0));
            int idx = count;

            int length = str.length();
            while (idx < length) {
                sb.append(str.charAt(idx));
                idx += count;
            }

            sb.append("\n");
            count++;
        }

        System.out.print(sb);
    }
}
