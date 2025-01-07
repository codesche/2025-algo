package algo250106;

// 수박수박수박수박수?
public class Pro12922 {
    public String solution(int n) {
        StringBuilder sb = new StringBuilder();
        String str1 = "수";
        String str2 = "박";

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                sb.append(str1);
            } else {
                sb.append(str2);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Pro12922 T = new Pro12922();
        System.out.println(T.solution(3));
    }
}
