package algo250730;

import java.io.*;
import java.util.*;

// 백준 - 앉았다 (실버 4)
// 1 2 3 4 5 6 7 8 9 10 (10개)
// 1 2 3 4 5 6 7 8 9 10 (10개)
// 합: 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 (19가지)

/**
 * 1땡, 0.941
 * 상대방 9끗, 끗은 총 9개
 * 총 카드 수 : 20개, 끗 경우의 수 : 19개 => 0.95
 */

/**
 * 1. 섰다 - 20장의 카드, 2명 이상이 경기를 하는 게임
 * 2. 앉았다 (1 ~ 10, 2장씩 주어짐), 20장, 2명이 참가
 * 3. 중복 x, 자신은 어떤 카드 가져왔는지 알고 있음. 단, 상대방의 카드는 모름
 * 4. 서로의 패 공개
 * 5. 강한 족보의 패를 가진 사람이 승리
 * 6. 만약 두 사람이 같은 족보의 패를 가지면 비긴 걸로 간주
 * 7. 땡, 끗 => 땡(같은 숫자 2개, 두 패), 끗(다른 숫자, 예: 9끗, 두 패를 더했을 때 일의 자리수가 9)
 */

/*
1. 1 ~ 10까지 숫자 카드 2개를 넣어둠
2. 내가 가진 카드를 list에서 제외
3. 같은 숫자일 경우, isCheck를 true로 설정
4. 내가 땡인 경우, 내가 패하는 case를 계산. 전체 case에서 빼줌
5. 내가 끗인 경우, 상대가 패하는 case를 계산
6. 내가 N땡일 때
- N을 계산 (내가 가지고 있는 카드 값)
- 전체 카드 중에 N보다 크면서 두 카드가 같은 숫자일 때 cases를 1씩 증가
(이때 for문의 범위를 size() - 1로 해야 함... 마지막 확인할 필요 없음
=> 바로 앞 index와 같지 않을 경우 의미가 없음, 앞에서 같다고 판단한다면
이미 case 가 올라갔기 때문)
7. 내가 N끗일 때
- N을 계산 (내가 가지고 있는 카드 합에서 10으로 나눈 나머지[%10] - 일의 자리)
- 이중 for문을 이용하여 두 카드 합의 일의 자리가 N보다 작고 둘의 값이 같지 않을 때
cases를 1 증가 시켜줌
=> 이때 for문을 도는 index i와 j는 같으면 안 된다. 카드가 중복되면 안 되니까.
또한 [1, 9], [9, 1]은 같은 경우이므로 제외해줘야 한다.
=> 모든 경우는 왼쪽 숫자가 오른쪽 숫자보다 더 작거나 같도록 (i <= j)
조건을 넣어 제외시켜준다.

전체 경우의 수: 18C2 = 153
 */

public class Baek14717 {
    public static void main(String[] args) throws IOException {
        List<Integer> card =
            new ArrayList<>(Arrays.asList(1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 10, 10));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int card1 = Integer.parseInt(st.nextToken());
        int card2 = Integer.parseInt(st.nextToken());

        card.remove(Integer.valueOf(card1));
        card.remove(Integer.valueOf(card2));

        boolean isCheck = card1 == card2;
        double cases = 0;
        int myNumber = 0;       // 땡, 끗 앞에 붙는 숫자
        if (isCheck) {
            myNumber = card1;
            for (int i = 0; i < card.size() - 1; i++) {
                if (card.get(i + 1).equals(card.get(i))
                && card.get(i) > card1) {
                    cases++;
                }
            }
            cases = 153 - cases;
        } else {
            myNumber = (card1 + card2) % 10;
            for (int i = 0; i < card.size(); i++) {
                for (int j = 0; j < card.size(); j++) {
                    if (i == j) continue;
                    if (i <= j) {
                        if ((((card.get(i) + card.get(j)) % 10) < myNumber)
                            && card.get(i) != card.get(j)) {
                            cases++;
                        }
                    }
                }
            }
        }

        double probability = cases / 153;
        System.out.printf("%.3f", probability);
    }
}
