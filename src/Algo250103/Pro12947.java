package Algo250103;

// 하샤드 수
public class Pro12947 {
    public boolean solution(int x) {
        boolean answer = true;
        int sum = 0;

        // 문자열로 형변환
        String str = String.valueOf(x);

        // 문자열 길이가 1보다 큰 경우만 고려
        if (str.length() > 1) {
            String[] arr = str.split("");

            for (String value : arr) {
                sum +=  Integer.parseInt(value);
            }

            answer = (x % sum) == 0;
        }

        return answer;
    }

    public static void main(String[] args) {
        Pro12947 T = new Pro12947();
        System.out.println(T.solution(12));
    }
}
