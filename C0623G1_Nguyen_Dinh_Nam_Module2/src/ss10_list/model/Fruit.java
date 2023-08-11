package ss10_list.model;

public class Fruit {
    private String name;
    private String type;
    private String dateOfManufacture;
    private String expirationDate;
    private String made;
    private double price;

    public Fruit(String name, String type, String dateOfManufacture, String expirationDate,
                 String made, double price) {
        this.name = name;
        this.type = type;
        this.dateOfManufacture = dateOfManufacture;
        this.expirationDate = expirationDate;
        this.made = made;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDateOfManufacture() {
        return dateOfManufacture;
    }

    public void setDateOfManufacture(String dateOfManufacture) {
        this.dateOfManufacture = dateOfManufacture;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getMade() {
        return made;
    }

    public void setMade(String made) {
        this.made = made;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", dateOfManufacture='" + dateOfManufacture + '\'' +
                ", expirationDate='" + expirationDate + '\'' +
                ", made='" + made + '\'' +
                ", price=" + price +
                '}';
    }
}
