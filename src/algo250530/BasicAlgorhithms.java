package algo250530;

import java.util.Arrays;

// 정처기 실기 대비 로직 정리
public class BasicAlgorhithms {

    // 합
    public static int sum(int n) {
        return n * (n + 1) / 2;
    }

    // 팩토리얼
    public static int factorial(int n) {
        if (n <= 1) return 1;
        return n * factorial(n - 1);
    }

    // 최대공약수(GCD) - 재귀
    public static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    // 최소공배수(LCM)
    public static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }

    // 배열 합
    public static int arraySum(int[] arr) {
        return Arrays.stream(arr).sum();
    }

    // 배열 최댓값
    public static int arrayMax(int[] arr) {
        return Arrays.stream(arr).max().orElse(Integer.MIN_VALUE);
    }

    // 배열 최소값
    public static int arrayMin(int[] arr) {
        return Arrays.stream(arr).min().orElse(Integer.MIN_VALUE);
    }
    
    // 문자열 뒤집기
    public static String reverseString(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    // 회문 판별
    public static boolean isPalindrome(String s) {
        return s.equals(reverseString(s));
    }

    // 문자열 문자 개수 세기
    public static int countChar(String s, char c) {
        int count = 0;
        for (char ch : s.toCharArray()) {
            if (ch == c) count++;
        }
        return count;
    }

    // 중복 제거 및 정렬
    // distinct을 우선 적용한 다음 정렬한다 => 백만 개, 수천만 개 케이스 고려
    public static int[] dedupAndSort(int[] arr) {
        return Arrays.stream(arr).distinct().sorted().toArray();
    }

}
