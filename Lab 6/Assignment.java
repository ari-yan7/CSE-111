public class Assignment {
    public int tasks;
    public String difficulty;
    public boolean submission;

    public void printDetails() {
        System.out.println("Number of Tasks: " + this.tasks);
        System.out.println("Difficulty level: " + this.difficulty);
        System.out.println("Submission Required: " + this.submission);
    }

    public void makeOptional() {
        if (this.submission == true) {
            System.out.println("Assignment will not require submission");
            this.submission = false;
        } else {
            System.out.println("Submission is already not required");
        }
    }
}