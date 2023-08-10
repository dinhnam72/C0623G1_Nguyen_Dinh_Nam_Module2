package ss06_inheritance;

public class Circle {
    // thanh phan duoc ke thua
    private double radius;
    // thanh phan duoc ke thua
    private String color;

    public Circle() {
    }
    // overload
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "A Circle with radius = "
                + this.radius
                + " And color is " +this.color;
    }
}
