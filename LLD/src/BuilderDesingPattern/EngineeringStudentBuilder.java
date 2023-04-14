package BuilderDesingPattern;

import java.util.ArrayList;
import java.util.List;

public class EngineeringStudentBuilder extends StudentBuilder{
    @Override
    public StudentBuilder setSubjects() {
        List<String> subs = new ArrayList<>();
        subs.add("DSA");
        subs.add("Programming");
        subs.add("Micro Controller");
        subs.add("Operating System");
        subs.add("Networking");
        this.subjects = subs;
        return this;
    }
}
