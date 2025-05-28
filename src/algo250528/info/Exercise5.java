package algo250528.info;

// 객체지향 구현 예제
class Student {
    String name;
    int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    void display() {
        System.out.println(name + "의 점수는 " + score);
    }

}

public class Exercise5 {
    public static void main(String[] args) {
        Student s = new Student("김철수", 80);
        s.display();
    }
}
