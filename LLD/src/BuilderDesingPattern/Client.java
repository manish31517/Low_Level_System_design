package BuilderDesingPattern;

public class Client {
    public static void main(String[] args) {
        Director director = new Director(new EngineeringStudentBuilder());
        Director director1 = new Director(new MBAStudentBuilder());
        Student engineeringStudnet =director.createStudent();
        Student mbaStudent = director1.createStudent();

        System.out.println(engineeringStudnet.toString());
        System.out.println(mbaStudent.toString());
    }
}
