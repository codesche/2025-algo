package algo250510;

public class Student {
    private String name;
    private int grade;      // 학년
    private int score;

    public Student(String name, int grade, int score) {
        this.name = name;
        this.grade = grade;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public int getScore() {
        return score;
    }

    @Override
    public String toString() {
        return String.format("%s (%d학년, %d점)", name, grade, score);
    }
}
