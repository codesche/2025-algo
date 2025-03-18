package algo250318;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 모음의 개수 - 브론즈 4
public class Baek1264_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = "";

        while (true) {
            str = br.readLine();

            if (str.equals("#")) {
                break;
            }

            str = str.toLowerCase();
            int length = str.length();

            int[] arr = new int[5];
            for (int i = 0; i < length; i++) {
                switch (str.charAt(i)) {
                    case 'a':
                        arr[0]++;
                        break;
                    case 'e':
                        arr[1]++;
                        break;
                    case 'i':
                        arr[2]++;
                        break;
                    case 'o':
                        arr[3]++;
                        break;
                    case 'u':
                        arr[4]++;
                        break;
                    default:
                }
            }

            length = arr[0] + arr[1] + arr[2] + arr[3] + arr[4];
            bw.write(String.valueOf(length));
            bw.newLine();
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
