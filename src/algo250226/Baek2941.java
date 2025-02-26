package algo250226;

import java.io.*;

// 크로아티아 알파벳 - 실버 5
public class Baek2941 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] croatia = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        String str = br.readLine();
        int count = 0;
        int answer = 0;
        int strLength = str.length();

        int length = croatia.length;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < strLength; j++) {
                if (croatia[i].equals(str.substring(j, j + 2))) {
                    str = str.replace(str.substring(j, j + 2), "");
                    count++;
                    break;
                } else if (croatia[i].equals(str.substring(j, j + 3))) {
                    str = str.replace(str.substring(j, j + 3), "");
                    count++;
                    break;
                }
            }
        }

        answer = count + strLength;

        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
        br.close();
    }
}
