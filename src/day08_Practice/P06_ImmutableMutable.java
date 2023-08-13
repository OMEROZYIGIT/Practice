package day08_Practice;

// Soru: Immutable bir sınıf nasıl oluşturulur?
// Bir sınıfın değişmez (immutable) olması için nasıl adımlar atılır?

public class P06_ImmutableMutable {


    public class ImmutableExample {

        public final String message;  // final kelimesi ile değişmezlik özelliği tanımlıyoruz

        public ImmutableExample(String message) {
            this.message = message;

        }
        public String getMessage(){
            return message;
        }

    }

    public static void main(String[] args) {

    }
}
