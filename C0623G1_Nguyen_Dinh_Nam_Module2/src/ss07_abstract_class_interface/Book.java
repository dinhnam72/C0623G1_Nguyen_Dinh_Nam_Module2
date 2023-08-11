package ss07_abstract_class_interface;

public abstract class Book implements IBook {
    private String name;
    private String publisher;
    private String publisherYear;

    public Book() {
    }

    public Book(String name, String publisher, String publisherYear) {
        this.name = name;
        this.publisher = publisher;
        this.publisherYear = publisherYear;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", publisher='" + publisher + '\'' +
                ", publisherYear='" + publisherYear + '\'' +
                '}';
    }
}
