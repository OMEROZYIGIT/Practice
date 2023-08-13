package day08_Practice;

// Soru: Referans veri tiplerinin nasıl çalıştığını anlamak için bir nesnenin bir metoda
// geçirilmesinin orijinal nesneyi nasıl etkilemediğini gösteren bir örnek yapınız.

public class P05_PassByValue {
    public static void main(String[] args) {

        StringBuilder text = new StringBuilder("Merhaba");
        System.out.println("İlk metin: "+text);

        modify(text);

        System.out.println("Son metin: "+text);

    }

    public static void modify(StringBuilder str) {

        str.append(" Java");
        System.out.println("Method içinde: "+ str);

    }
}
