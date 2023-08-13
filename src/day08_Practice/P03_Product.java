package day08_Practice;

// Bir "Product" sınıfı oluşturun
// ve
// bu sınıfın bir constructor'ı olsun.
// Bu constructor, ürün adını, fiyatını ve stok adedini alacak şekilde tasarlanmalıdır.
// Aynı zamanda,
// bu constructor içinden "display" adında bir metodu çağırarak ürün bilgilerini ekrana yazdırın.

        // Örnek çıktı:
        // Ürün Adı: Laptop, Fiyat: 4000.0 TL, Stok: 15 adet

public class P03_Product {

    // variable'ları tanımladık.
    String urunAdi;
    double fiyat ;
    int stokAdeti;

    public P03_Product(String urunAdi,double fiyat,int stokAdeti){

        this.urunAdi=urunAdi;
        this.fiyat=fiyat;
        this.stokAdeti=stokAdeti;
        display();

    }

    public void display() {

        System.out.println("Ürün adı: "+urunAdi+"\nFiyat: "+fiyat+"$"+"\nStok adeti: "+stokAdeti);

    }

    public static void main(String[] args) {

        P03_Product product = new P03_Product("MSI Notebook",26500.99,10);
        System.out.println("*********************************************************");
        P03_Product product1 = new P03_Product("Macbook Pro",55999.99,2);

    }
}
