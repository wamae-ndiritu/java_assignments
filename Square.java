class Rectangle {
    // define attributes
    private int length;
    private int width;

    // constructor method to instantiate the attributes
    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    // getter methods

    public int getLength() {
        // Returns the value of private attr length
        return this.length;
    }

    public int getWidth() {
        // Returns the value of private attr width
        return this.width;
    }

    // setter methods

    public void setLength(int val) {
        // set the value of private attr length
        this.length = val;
    }

    public void setWidth(int width_value) {
        // set the value of private attr width
        this.width = width_value;
    }

    // define method calculate area of the rectangle
    public int calculate_area() {
        return this.length * this.width;
    }

    // main entry point to java program
    public static void main(String[] args) {
        // Creating an instance of Rectangle
        Rectangle myRectangle = new Rectangle(5, 3);

        // Calculating and printing the area
        int area = myRectangle.calculate_area();
        System.out.println("The area of the rectangle is: " + area);
    }
}

public class Square extends Rectangle {

    // constructor method to instantiate the attributes
    public Square(int size) {
        // call the superclass (Rectangle) constructor and initialize length & width
        super(size, size);
    }

    // Optional: You can override the calculate_area method for Square
    @Override
    public int calculate_area() {
        System.out.println("Calculating area of the square...");
        return this.getLength() * this.getLength(); // You can still use the method from the superclass or provide a
                                                    // different
        // implementation
    }

    public static void main(String[] args) {
        // Creating an instance of Square
        Square square_a = new Square(5);

        // Before modifying
        System.out.println("Length of the square: " + square_a.getLength()); // 5
        System.out.println("Width of the square: " + square_a.getWidth()); // 5

        square_a.setLength(10);
        ;
        square_a.setWidth(10);

        // After modifying
        System.out.println("Length of the square: " + square_a.getLength()); // 10
        System.out.println("Width of the square: " + square_a.getWidth()); // 10

        // // Calculating and printing the area
        int area = square_a.calculate_area();
        System.out.println("The area of the square is: " + area);
    }
}