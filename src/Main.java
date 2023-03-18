import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int mat, fizik, kimya, turkce, tarih, muzik;
        double sonuc;

        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen matematik notunuzu giriniz: ");
        mat = scan.nextInt();

        System.out.print("Lütfen fizik notunuzu giriniz: ");
        fizik = scan.nextInt();

        System.out.print("Lütfen kimya notunuzu giriniz: ");
        kimya = scan.nextInt();

        System.out.print("Lütfen türkçe notunuzu giriniz: ");
        turkce = scan.nextInt();


        System.out.print("Lütfen tarih notunuzu giriniz: ");
        tarih = scan.nextInt();

        System.out.print("Lütfen müzik notunuzu giriniz: ");
        muzik = scan.nextInt();

        sonuc = (mat + fizik + kimya + turkce + tarih + muzik) / 6;

        String str = (sonuc>60)? "Sınıfı Geçti" : "Sınıfta Kaldı";

        System.out.println("Not ortalamanız : " + sonuc);

        System.out.println(str);



    }
}