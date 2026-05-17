public class ExtensionStudent extends Student {
    public ExtensionStudent(String name, double mark){
        super(name, mark);
    }

    @Override
    public String CalculateGrade(){
        if (getMark() >= 85) return "A";
        else if (getMark() >= 75) return "B";
        else return super.CalculateGrade();

    }
}
