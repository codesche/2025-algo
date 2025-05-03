package algo250503;

import java.io.*;

// 백준 - 과제 안 내신 분..? (브론즈 3)
public class Baek5597 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = new int[31];
        for (int i = 0; i < 28; i++) {
            int n = Integer.parseInt(br.readLine());
            arr[n] = n;
        }

        int count = 0;
        for (int i = 1; i < 31; i++) {
            if (arr[i] == 0) {
                count++;
                bw.write(String.valueOf(i));
                bw.newLine();
            }

            if (count == 2) {
                break;
            }
        }

        bw.flush();
        bw.close();
    }
}
