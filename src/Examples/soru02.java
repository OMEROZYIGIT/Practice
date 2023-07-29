package Examples;

public class soru02 {
    /*
    Soru-2)   SOUT/SYSO
            Dikdortgenin alanini ve cevresini hesaplayan kodu yaziniz.
            Ipuclari:
            * Dikdortgenin Cevresi: 2 * (uzun kenar + kisa kenar)
            * Dikdortgenin Alani : uzun kenar * kisa kenar
     */
    public static void main(String[] args) {
        int knr1=10;
        int knr2=5;
        int dikdortgenCevre=2*(knr2+knr1);
        System.out.println(dikdortgenCevre);
        int dikdortgenAlan=knr1*knr2;
        System.out.println(dikdortgenAlan);
    }
}
