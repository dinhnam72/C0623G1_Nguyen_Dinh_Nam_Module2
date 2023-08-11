package ss07_abstract_class_interface;

public class NaturaBook extends Book implements IBook {
    private int publishQuantity;

    public NaturaBook() {
    }

    public NaturaBook(String name, String publisher, String publisherYear, int publishQuantity) {
        super(name, publisher, publisherYear);
        this.publishQuantity = publishQuantity;
    }

    @Override
    public void display() {
        System.out.println(super.toString() + "publish quantity: " + this.publishQuantity +'\'');
    }
}
