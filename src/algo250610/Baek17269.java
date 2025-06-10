package algo250610;

import java.io.*;

// 백준 - 이름궁합 테스트 (실버 5)
public class Baek17269 {
    public static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        String[] name = str.split(" ");
        int n = Integer.parseInt(name[0]);
        int m = Integer.parseInt(name[1]);

        str = br.readLine();
        name = str.split(" ");
        String answer = concatStr(name[0], name[1], n, m);

        int result = ans(answer);
        System.out.println(result + "%");
    }

    private static String concatStr(String a, String b, int al, int bl) {
        StringBuilder answer = new StringBuilder();
        if (al < bl) {      // 길이에 따라서 구분 필요
            for (int i = 0; i < al; i++) {
                answer.append(a.charAt(i));
                answer.append(b.charAt(i));
            }
            answer.append(b.substring(al, bl));
        } else {
            for (int i = 0; i < bl; i++) {
                answer.append(a.charAt(i));
                answer.append(b.charAt(i));
            }
            answer.append(a.substring(bl, al));
        }

        return answer.toString();
    }

    private static int ans(String a) {
        int[] alpha = {3, 2, 1, 2, 4, 3, 1, 3, 1, 1,
            3, 1, 3, 2, 1, 2, 2, 2, 1, 2, 1, 1, 1, 2, 2, 1};

        String number = "";
        int len = a.length();
        for (int i = 0; i < len; i++) {
            number += Integer.toString(alpha[a.charAt(i) - 'A']);       // 인덱스 최적화
        }

        String ans = "";
        while (true) {
            len = number.length();
            for (int i = 0; i < len - 1; i++) {
                int n = number.charAt(i) - '0';
                int m = number.charAt(i + 1) - '0';
                int num = n + m;
                if (num >= 10) {        // 십의 자리 제거
                    num -= 10;
                }
                ans += Integer.toString(num);
            }
            if (ans.length() == 2) {    // 두 자리인 경우 return
                return Integer.parseInt(ans);
            }

            number = ans;
            ans = "";
        }
    }
}
