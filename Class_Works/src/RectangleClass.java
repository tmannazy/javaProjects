package src;

public class RectangleClass {
    private double length;
    private double width;
    private double perimeter;
    private double area;

    public void setLength(double length) {
        if (length> 0.0 && length < 20.0) this.length = length;
        else throw new IllegalArgumentException(" length value is out of range");
    }

    public double getLength() {
        return length;
    }

    public void setWidth(double width) {
        if (width > 0.0 && width < 20.0){
        this.width = width;
        } else {
            throw new IllegalArgumentException("width value is out of range");
        }
    }

    public double getWidth() {
        return width;
    }

    public void calculatePerimeter(double width, double length) {
        this.width = width;
        this.length = length;
        this.perimeter = 2 * (width + length);
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void calculateArea(double width, double length) {
        this.width = width;
        this.length = length;
        this.area = width * length;
    }

    public double getArea() {
        return area;
    }
}
