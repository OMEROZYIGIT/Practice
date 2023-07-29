package Examples;

public class soru01 {
    /*
        Soru 1-)   SOUT/SYSO
            Dairenin alanini ve cevresini hesaplayan java kodu yaziniz.
            Ipuclari:
            * r=7;
            * Pi=3.14
            * Dairenin Cevresi : 2*Pi*r
            * Dairenin Alani : Pi*r*r
     */
    public static void main(String[] args) {

        double yariCap = 7;
        double pi = 3.14;
        double cevre = 2*pi*yariCap;
        System.out.println(cevre);
        double alan = pi*yariCap*yariCap;
        System.out.println(alan);
    }
}
