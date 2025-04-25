package algo250425;

import java.util.ArrayList;

// 프로그래머스 - 소수 찾기 (Lv2)
// 011 -> 길이가 3, 길이가 2, 길이가 1
// 17 -> 길이가 2, 길이가 1
public class Pro42839 {
    static ArrayList<Integer> arr = new ArrayList<>();
    static boolean[] check = new boolean[7];
    public int solution(String numbers) {
        int answer = 0;

        int length = numbers.length();
        for (int i = 0; i < length; i++) {
            dfs(numbers, "", i + 1);
        }

        int size = arr.size();
        for (int i = 0; i < size; i++) {
            if (prime(arr.get(i))) {
                answer++;
            }
        }

        return answer;
    }

    // 백트래킹
    static void dfs(String str, String temp, int m) {
        if (temp.length() == m) {
            int num = Integer.parseInt(temp);
            if (!arr.contains(num)) {
                arr.add(num);
            }
        }

        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!check[i]) {
                check[i] = true;
                temp += str.charAt(i);
                dfs(str, temp, m);
                check[i] = false;
                temp = temp.substring(0, temp.length() - 1);
            }
        }
    }

    // 소수 판단
    static boolean prime(int n) {
        if (n < 2) {
            return false;
        }

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Pro42839 T = new Pro42839();
        System.out.println(T.solution("17"));
    }
}
