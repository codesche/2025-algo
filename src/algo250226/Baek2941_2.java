package algo250226;

import java.io.*;

public class Baek2941_2  {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = 0;
        String str = br.readLine();
        int length = str.length();

        for (int i = 0; i < length; i++) {
            char ch = str.charAt(i);

            if (ch == 'c') {                // ch가 c라면
                if (i < length - 1) {
                    if (str.charAt(i + 1) == '=') {     // 다음 문자가 '=' 이라면
                        i++;                            // i+1 까지가 하나의 문자여서 다음 문자를 건너 뛰기 위해 1 증가시킴
                    } else if (str.charAt(i + 1) == '-') {
                        i++;
                    }
                }
            } else if (ch == 'd') {
                if (i < length - 1) {
                    if (str.charAt(i + 1) == 'z') {             // dz일 경우
                        if (i < length - 2) {
                            if (str.charAt(i + 2) == '=') {     // dz=일 경우
                                i += 2;
                            }
                        }
                    } else if (str.charAt(i + 1) == '-') {      // d-일 경우
                        i++;
                    }
                }
            } else if (ch == 'l') {
                if (i < length - 1) {
                    if (str.charAt(i + 1) == 'j') {             // lj일 경우
                        i++;
                    }
                }
            } else if (ch == 'n') {
                if (i < length - 1) {
                    if (str.charAt(i + 1)  == 'j') {            // nj일 경우
                        i++;
                    }
                }
            } else if (ch == 's') {
                if (i < length - 1) {
                    if (str.charAt(i + 1) == '=') {             // s=일 경우
                        i++;
                    }
                }
            } else if (ch == 'z') {
                if (i < length - 1) {
                    if (str.charAt(i + 1) == '=') {             // z=일 경우
                        i++;
                    }
                }
            }
            count++;
        }

        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
        br.close();

    }
}
