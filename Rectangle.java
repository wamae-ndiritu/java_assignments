public class Rectangle {
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

    // define method calculate area of the rectangle
    public int calculate_area() {
        return this.length * this.width;
    }

    // main entry point to java program
    public static void main(String[] args) {
        // Creating an instance of Rectangle
        Rectangle myRectangle = new Rectangle(5, 3);

        System.out.println("Length of the square: " + myRectangle.length);
        System.out.println("Width of the square: " + myRectangle.width);

        // Calculating and printing the area
        int area = myRectangle.calculate_area();
        System.out.println("The area of the rectangle is: " + area);
    }
}