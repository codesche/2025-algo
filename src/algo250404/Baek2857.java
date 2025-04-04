package algo250404;

import java.io.*;

// 백준 - FBI (브론즈 3)
public class Baek2857 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int count = 0;          // FBI 요원을 체크하여 없을 경우 "HE GOT AWAY" 출력 고려한 변수

        for (int i = 0; i < 5; i++) {
            String str = br.readLine();

            if (str.contains("FBI")) {
                count++;
                bw.write(String.valueOf(i + 1) + " ");
            }
        }

        if (count == 0) {
            bw.write("HE GOT AWAY!");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
