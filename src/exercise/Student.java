package exercise;

public class Student {
    private int idStudent;
    private String nameStudent;
    private float theoryPoint,practicePoint;

    public Student() {
    }

    public Student(int idStudent, String nameStudent, float theoryPoint, float practicePoint) {
        this.idStudent = idStudent;
        this.nameStudent = nameStudent;
        this.theoryPoint = theoryPoint;
        this.practicePoint = practicePoint;
    }
    public double averagePoint(){
        return (theoryPoint + practicePoint)/2;
    }

    @Override
    public String toString() {
        return "Student{" +
                "idStudent=" + idStudent +
                ", nameStudent='" + nameStudent + '\'' +
                ", theoryPoint=" + theoryPoint +
                ", practicePoint=" + practicePoint +
                '}';
    }

    public static void main(String[] args) {
        Student student1 = new Student(1,"tuan",10,10);
        Student student2 = new Student(2,"chung",5,8);
        System.out.println(student2.averagePoint());
        System.out.println(student1);
    }
}
