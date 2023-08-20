package reCAP;

public class Arrays {
    public static void main(String[] args) {
        /*
        Verilen bir array'de  istenilen elemanın olup olmadığını kontrol eden
        varsa kaç kere kullanıldığını yazdıran bir method oluşturunuz.
        {2,3,4,5,6,7,5,8,3,5,7,5,2,5}
         */

        int [] arr={2,3,4,5,6,7,5,8,3,5,7,5,2,15};

        istenenElemaniAra(arr,5);

    }

    private static void istenenElemaniAra(int[] arr, int istenen) {

        int flag=0;


        for (int i : arr) {

            if (istenen == i) {
                flag++;
            }
        }
        if (flag!=0){
            System.out.println("Verilen array'de aradığınız "+istenen+" elemanı vardır ve "+flag+" kez kullanılmıştır.");
        }else{
            System.out.println(" Aradığınız "+istenen+" elemanı verilen arrayde bulunmamaktadır.");

        }
    }
}
