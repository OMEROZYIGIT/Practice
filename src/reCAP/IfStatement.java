package reCAP;

import java.util.Scanner;

public class IfStatement {
    /*
     * kullanıcıdan aşağıdaki koşullarda bir şifre oluşturmasını isteyin.
     * 1 özel karakter içermeli
     * 1 büyük harf içermeli
     * 1 küçük harf içermeli
     * 1 sayi içermeli
     * Şifre uzunluğu en az 8 karakter olmalıdır
     */


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir şifre oluşturunuz.");
        System.out.println("Şifrenizin içinde en az birer adet Büyük Harf,Küçük Harf,Rakam,Özel karakterler “(!”#$%^’*+-.,/)” olmalıdır");
        System.out.print("\nLütfen Şifrenizi giriniz: ");
        String sifre= scanner.next();

        int sayacBH=0;                      // büyük harf kontrolü için
        int sayacKH=0;                      // küçük harf kontrolü için
        int sayacRkm=0;                     // rakam var mı yok mu kontrolü için
        int sayacOKrk=0;                    // özel karakter kontrolü için
        boolean pass=true;                  // şifrenin şartları sağlayıp sağlanmama durumunu kontrol için


        for (int i = 0; i < sifre.length(); i++) {

            if (sifre.charAt(i)>='A'&& sifre.charAt(i)<='Z'){
                sayacBH++;
            }else if(sifre.charAt(i)>='a'&& sifre.charAt(i)<='z'){
                sayacKH++;
            } else if (sifre.charAt(i)>='0'&& sifre.charAt(i)<='9') {
                sayacRkm++;
            } else if (sifre.charAt(i)>='!'&& sifre.charAt(i)<='/') {
                sayacOKrk++;
            }else{
                System.out.println("Lütfen verilen koşulları sağlayınız");
                break;
            }
        }

        if (sifre.length()<8){
            System.out.println("Şifreniz 8 karakterli olmalıdır.");
            pass=false;
        }
        if (sayacBH==0){
            System.out.println("Şifreniz en az bir büyük harf içermelidir");
            pass=false;
        }
        if (sayacKH==0){
            System.out.println("Şifreniz en az bir küçük harf içermelidir");
            pass=false;
        }
        if (sayacRkm==0){
            System.out.println("Şifreniz en az bir rakam içermelidir");
            pass=false;
        }
        if (sayacOKrk==0){
            System.out.println("Şifreniz en az bir özel karakter içermelidir");
            pass=false;
        }
        if(pass){
            System.out.println("Şifreniz "+sifre+" olarak başarıyla oluşturuldu.");

        }
    }
}

