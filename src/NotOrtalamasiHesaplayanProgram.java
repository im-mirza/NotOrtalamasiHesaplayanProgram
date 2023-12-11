import java.util.Scanner;

public class NotOrtalamasiHesaplayanProgram {
    public static void main(String[] args) {
        //degiskenleri tanimladim
        int matematik, fizik, kimya, turkce, tarih, muzik;
        double ortalama;

        //kullanicidan veri aldim
        Scanner sc = new Scanner(System.in);
        System.out.println("Matematik notunuzu girin: ");
        matematik=sc.nextInt();
        System.out.println("Fizik notunuzu girin: ");
        fizik=sc.nextInt();
        System.out.println("Kimya notunuzu girin: ");
        kimya=sc.nextInt();
        System.out.println("Turkce notunuzu girin: ");
        turkce=sc.nextInt();
        System.out.println("Tarih notunuzu girin: ");
        tarih=sc.nextInt();
        System.out.println("Muzik notunuzu girin: ");
        muzik=sc.nextInt();

        //ortalama formulunu kullandim
        ortalama=(matematik+fizik+kimya+turkce+tarih+muzik)/6;
        System.out.println("Ortalamaniz: "+ortalama);


        //Ternary operatoru kullandim
        String durum= ortalama>60 ? "Sinifi Gecti":"Sinifi kaldi";
        System.out.println(durum);




    }
}
