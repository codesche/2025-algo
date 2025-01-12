package algo250112;

// 푸드 파이트 대회 - Lv1
public class Pro134240 {
    public String solution(int[] food) {
        StringBuilder sb = new StringBuilder();
        int length = food.length;

        for (int i = 1; i < length; i++) {
            sb.append(String.valueOf(i).repeat(food[i] / 2));
        }

        return sb.toString() + "0" + sb.reverse().toString();
    }

    public static void main(String[] args) {
        Pro134240 T = new Pro134240();
        System.out.println(T.solution(new int[]{1, 3, 4, 6}));
    }

}
