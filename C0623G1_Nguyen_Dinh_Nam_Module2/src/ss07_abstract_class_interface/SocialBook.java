package ss07_abstract_class_interface;

public class SocialBook extends Book implements IBook{
    private String author;

    public SocialBook() {
    }

    public SocialBook(String name, String publisher, String publisherYear, String author) {
        super(name, publisher, publisherYear);
        this.author = author;
    }

    @Override
    public void display() {
        System.out.println(super.toString()+ "author: "+ this.author + '\'');
    }
}
