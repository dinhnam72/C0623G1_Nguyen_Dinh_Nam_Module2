package ss04_class_object;

public class Test {
    public static void main(String[] args) {
        Doctor doctor1 = new Doctor("Nguyen Van A", 24,"Quang Binh","affgr","Hoc Sinh");
        Doctor doctor2 = new Doctor("Tran Thi B", 20,"Ha Noi","affgr","Giam Doc");
        Doctor doctor3 = new Doctor("Hoang Hai", 15,"Quang Binh","affgr","Hoc Sinh");
       Doctor[] doctorList = {doctor1,doctor2,doctor3};
       for (Doctor doctor:doctorList){
           System.out.println(doctor);
       }
    }
}
