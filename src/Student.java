public class Student {
    private String name;
    private String grade;
    private double gpa;

    public Student(String name, String grade, double gpa) {
        this.name = name;
        this.grade = grade;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public String getGrade() {
        return grade;
    }

    public double getGpa() {
        return gpa;
    }

    public double theorum(double a, double b){
        return Math.sqrt(Math.pow(a,2)+ Math.pow(b,2));
    }

    @Override
    public String toString() {
        return "Name: " + name +" Grade: "+grade+ " GPA: "+ gpa;
    }
}
