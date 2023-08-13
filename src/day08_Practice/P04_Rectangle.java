package day08_Practice;

// Bir "Rectangle" sınıfı oluşturun
// ve
// bu sınıfın iki constructor'ı olsun.
// İlk constructor,
// uzun ve genişlik değerlerini alacak şekilde tasarlanmalıdır.
// İkinci constructor ise
// sadece bir boyut değeri alacak şekilde tasarlanmalıdır (kare).

// Aynı zamanda, bu constructor içinden "display" adında bir metodu çağırarak boyutları ekrana yazdırın.

        // Örnek çıktı:
        // Uzunluk: 8, Genişlik: 6
        // Kenar uzunluğu: 5 (Kare)

public class P04_Rectangle {

    int uzunluk;
    int genislik;


    public P04_Rectangle (int uzunluk,int genislik){
         this.uzunluk = uzunluk;
         this.genislik = genislik;
        display();

    }
    public P04_Rectangle (int boyut){
         this.uzunluk=boyut;
         this.genislik=boyut;
         display();
    }

    public void display() {

        if (uzunluk==genislik){
            System.out.println("Kenar uzunluğu: "+uzunluk+"(Kare)");
        }else {
            System.out.println("Uzunluk: "+uzunluk+" Genişlik: "+genislik);
        }
    }

    public static void main(String[] args) {

        P04_Rectangle rectangle = new P04_Rectangle(8,6);
        P04_Rectangle rectangle1 = new P04_Rectangle(5);
        P04_Rectangle rectangle2 = new P04_Rectangle(6,6);

    }
}
