package algo250318;

import java.io.*;

// 모음의 개수 - 브론즈 4
public class Baek1264 {
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
                        count++;
                        break;
                    case 'e':
                        count++;
                        break;
                    case 'i':
                        count++;
                        break;
                    case 'o':
                        count++;
                        break;
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
