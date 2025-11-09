package algo251109;

/**
 상황: 일차선 다리를 정해진 순으로 건넌다.
 목표: 모든 트럭이 다리를 건너려면 최소 몇 초가 걸리는지 알아야 함 (answer)
 조건:
 1. 다리에는 트럭이 최대 bridge_length(대) 올라갈 수 있음
 2. 다리는 weight 이하까지 무게를 견딜 수 있음
 3. 다리에 완전히 오르지 않은 트럭의 무게는 무시

 예시:
 1. 트럭 2대, 무게 10kg 견디는 다리
 2. int[] truck_weights = [7, 4, 5, 6]kg
 3. answer = 시간

 생각: 7, 코딩: 3
 */

/*
해법:
1. 큐를 다리 자체로 보면 된다.
2. 큐의 길이는 항상 bridge_length로 유지, 각 칸은 "해당 초에 그 위치에 있는 트럭의 무게(없으면 0)"
3. 큐에서 한 번 pop/offer가 일어나는 매 순간이 1초, 매 루프마다 answer++ 하면 된다.
4. bridge_length는 큐의 고정 길이이자 트럭이 다리 위에 머무는 시간이다.
5. truck_weights는 다음에 올라갈 트럭을 가리키는 인덱스로 순서대로 처리한다.
6. 매 초마다 현재 다리 무게(currentWeight)를 관리한다.
=> currentWeight + 다음 트럭 무게 <= weight
*/

import java.util.*;

// 프로그래머스 - 다리를 지나는 트럭
public class Pro42583 {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Integer> bridge = new ArrayDeque<>();     // 다리 위의 무게 상태를 담당

        int answer = 0;             // 경과 시간
        int currentWeight = 0;      // 다리 위 모든 트럭의 무게
        int idx = 0;

        // 맨 처음 비어있는 다리 공간 모두를 0으로 초기화
        for (int i = 0; i < bridge_length; i++) {
            bridge.offer(0);
        }

        // 다리 길이가 1이거나 트럭의 개수가 1일 경우
        if (bridge_length == 1) return truck_weights.length + 1;        // 경과 시간 출력
        if (truck_weights.length == 1) return bridge_length + 1;        // 경과 시간 출력

        // 처음엔 다리 위에 아무것도 없음 -> 길이를 유지하도록 push/poll 한다.
        // 여기선 매 초마다 길이를 유지하는 방식을 사용.
        while (idx < truck_weights.length) {
            currentWeight -= bridge.poll();
            answer++;       // 시간 = 루프

            // 다음 트럭을 올릴 수 있는지 확인
            int next = truck_weights[idx];
            if (currentWeight + next <= weight) {
                // 올릴 수 있다면 트럭 투입하기
                bridge.offer(next);
                currentWeight += next;          // 현재 무게도 증가시켜줌
                idx++;
            } else {
                bridge.offer(0);
            }
        }

        // 올라갔다고 해서 바로 건넌 것은 아님, 마지막 트럭은 다리에 올라간 뒤 bridge_length 초가 지나야
        // 완전히 건널 수 있음
        return answer + bridge_length;
    }
}


























