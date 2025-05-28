package algo250528.info;

// 사용자 정의 클래스와 배열
class Student2 {
    String name;
    int score;

    public Student2(String name, int score) {
        this.name = name;
        this.score = score;
    }

}

public class Exercise6 {
    public static void main(String[] args) {
        Student2[] students  = {
            new Student2("철수", 85),
            new Student2("영희", 90),
            new Student2("민수", 95)
        };

        for (Student2 s : students) {
            System.out.println(s.name + " : " + s.score);
        }
    }
}
