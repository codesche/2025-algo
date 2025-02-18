package algo250218;

import java.io.*;
import java.util.*;

public class Baek20006 {
    public static int p, m;

    // 방 클래스 (중첩 클래스)
    public static class Room {
        int level;      // 방장 레벨
        int count;      // 방 인원수
        ArrayList<Player> players = new ArrayList<>();

        Room(int level, Player player) {
            this.level = level;
            this.players.add(player);
            this.count = 1;
        }
    }

    // 플레이어 클래스
    public static class Player implements Comparable<Player> {
        int level;          // 플레이어 레벨
        String name;        // 플레이어 이름

        Player(int level, String name) {
            this.level = level;
            this.name = name;
        }

        // 이름 사전 순으로 정렬
        @Override
        public int compareTo(Player p) {
            return (this.name).compareTo(p.name);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            // 입력 받기
        p = Integer.parseInt(st.nextToken());           // 플레이어 수
        m = Integer.parseInt(st.nextToken());           // 방 정원
        Deque<Room> dq = new ArrayDeque<>();            // 방 목록

        // 플레이어 입력
        for (int i = 0; i < p; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int level = Integer.parseInt(st.nextToken());
            String name = st.nextToken();

            boolean check = false;              // 모든 방 찾았는지 여부

            // 모든 방 앞에서부터 탐색
            for (Room room : dq) {
                // 레벨 조건이 맞고 방이 다 차지 않은 경우 입장
                if (Math.abs(level - room.level) <= 10 & room.count < m) {
                    room.players.add(new Player(level, name));
                    room.count += 1;            // 방 인원 증가
                    check = true;               // 방을 찾음
                    break;
                }
            }

            // 방을 찾지 못한 경우 새로운 방 생성
            if (!check) {
                dq.addLast(new Room(level, new Player(level, name)));   // 플레이어 생성, 방 생성, 목록에 저장
            }
        }

        // 모든 방 앞에서부터 출력
        for (Room room : dq) {
            // 정원이 다 찬 경우
            if (room.count == m) {
                bw.write("Started!");
            } else {        // 다 차지 못한 경우
                bw.write("Waiting!");
            }
            bw.newLine();

            // 참가자 이름 사전순으로 정렬
            Collections.sort(room.players);

            // for loop 안에서 size() 메서드를 계속 호출하면 List 사이즈를 계속 측정 후 돌려주는
            // 연산이 발생하므로 다음과 같이 설정
            int size = room.players.size();

            // 순서대로 출력
            for (int i = 0; i < size; i++) {
                bw.write(room.players.get(i).level + " " + room.players.get(i).name);
                bw.newLine();
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
