package ss01_introduction;

public class PhepTinh {
    private double a;
    private double b;

    public PhepTinh() {
    }

    public PhepTinh(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    double ketQua;

    public void cong() {
        ketQua = getA() + getB();
        System.out.println("Tong 2 so: " + ketQua);
    }

    public void tru() {
        ketQua = getA() - getB();
        System.out.println("Hieu 2 so: " + ketQua);
    }

    public void nhan() {
        ketQua = getA() * getB();
        System.out.println("Tich 2 so: " + ketQua);
    }

    public void chia() {
        if (getB() != 0) {
            ketQua = getA() / getB();
            System.out.println("Thuong 2 so: " + ketQua);
        } else {
            System.out.println("b khac 0");
        }
    }
}
