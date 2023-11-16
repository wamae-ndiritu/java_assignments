public class Patient {
    private String id_no;
    private String full_name;
    private int age;
    String address;

    // constructor to insantiate the object
    public Patient(String id, String name, String address, int age) {
        this.id_no = id;
        this.full_name = name;
        this.address = address;
        this.age = age;
    }

    // define getters & setters

    public String getIdNo() {
        // retrives the value of the private variable id_no
        return this.id_no;
    }

    public void setIdNo(String id) {
        // sets the value of the private variable id_no
        this.id_no = id;
    }

    public String getFullName() {
        // retrives the value of the private variable full_name
        return this.full_name;
    }

    public void setFullaName(String name) {
        // sets the value of the private variable full_name
        this.full_name = name;
    }

    public int getAge() {
        // retrives the value of the private variable age
        return this.age;
    }

    public void setAge(int age) {
        // sets the value of the private variable age
        this.age = age;
    }

    public void admit() {
        System.out.println("Patient has been admitted");
    }

    public void getInformation() {
        System.out.print("ID NO: " + id_no);
        System.out.print("NAME: " + full_name);
    }

    public void addMedicalReport() {
        System.out.println("A new medical report has been added.");
    }
}
