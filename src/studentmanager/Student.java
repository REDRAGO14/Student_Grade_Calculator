public class Student extends Person {
    double mark;

    public Student(String name, double mark){
        super(name);
        this.mark = mark;
    }

    public double getMark() {
        return mark;
    }

    public final void showRules() {
        System.out.println("Grading rules are standardized.");
    }
    public String CalculateGrade(){
        if (mark >= 90) return "A";
        else if (mark >= 80) return "B";
        else if (mark >= 70) return "C";
        else if (mark >= 60) return "D";
        else return "F";
    }
}
