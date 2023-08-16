import java.util.ArrayList;

public class Student {

    private long id;
    private String name;
    private ArrayList<Integer> grades;

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public String getName() {
        return name;
    }

    public long getId() {
        return id;
    }

    public Student(long id, String name) {
        this.id = id;
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public void addGrade(int grade) {
        this.grades.add(grade);
    }

    public doublegetGradeAverage() {
        double sum = 0;
        for (int grade: grades) {
            sum += grade;
        }
    }

}
