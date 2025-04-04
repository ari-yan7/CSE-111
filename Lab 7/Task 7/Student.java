public class Student {
    private String[] coursename = new String[4];
    private int id;
    private double cg;

    public Student(int id) {
        this.id = id;
    }

    public void addCourse(String course) {
        if (this.cg == 0.0) {
            System.out.println("Failed to add " + course + "\nSet CG first");
        } else {
            int count = 0;
            for (int i = 0; i < 4; i++) {
                if (coursename[i] != null) {
                    count++;
                }
            }
            if (this.cg <= 3.0 && count >= 3) {
                System.out.println("Failed to add " + course + "\nCG is low. Can't add more than 3 courses.");
            } else if (count >= 4) {
                System.out.println("Failed to add " + course + "\nMaximum 4 courses allowed.");
            } else {
                for (int i = 0; i < 4; i++) {
                    if (this.coursename[i] == null) {
                        this.coursename[i] = course;
                        break;
                    }
                }
            }
        }
    }

    public void setCG(double cg) {
        this.cg = cg;
    }

    public void showAdvisee() {
        System.out.println("Student ID: " + this.id + ", CGPA: " + this.cg);
        if (this.coursename[0] == null) {
            System.out.println("No courses added");
        } else {
            System.out.print("Added cources are: ");
            System.out.println();
            for (int i = 0; i < 4; i++) {
                if (this.coursename[i] != null) {
                    System.out.print(this.coursename[i] + " ");
                }
            }
            System.out.println();
        }
    }

    public void rmAllCourse() {
        for (int i = 0; i < 4; i++) {
            this.coursename[i] = null;
        }
    }

    public void setID(int id) {
        this.id = id;
    }

    public Student(int id, double cg) {
        this.id = id;
        this.cg = cg;
    }

    public void addCourse(String[] courses) {
        for (String course : courses) {
            addCourse(course);
        }
    }
}