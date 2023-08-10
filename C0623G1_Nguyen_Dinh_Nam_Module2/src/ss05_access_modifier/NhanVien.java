package ss05_access_modifier;

public class NhanVien {
    //khai bao name chi co pham vi trong class
    private String name;
    //khai bao telephone chi co pham vi trong class
    private String telephone;
    //khai bao workingParts chi co pham vi trong class
    private String workingParts;
    //khai bao companyName chi co pham vi trong class
    private String companyName;

    public NhanVien() {
    }


    public NhanVien(String name, String telephone, String workingParts, String companyName) {
        this.name = name;
        this.telephone = telephone;
        this.workingParts = workingParts;
        this.companyName = companyName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getWorkingParts() {
        return workingParts;
    }

    public void setWorkingParts(String workingParts) {
        this.workingParts = workingParts;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
    // Dung tu khoa static se khien said truc thuoc lop Nhan vien
    // Khong can phai khoi tao doi tuong

    public static void said() {
        System.out.println("I love you");
    }


}
