package algo250318;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 모음의 개수 - 브론즈 4
public class Baek1264_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = "";

        while (true) {
            str = br.readLine();

            if (str.equals("#")) {
                break;
            }

            str = str.toLowerCase();
            int length = str.length();
            int count = 0;

            for (int i = 0; i < length; i++) {
                switch (str.charAt(i)) {
                    case 'a':
                    case 'e':
                    case 'i':
                    case 'o':
                    case 'u':
                        count++;
                        break;
                    default:
                }
            }
            System.out.println(count);
        }
    }
}
