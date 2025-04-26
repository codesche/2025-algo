package algo250426;

import java.io.*;
import java.util.*;

// 백준 - 나이 계산하기 (브론즈 4)
// 만 나이 - 생일을 기준
// 세는 나이 - 생년을 기준
// 연 나이 - 생년 기준 (현재 연도에서 생년을 뺀 값)
// 출력: 만 나이, 세는 나이, 연 나이
// 만 나이: 연도가 같은 경우는 (그대로 유지), 연도가 지났는데 (월, 일 보다 크다? => 추가)
public class Baek16199 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int year = Integer.parseInt(st.nextToken());
        int month = Integer.parseInt(st.nextToken());
        int day = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int stanYear = Integer.parseInt(st.nextToken());
        int stanMonth = Integer.parseInt(st.nextToken());
        int stanDay = Integer.parseInt(st.nextToken());

        int manAge = (month > stanMonth || (month == stanMonth && day > stanDay))
            ? stanYear - year - 1 : stanYear - year;
        int countAge = (stanYear - year != 0) ? stanYear - year + 1 : 1;
        int yearAge = stanYear - year;

        bw.write(String.valueOf(manAge));
        bw.newLine();
        bw.write(String.valueOf(countAge));
        bw.newLine();
        bw.write(String.valueOf(yearAge));

        bw.flush();
        bw.close();
        br.close();
    }
}
