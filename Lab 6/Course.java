public class Course {
    public String name;
    public String code;
    public String contents;
    public int contentcount = 0;

    public void createCourse(String name, String code) {
        this.name = name;
        this.code = code;
    }

    public void printDetails() {
        System.out.println("Course Details: ");
        System.out.println("Course Name: " + this.name);
        System.out.println("Course Code: " + this.code);
        System.out.println("Course Syllabus: ");
        if (this.contents == null) {
            System.out.println("No content yet.");
        } else {
            System.out.println(this.contents);
        }
    }

    public void addOneContent(String content1) {
        if (this.contentcount == 4) {
            System.out.println("Cannot add more content");
        } else {
            System.out.println(content1 + " was added.");
            this.contentcount++;
            if (this.contents == null) {
                this.contents = content1;
            } else {
                this.contents += ", " + content1;
            }
        }
    }

    public void addTwoContent(String content1, String content2) {
        if (this.contentcount == 4) {
            System.out.println("Cannot add more content");
        } else {
            this.contentcount++;
            System.out.println(content1 + " was added.");
            if (this.contents == null) {
                this.contents = content1;
            } else {
                this.contents += ", " + content1;
            }
            if (this.contentcount != 4) {
                if (this.contents != null) {
                    System.out.println(content2 + " was added.");
                    this.contentcount++;
                    this.contents += ", " + content2;
                }
            } else {
                System.out.println("Cannot add more content");
            }
        }
    }
}