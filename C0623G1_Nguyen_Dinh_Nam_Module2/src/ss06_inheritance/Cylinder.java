package ss06_inheritance;

public class Cylinder extends Circle{
    // thanh phan khong duoc ke thua
    private double height;

    public Cylinder() {
    }
    // overload
    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    // override cua circle
    @Override
    public String toString() {
        return "A Cylinder with height is "
                + this.height
                + " , which is a subclass of "
                + super.toString();
    }
}
