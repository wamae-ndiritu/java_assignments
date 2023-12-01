public class LooseCoupling {
    public static void main(String[] args) {
        Box b = new Box(5, 5, 5);
        // System.out.println(b.volume); // This class has no direct access to the
        // outside class Box
        System.out.println(b.getVolume()); // The object state (private int volume) cannot be coupled directly by this
                                           // class (LooseCoupling)
    }
}

class Box {
    private int volume;

    Box(int length, int width, int height) {
        this.volume = length * width * height;
    }

    public int getVolume() {
        return volume;
    }

}

// The class Box is well poised for future expansion, we can have setter
// methods, add a private method to calculate volume outside the constructor

// The whole point is that we can control the various way that the outside class
// can couple with our Box class.

// As long as the outside class cannot get "inside" and tightly couple with the
// Box object state, then the relationship between them is loosly-coupled.
