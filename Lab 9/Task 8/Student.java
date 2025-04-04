public class Student {
    public String name;
    public String dept;
    public static int totalStudent = 0;
    public static int totalCSE = 0;
    public static int totalBBA = 0;
    public Student(String name, String dept){
        this.name = name;
        this.dept = dept;
        totalStudent++;
        if(dept.equals("CSE")){
            totalCSE++;
        }
        else if(dept.equals("BBA")){
            totalBBA++;
        }
        System.out.println("Creating Student Number: "+totalStudent);
    }
    public void individualInfo(){
        System.out.println(this.name+" is from "+this.dept+" department.");
        System.out.println("Serial of "+this.name+" among all students' is: "+totalStudent);
        if (this.dept.equals("CSE")){
            System.out.println("Serial of "+this.name+" among CSE department is: "+totalCSE);
        }
        else if (this.dept.equals("BBA")){
            System.out.println("Serial of "+this.name+" among BBA department is: "+totalBBA);
        }
    }
    public static void totalInfo(){
        System.out.println("Total Students: "+totalStudent);
        System.out.println("Total CSE students: "+totalCSE);
        System.out.println("Total BBA students: "+totalBBA);
    }
    
}