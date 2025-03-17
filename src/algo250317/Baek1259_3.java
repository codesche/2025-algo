package algo250317;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baek1259_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = "";

        while (true) {
            str = br.readLine();

            if (str.equals("0")) {
                break;
            }

            int length = str.length();
            int idx = length - 1;
            int count = 0;
            for (int i = 0; i < length / 2; i++) {
                if (str.charAt(i) == str.charAt(idx)) {
                    count++;
                }
                idx--;
            }

            if (count == length / 2) {
                bw.write("yes");
                bw.newLine();
            } else {
                bw.write("no");
                bw.newLine();
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
