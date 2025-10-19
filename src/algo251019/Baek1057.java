package algo251019;

import java.io.*;
import java.util.*;

// 백준 - 토너먼트 (실버 4), [14256 KB, 104 ms]

// 1번부터 N번까지 배정 받음 -> 인접한 번호끼리 스타를 한다.
// 이긴사람은 다음 라운드에 진출, 진 사람은 탈락
// 만약 그 라운드의 참가자가 홀수명 -> 마지막 번호를 가진 참가자는 다음 라운드로 자동 진출
// 다음 라운드에서 다시 참가자 번호를 1번부터 매김
// 이때 번호를 매기는 순서는 처음 번호 순서를 유지하면서 1번부터 매김 -> 처음 배정 받은 번호 순서대로 정렬을 한다
// 몇 라운드에서 '누구'와 대결하는지 궁금해짐. 대결하기 전까지 항상 이긴다고 가정
// 1라운드에서 김지민의 번호와 임한수의 번호가 주어질 때, 과연 몇 라운드에서 대결할 것인가?
public class Baek1057 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());       // 실제 계산에 불필요
        int kim = Integer.parseInt(st.nextToken());
        int lim = Integer.parseInt(st.nextToken());

        // 어떻게 번호를 부여?
        // 참가자 수가 홀수명일 경우 어떻게 처리?
        // 다음 라운드 진출 이후에 배정되는 번호는 처음 배정 받은 번호 순서에 따라 매겨짐
        int round = 0;              // round 변수 선언

        // 두 번호가 같아지는 순간이 두 사람이 만나는 라운드
        while (kim != lim) {
            kim = (kim + 1) / 2;
            lim = (lim + 1) / 2;
            round++;
        }

        System.out.println(round);
    }
}
