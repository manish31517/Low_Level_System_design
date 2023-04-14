package BuilderDesingPattern;

import java.util.List;

public class Student {
    int rollNO;
    String name;
    String age;
    String fatherName;
    String motherName;
    List<String> subjects;

    public Student(StudentBuilder studentBuilder){
        this.rollNO = studentBuilder.rollNO;
        this.name = studentBuilder.name;
        this.age = studentBuilder.age;
        this.fatherName = studentBuilder.fatherName;
        this.motherName = studentBuilder.motherName;
        this.subjects= studentBuilder.subjects;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNO=" + rollNO +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", motherName='" + motherName + '\'' +
                ", subjects=" + subjects +
                '}';
    }
}
