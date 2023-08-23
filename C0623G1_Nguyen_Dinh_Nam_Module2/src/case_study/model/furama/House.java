package case_study.model.furama;

import java.util.Objects;

public class House extends Furama {
    private String standard;
    private int floor;

    public House() {
    }

    public House(String id, String serviceName, double area, int costs, int maxPerson, String type, String standard, int floor) {
        super(id, serviceName, area, costs, maxPerson, type);
        this.standard = standard;
        this.floor = floor;
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    @Override
    public String toString() {
        return "House{" + super.toString() +
                "standard='" + standard + '\'' +
                ", floor=" + floor +
                '}';
    }
}
