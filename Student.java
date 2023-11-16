public class Student {
    String reg_no;
    String student_full_name;
    String courseList[];

    public void getStudentInfo() {
        System.out.print("REG NO: " + reg_no);
        System.out.print("Name: " + student_full_name);
        System.out.println();
    }

    // methi

    public void registerCourse() {
        System.out.println("Your course has been added to your course list!");
    }

    public void dropRegisterCourse() {
        System.out.println("This course has now been removed from your course list!");
    }

    public void viewRegisterCourses() {
        System.out.print("ICS 215: Object Oriented Programming");
        System.out.print("ICS 217: Digital Electronics");
        System.out.print("ICS 231: Computer Architecture");
        System.out.println();
    }
}
