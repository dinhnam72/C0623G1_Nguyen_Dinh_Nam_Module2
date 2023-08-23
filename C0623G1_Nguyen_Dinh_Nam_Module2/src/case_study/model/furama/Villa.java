package case_study.model.furama;

import java.util.Objects;

public class Villa extends Furama {
    private String standard;
    private double swimmingArea;
    private int floor;

    public Villa() {
    }

    public Villa(String id, String serviceName, double area, int costs, int maxPerson, String type, String standard, double swimmingArea, int floor) {
        super(id, serviceName, area, costs, maxPerson, type);
        this.standard = standard;
        this.swimmingArea = swimmingArea;
        this.floor = floor;
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }

    public double getSwimmingArea() {
        return swimmingArea;
    }

    public void setSwimmingArea(double swimmingArea) {
        this.swimmingArea = swimmingArea;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    @Override
    public String toString() {
        return "Villa{" + super.toString() +
                ", standard='" + standard + '\'' +
                ", swimmingArea=" + swimmingArea +
                ", floor=" + floor +
                '}';
    }
}
