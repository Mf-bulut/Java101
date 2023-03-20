import java.util.Scanner;
public class SınıfıGecmeDurumu {
    public static void main(String[] args) {

        int mat, fizik, turkce, kimya, muzik;
        double ortalama;

        Scanner scan= new Scanner(System.in);

        System.out.print("Lütfen Matematik notunuzu giriniz: ");
        mat = scan.nextInt();

        if (mat<0 || mat>100){
            System.out.println("Girdiğiniz not geçersiz olduğu için ortalamaya katılmayacaktır");
        }else {
            System.out.println("Matematik notunuz " + mat +" olarak kaydedildi.");
        }

        System.out.print("Lütfen Fizik notunuzu giriniz: ");
        fizik = scan.nextInt();

        if (fizik<0 || fizik>100){
            System.out.println("Girdiğiniz not geçersiz olduğu için ortalamaya katılmayacaktır");
        }else {
            System.out.println("Fizik notunuz " + fizik +" olarak kaydedildi.");
        }

        System.out.print("Lütfen Türkçe notunuzu giriniz: ");
        turkce = scan.nextInt();

        if (turkce<0 || turkce>100){
            System.out.println("Girdiğiniz not geçersiz olduğu için ortalamaya katılmayacaktır");
        }else {
            System.out.println("Türkçe notunuz " + turkce +" olarak kaydedildi.");
        }

        System.out.print("Lütfen Kimya notunuzu giriniz: ");
        kimya = scan.nextInt();

        if (kimya<0 || kimya>100){
            System.out.println("Girdiğiniz not geçersiz olduğu için ortalamaya katılmayacaktır");
        }else {
            System.out.println("Kimya notunuz " + kimya +" olarak kaydedildi.");
        }

        System.out.print("Lütfen Müzik notunuzu giriniz: ");
        muzik = scan.nextInt();

        if (kimya <0 || kimya>100){
            System.out.println("Girdiğiniz not geçersiz olduğu için ortalamaya katılmayacaktır");
        }else {
            System.out.println("Kimya notunuz " + kimya +" olarak kaydedildi.");
        }


        ortalama = (mat + fizik + turkce + kimya + muzik)/5;

        if (ortalama >= 55){

            System.out.println("Ortalamanız: " + ortalama + " Sınıfı geçtiniz !");
        } else {

            System.out.println("Sınıfı geçemediniz");
        }


    }
}
