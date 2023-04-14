package BuilderDesingPattern;

public class Director {
    StudentBuilder studentBuilder;
    public  Director(StudentBuilder studentBuilder){
        this.studentBuilder = studentBuilder;
    }

    public Student createStudent(){
        if(studentBuilder instanceof EngineeringStudentBuilder){
            return createEngineeringStudent();
        }
        else if(studentBuilder instanceof  MBAStudentBuilder){
            return createMBAStudent();
        }
        return null;
    }

    public Student createEngineeringStudent(){
       return studentBuilder.setRollNO(1).setAge("22").setName("manish").setSubjects().build();
    }

    public  Student createMBAStudent(){
        return studentBuilder.setRollNO(2).setAge("24").setName("Akash").setFatherName("MyFatherName").setMotherName("MyMotherName").setSubjects().build();
    }



}
