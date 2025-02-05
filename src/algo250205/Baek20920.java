package algo250205;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

// 영단어 암기는 괴로워 - 실버 3
// 3가지 조건
// 자주 나오는 단어는 앞에 배치 (조건 1)
// 해당 단어의 길이가 길수록 앞에 배치 (조건 2)
// 알파벳 사전 순으로 앞에 있는 단어일수록 앞에 배치 => 알파벳 소문자, 단어 길이는 10을 넘지 않음 (조건 3)
public class Baek20920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());       // 단어의 개수
        int M = Integer.parseInt(st.nextToken());       // 외울 단어의 기준이 되는 M

        // 스트링 배열 선언 및 배열 요소 입력
        String[] words = new String[N];
        int length = words.length;
        for (int i = 0; i < length; i++) {
            words[i] = br.readLine();
        }

        br.close();

        List<String> answer = findAnswer(words);

        for (String s : answer) {
            if (s.length() < M) {
                continue;
            }
            bw.write(s + "\n");
        }
        bw.flush();
        bw.close();
    }

    // 조건 1 ~ 3을 처리하여 배열을 반환시키는 메소드
    public static List<String> findAnswer(String[] array) {
        // 단어와 갯수의 데이터를 담은 hashmap 만들기
        HashMap<String, Integer> map = new HashMap<>();
        for (String str : array) {
            if (map.containsKey(str)) {
                // 해당 word를 key 값으로 가지며, 그 key 값의 value(지금까지의 빈도수) + 1
                map.put(str, map.get(str) + 1);
            } else {    // 한 번도 마주치지 않은 경우 빈도수는 당연히 1이므로 value는 1 값을 가짐
                map.put(str, 1);
            }
        }

        // 키 값이 영단어인데 해당 영단어만 뽑아서 리스트로 만듦
        List<String> wordList = map.keySet().stream().collect(Collectors.toList());
        wordList.sort((o1, o2) -> {
            int c1 = map.get(o1);       // 빈도수
            int c2 = map.get(o2);       // 빈도수

            if (c1 == c2) {                                  // 빈도수가 같으면 (조건 1)
                if (o1.length() == o2.length()) {           // 단어의 길이가 같으면 (조건 2)
                    return o1.compareTo(o2);                // 조건 3. 알파벳 사전 순으로 앞에 있는 단어 일수록 앞에 배치
                }
                return o2.length() - o1.length();
            }
            return c2 - c1;         // 1. 자주 나오는 단어 일수록 앞에 배치
        });

        return wordList;
    }
}
