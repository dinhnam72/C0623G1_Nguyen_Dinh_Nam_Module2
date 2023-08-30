package case_study.model.person;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public abstract class Person {
    private String id;
    private String name;
    private LocalDate date;
    private String gender;
    private String identityCard;
    private String telephone;
    private String email;

    public Person() {
    }

    public Person(String id) {
        this.id = id;
    }

    public Person(String id, String name, LocalDate date, String gender, String identityCard, String telephone, String email) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.gender = gender;
        this.identityCard = identityCard;
        this.telephone = telephone;
        this.email = email;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getIdentityCard() {
        return identityCard;
    }

    public void setIdentityCard(String identityCard) {
        this.identityCard = identityCard;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", date=" + date.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) +
                ", gender='" + gender + '\'' +
                ", identityCard='" + identityCard + '\'' +
                ", telephone='" + telephone + '\'' +
                ", email='" + email + '\'';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(id, person.id);
    }
}
