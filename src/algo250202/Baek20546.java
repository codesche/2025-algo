package algo250202;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

// 기적의 매매법 - 실버 5 (답은 맞는데 틀렸습니다 뜸)
public class Baek20546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int cash = Integer.parseInt(br.readLine());

        // 14일 간의 주가 입력
        int[] stockPrice = new int[14];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 14; i++) {
            stockPrice[i] = Integer.parseInt(st.nextToken());
        }

        // 준현이의 계산법 - 몫, 나머지로 계산
        // 성민이의 계산법 내용이 담긴 로직 구현 (2가지를 구현)
        int bnp = 0;
        for (int i = 0; i < 14; i++) {
            // 준현
            if (cash >= stockPrice[i]) {
                if (cash % stockPrice[i] == 0) {
                    bnp = cash / stockPrice[i];
                    break;
                } else {
                    bnp += cash / stockPrice[i];
                }
            } else {
                continue;
            }
        }

        int timing = 0;
        int increase = 0;
        int decrease = 0;
        int sum = 0;            // 전량 매도 고려
        for (int i = 4; i < 14; i++) {
            // 성민이는 가지고 있는 주식이 없으므로 3번째까지 패스
            if (stockPrice[i - 1] < stockPrice[i]) {        // 상승
                increase++;
                sum = stockPrice[i - 1] + stockPrice[i];

                if (stockPrice[i - 1] > stockPrice[i]) {
                    increase = 0;
                } else if (increase == 2) {
                    cash += sum;
                }
            } else if (stockPrice[i - 1] > stockPrice[i]) {
                decrease++;

                if (stockPrice[i - 1] < stockPrice[i]) {
                    decrease = 0;
                } else if (decrease == 2) {
                    timing = cash / stockPrice[i];
                    break;
                }
            }
        }

        // 준현이의 자산이 더 크면 : BNP
        // 성민이의 자산이 더 크면 : TIMING
        // 둘의 자산이 같으면 : SAMESAME
        int bnpCash = cash + stockPrice[13] * bnp;
        int timingCash = cash + stockPrice[13] * timing;

        if (bnpCash > timingCash) {
            bw.write("BNP");
        } else if (bnpCash < timingCash) {
            bw.write("TIMING");
        } else {
            bw.write("SAMESAME");
        }

        bw.flush();
        bw.close();
    }
}
