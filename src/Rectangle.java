public class Rectangle {
    private final double width;
    private final double heigth;
    private final double square;

    public Rectangle(double width, double heigth) {
        this.heigth = heigth;
        this.width = width;
        square = width*heigth;
    }

    public Rectangle(double width) {
        this(width, width);
    }
    public double Square() {
        return square;
    }

    public double getHeigth() {
        return heigth;
    }

    public double getWidth() {
        return width;
    }
}
