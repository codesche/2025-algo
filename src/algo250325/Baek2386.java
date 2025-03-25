package algo250325;

import java.io.*;

// 백준 - 도비의 영어 공부 (브론즈 2)
public class Baek2386 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String str = br.readLine();
            str = str.toLowerCase();

            if (str.equals("#")) {
                break;
            }

            String[] arr = str.split(" ");

            char spell = arr[0].charAt(0);          // 비교 기준이 되는 첫 글자 관련 변수
            int count = 0;

            int length = arr.length;
            for (int i = 1; i < length; i++) {
                for (int j = 0; j < arr[i].length(); j++) {
                    if (arr[i].charAt(j) == spell) {
                        count++;
                    }
                }
            }

            System.out.println(spell + " " + count);
        }
    }
}
