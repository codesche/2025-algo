package algo250528.info;

// 정처기 연습
public class Exercise1 {
    public static void main(String[] args) {
        String input = "HelloWorld";
        StringBuilder sb = new StringBuilder();
        for (char c : input.toCharArray()) {
            if (Character.isUpperCase(c)) {
                sb.append(Character.toLowerCase(c));
            } else {
                sb.append(Character.toUpperCase(c));
            }
        }
        System.out.println(sb);
    }
}
