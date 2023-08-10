package ss07_abstract_class_interface;

public class NaturaBook extends Book implements IBook {
    private int soLuong;

    public NaturaBook() {
    }

    public NaturaBook(String tenSach, String nhaXuatBan, String namXuatBan, int soLuong) {
        super(tenSach, nhaXuatBan, namXuatBan);
        this.soLuong = soLuong;
    }

    @Override
    public void display() {
        System.out.println(super.toString() + "so luong: " + this.soLuong+'\'');
    }
}
