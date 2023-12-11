import java.util.Scanner;

public class KDV_TutariHesaplayanProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float KDV_siz_fiyat, KDV_li_fiyat, KDV_tutari;

        System.out.println("KDV-ni hesaplamak istediginiz para degerini girin: ");
        KDV_siz_fiyat= sc.nextFloat();

        if(KDV_siz_fiyat>100){
            KDV_tutari=(KDV_siz_fiyat*18f/100f);
            KDV_li_fiyat=KDV_siz_fiyat+KDV_tutari;
        } else {
            KDV_tutari=(KDV_siz_fiyat*8f/100f);
            KDV_li_fiyat=KDV_siz_fiyat+KDV_tutari;
        }



        System.out.println("Girilen para degeri 18% KDV orani ile hesaplanacak");
        System.out.println("KDV'siz fiyat:"+ KDV_siz_fiyat);
        System.out.println("KDV'li fiyat: "+KDV_li_fiyat);
        System.out.println("KDV tutari: "+ KDV_tutari);





    }
}
