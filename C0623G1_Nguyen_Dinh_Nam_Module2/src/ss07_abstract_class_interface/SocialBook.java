package ss07_abstract_class_interface;

public class SocialBook extends Book implements IBook{
    private String tacGia;

    public SocialBook() {
    }

    public SocialBook(String tenSach, String nhaXuatBan, String namXuatBan, String tacGia) {
        super(tenSach, nhaXuatBan, namXuatBan);
        this.tacGia = tacGia;
    }

    @Override
    public void display() {
        System.out.println(super.toString()+ "tac gia: "+ this.tacGia + '\'');
    }
}
