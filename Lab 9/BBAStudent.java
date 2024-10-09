public class BBAStudent extends Student {
    public BBAStudent() {
        super.updateDepartment("BBA");
        super.updateName("Default");
    }

    public BBAStudent(String name) {
        super.updateDepartment("BBA");
        super.updateName(name);
    }
}