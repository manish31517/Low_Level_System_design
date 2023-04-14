package BuilderDesingPattern;

import java.util.List;

public abstract class StudentBuilder {
    int rollNO;
    String name;
    String age;
    String fatherName;
    String motherName;
    List<String> subjects;

    public StudentBuilder setRollNO(int rollNO) {
        this.rollNO = rollNO;
        return this;
    }

    public StudentBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public StudentBuilder setAge(String age) {
        this.age = age;
        return this;
    }

    public StudentBuilder setFatherName(String fatherName) {
        this.fatherName = fatherName;
        return this;
    }

    public StudentBuilder setMotherName(String motherName) {
        this.motherName = motherName;
        return this;
    }

    public abstract  StudentBuilder setSubjects() ;
    
    public Student build(){
      return  new Student(this);
    }
}
    
