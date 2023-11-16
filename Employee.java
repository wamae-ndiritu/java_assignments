public class Employee {
    private int id;
    int age;
    String name;

    public Employee(int id_no, String name, int age) {
        this.id = id_no;
        this.age = age;
        this.name = name;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id_no) {
        this.id = id_no;
    }

    public void getDetails() {
        System.out.println(name);

    }

    public void work() {
        System.out.println("Working...");
    }

    public void checkSalary() {
        System.out.println("Checking salary disbursment...");
    }

    public void quitJob() {
        System.out.println("Quiting the job...");
    }
}

class Manager extends Employee {
    String level = "senior";
    String department;

    public Manager(int id, String name, int age, String depart) {
        super(id, name, age);
        this.department = depart;
    }

    public void conductMeeting() {
        System.out.println("Calling a meeting with all the employees...");
    }

    public void attendBOM() {
        System.out.println("Attending BOM meeting...");
    }

    public void askForReports() {
        System.out.println("Asking Junior employees to handle over their reports...");
    }
}
