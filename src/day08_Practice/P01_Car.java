package day08_Practice;

public class P01_Car {

    // Bir "Car" sınıfı oluşturun
    // ve
    // bu sınıfın bir constructor'ı olsun.
    // Bu constructor, marka ve model bilgilerini alacak şekilde tasarlanmalıdır.
            // Örnek çıktı:
            // Car nesnesi oluşturuldu: Ford Focus

    String marka;
    String model;

    public P01_Car (String marka, String model){
        this.marka=marka;
        this.model=model;
    }

    public static void main(String[] args) {

        P01_Car car = new P01_Car("Renault", "Broadway");
        P01_Car car1 = new P01_Car("Ford", "Fisuon");
        P01_Car car2 = new P01_Car("Renault", "Megane");

        System.out.println("İlk arabam: "+car.marka+" "+car.model);
        System.out.println("İkinci arabam: "+car1.marka+" "+car1.model);
        System.out.println("Üçüncü arabam: "+car2.marka+" "+car2.model);

    }
}
