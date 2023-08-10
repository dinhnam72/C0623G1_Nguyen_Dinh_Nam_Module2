package ss07_abstract_class_interface;

public abstract class Book implements IBook {
    private String tenSach;
    private String nhaXuatBan;
    private String namXuatBan;

    public Book() {
    }

    public Book(String tenSach, String nhaXuatBan, String namXuatBan) {
        this.tenSach = tenSach;
        this.nhaXuatBan = nhaXuatBan;
        this.namXuatBan = namXuatBan;
    }

    @Override
    public String toString() {
        return "tenSach='" + tenSach + '\'' +
                ", nhaXuatBan='" + nhaXuatBan + '\'' +
                ", namXuatBan='" + namXuatBan + '\''
                ;
    }
}
