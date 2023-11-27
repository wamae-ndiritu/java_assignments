class Tutor {
    String name;
    String course;
    String school;
    int experience;
    String contact;

    // constructor method
    public Tutor(String name, String course, String school, int experience, String contact) {
        this.name = name;
        this.course = course;
        this.school = school;
        this.experience = experience;
        this.contact = contact;
    }

    public void work() {
        System.out.println("My working is to teach...");
    }

    public void get_info() {
        System.out.println("Name: " + name);
        System.out.println("Course: " + course);
        System.out.println("Experience: " + experience + " years");
        System.out.println("Contact: " + contact);
    }

    // Method overload: get_info method with additional parameter
    public void get_info(boolean includeSchool) {
        get_info(); // Reuse the existing get_info method

        if (includeSchool) {
            System.out.println("School: " + school);
        }
    }
}

class TutorManager extends Tutor {
    // constructor to instantiate the object
    public TutorManager(String name, String course, String school, int experience, String contact) {
        // We call the Tutor(parent) constructor args and pass the args to it
        super(name, course, school, experience, contact);
    }

    // overridding the method work
    public void work() {
        // This method was defined earlier in the Tutor but now will be overidden
        System.out.println("My work is to manage the tutors...");
    }

    public static void main(String[] args) {

        // Creating an instance of tutor Manager
        TutorManager tutorManager = new TutorManager("Mr Wamae", "Software Development", "UoN", 2,
                "wamaejoseph392@gmail.com");

        // calling the work() method

        tutorManager.work();
        // the above will print My work is to manage the tutors...
    }
}
