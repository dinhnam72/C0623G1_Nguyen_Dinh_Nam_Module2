package case_study.model.furama;

import java.util.Objects;

public class Furama {
    private String id;
    private String serviceName;
    private double area;
    private int costs;
    private int maxPerson;
    private String type;

    public Furama() {
    }

    public Furama(String id, String serviceName, double area, int costs, int maxPerson, String type) {
        this.id = id;
        this.serviceName = serviceName;
        this.area = area;
        this.costs = costs;
        this.maxPerson = maxPerson;
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public int getCosts() {
        return costs;
    }

    public void setCosts(int costs) {
        this.costs = costs;
    }

    public int getMaxPerson() {
        return maxPerson;
    }

    public void setMaxPerson(int maxPerson) {
        this.maxPerson = maxPerson;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "id='" + id + '\'' +
                ", serviceName='" + serviceName + '\'' +
                ", area=" + area +
                ", costs=" + costs +
                ", maxPerson=" + maxPerson +
                ", type='" + type + '\'';
    }
}
