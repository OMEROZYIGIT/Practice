package day07_Practice;

public class P08_Constructor {

    /*
     Bir "Book" sınıfı oluşturun ve bu sınıfın bir constructor'ı olsun.
     Bu constructor, kitap adını, yazarını ve yayın yılını alacak şekilde tasarlanmalıdır.
        Örnek çıktı:
        Book nesnesi oluşturuldu: "Java Programlama" - Ahmet Bulutluöz (2021)
     */

    String title;
    String yazar;
    int yayinYili;

    public P08_Constructor (String title, String yazar, int yayinYili){

        this.title=title;
        this.yazar=yazar;
        this.yayinYili=yayinYili;

    }
    public static void main(String[] args) {

        P08_Constructor book = new P08_Constructor("Java Programlama","Ahmet Bulutluöz",2021);
        System.out.println("Yeni Kitap Eklendi:\n Kitap Bilgileri:\n"+book.title+"-"+book.yazar+"-"+book.yayinYili );

        System.out.println("===================================================================");

        P08_Constructor book2 = new P08_Constructor("babayigit","java practice",2022);
        System.out.println("Yeni Kitap Eklendi:\n Kitap Bilgileri:\n"+book2.title+"-"+book2.yazar+"-"+book2.yayinYili );
    }
}
