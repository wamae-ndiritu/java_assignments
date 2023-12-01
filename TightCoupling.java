public class TightCoupling {
    // This class has direct access to the instance varible volume in class Box
    // (Tight Coupling)

    // Tight coupling means that there lack encapsulation and we can directly access
    // things inside a certain class
    public static void main(String[] args) {
        Box b = new Box(5, 5, 5);
        System.out.println(b.volume); // accessing the attribute volume depends on the
    }
}

class Box {
    public int volume;

    Box(int length, int width, int height) {
        this.volume = length * width * height;
    }
}