package ss15_exception.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class Work {
    private String id;
    private String name;
    private LocalDate date;
    private double money;
    private String describe;

    public Work() {
    }

    public Work(String id) {
        this.id = id;
    }

    public Work(String id, String name, LocalDate date, double money, String describe) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.money = money;
        this.describe = describe;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    @Override
    public String toString() {
        return "Work{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", date=" + date.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) +
                ", money=" + money +
                ", describe='" + describe + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Work that = (Work) o;
        return Objects.equals(id, that.id);
    }

}
