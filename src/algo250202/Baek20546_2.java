package algo250202;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Baek20546_2 {
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
        int money1 = cash;              // 남은 현금
        int stock1 = 0;                 // 보유 주식 수
        for (int i = 0; i < 14; i++) {
            // 준현
            if (money1 / stockPrice[i] > 0) {
                int count = money1 / stockPrice[i];
                stock1 += count;
                money1 -= stockPrice[i] * count;

                if (money1 == 0) {
                    break;
                }
            }
        }

        int money2 = cash;              // 남은 현금
        int stock2 = 0;                 // 보유 주식 수

        for (int i = 0; i < 11; i++) {
            // 성민 3일 연속 가격이 전일 대비 상승한다면, 전량 매도
            if ((stockPrice[i] < stockPrice[i + 1]) && (stockPrice[i + 1] < stockPrice[i + 2])) {        // 상승
               if (stock2 == 0) {
                   continue;
               }

               money2 += stockPrice[i + 3] * stock2;
               stock2 = 0;
            } else if ((stockPrice[i] > stockPrice[i + 1]) && (stockPrice[i + 1] > stockPrice[i + 2])) {
                // 3일 연속 가격이 전일 대비 하락한다면, 전량 매수
                if (money2 / stockPrice[i + 3] > 0) {
                    int count = money2 / stockPrice[i + 3];
                    stock2 += count;
                    money2 -= stockPrice[i + 3] * count;
                }
            }
        }

        // 준현이의 자산이 더 크면 : BNP
        // 성민이의 자산이 더 크면 : TIMING
        // 둘의 자산이 같으면 : SAMESAME
        int profit1 = money1 + stockPrice[stockPrice.length - 1] * stock1;
        int profit2 = money2 + stockPrice[stockPrice.length - 1] * stock2;

        if (profit1 > profit2) {
            bw.write("BNP");
        } else if (profit1 < profit2) {
            bw.write("TIMING");
        } else {
            bw.write("SAMESAME");
        }

        bw.flush();
        bw.close();
    }
}
