package algo250301;

import java.io.*;
import java.util.Hashtable;

public class HashTableEx {
    public static void main(String[] args) throws IOException {
        String[] userId = {"Lee", "Kim", "Jang", "Wang", "Ha"};
        String[] password = {"L123", "L456", "J234", "W896", "H567"};

        // Hashtable 생성
        Hashtable<String, String> ht = new Hashtable<>();

        // 객체 저장
        int length = userId.length;
        for (int i = 0; i < length; i++) {
            ht.put(userId[i], password[i]);
        }

        System.out.println(ht);         // {Jang=J234, Ha=H567, Lee=L123, Wang=W896, Kim=L456}

        boolean FLAG = true;
        while (FLAG) {
            System.out.println("유저 ID는 >>>> ");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String userKey = br.readLine();
            String pwValue = ht.get(userKey);

            if (pwValue != null) {
                System.out.println("유저 PASSWORD는 >>>> ");
                String passwordInputValue = br.readLine();

                if (pwValue.equals(passwordInputValue)) {
                    System.out.println("인증 성공!!");
                } else {
                    System.out.println("인증 실패!!");
                }
            } else {
                System.out.println("입력한 유저 ID는 등록되어 있지 않습니다.");
                break;
            }

        }

    }
}
