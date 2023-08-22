package case_study.model.person;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class Employee extends Person {
    private String degree;
    private String position;
    private double wage;

    public Employee() {
    }

    public Employee(String id) {
        super(id);
    }

    public Employee(String id, String name, LocalDate date, String gender, String identityCard, String telephone, String email, String degree, String position, double wage) {
        super(id, name, date, gender, identityCard, telephone, email);
        this.degree = degree;
        this.position = position;
        this.wage = wage;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    @Override
    public String toString() {
        return "Employee{" + super.toString() +
                ", degree='" + degree + '\'' +
                ", position='" + position + '\'' +
                ", wage=" + wage +
                '}';
    }

    public String inforToCSVEmployee() {
        return this.getId() + "," + this.getName() + "," + this.getDate().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + "," +
                this.getGender() + "," + this.getIdentityCard() + "," + this.getTelephone() + "," +
                this.getEmail() + "," + this.degree + "," + this.position + "," + this.wage;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(employee.getId(), super.getId());
    }
}
