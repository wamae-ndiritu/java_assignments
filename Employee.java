
//  Class = models an object
// object => instance of a class

// Employee => super class 
public class Employee {///////////////////////////////////////////////////////////////////////////
    private int id;
    int age;
    String name;

    public static void main(String[] args) {
        Employee new_employee = new Employee(23456, "Wamae", 50);
        new_employee.work();
        Employee second_employee = new Employee(409869, "Brian", 40);
        second_employee.work();

        Manager new_manager = new Manager(12345, "John Doe", 32, "IT");
        new_manager.work();
        new_manager.attendBOM();

    }

    // constructor method
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
        System.out.println(this.name + " working...");
    }

    public void checkSalary() {
        System.out.println("Checking salary disbursment...");
    }

    public void quitJob() {
        System.out.println("Quiting the job...");
    }
}

// Manager => sub class/child
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
