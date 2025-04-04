public class Student {
    public static int totalstudents = 0;
    public static int csestudent = 0;
    public static int otherstudent = 0;
    public static int id;
    public String name;
    public double cg;
    public String dept;

    public static void printDetails() {
        System.out.println("Total Student(s): " + totalstudents);
        System.out.println("CSE Student(s): " + csestudent);
        System.out.println("Other Department Student(s): " + otherstudent);
    }

    public Student(String name, double cg) {
        this.name = name;
        this.cg = cg;
        this.dept = "CSE";
        id++;
        totalstudents++;
        csestudent++;
    }

    public void individualDetail() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + this.name);
        System.out.println("CGPA: " + this.cg);
        System.out.println("Department: " + this.dept);
    }

    public static Student createStudent(String name, double cg, String dept) {
        Student student=new Student(name,cg);
        student.dept = dept;
        csestudent--;
        otherstudent++;
        return student;
    }
}