package Algo250103;

// 짝수와 홀수
public class Pro12937 {
    public String solution(int num) {
        String answer = "";

        answer = (num % 2 == 0) ? "Even" : "Odd";

        return answer;
    }
}
