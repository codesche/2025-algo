package algo250423;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        String name = null;
        Optional<String> optionalName = Optional.ofNullable(name);

        // 값이 있으면 출력하고 없으면 대체값 사용
        String result = optionalName.orElse("이름이 존재하지 않음");
        System.out.println(result);
    }
}
