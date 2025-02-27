public class Rectangle {
    private final double width;
    private final double heigth;

    public Rectangle(double width, double heigth) {
        this.heigth = heigth;
        this.width = width;
    }

    public Rectangle(double width) {
        this(width, width);
    }
    public double square() {
        return width*heigth;
    }

    public double getHeigth() {
        return heigth;
    }

    public double getWidth() {
        return width;
    }
}
