package ss07_abstract_class_interface;

public class Test {
    public static void main(String[] args) {
           Book natura1 = new NaturaBook("Natura","Kim Dong","20/03/2020",1000);
           Book natura2 = new NaturaBook("Natura","Ha Noi","20/09/2010",5000);
           Book natura3 = new NaturaBook("Natura","Kim Dong","10/03/2018",3000);
           Book social1 = new SocialBook("Social","TP Ho Chi Minh","10/03/2018","Kim Dung");
           Book social2 = new SocialBook("Naruto","TP Da Nang","10/03/2014","Nam Cao");
           Book[] bookList = {natura1,natura2,natura3,social1,social2};
        for (Book book: bookList){
            book.display();
        }

    }

}
