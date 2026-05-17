public class Student extends Person {
    private double mark;

    public Student(String name, double mark){
        super(name);
        this.mark = mark;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        if(mark >= 0 && mark <= 100) this.mark = mark;
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
