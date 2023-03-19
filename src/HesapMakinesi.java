import java.util.Scanner;
public class HesapMakinesi {
    public static void main(String[] args) {

        int n1,n2,select;

        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen birinci sayıyı giriniz: ");
        n1 = scan.nextInt();

        System.out.print("Lütfen ikinci sayıyı giriniz: ");
        n2 = scan.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Seçiminiz: ");
        select = scan.nextInt();

        switch (select){
            case 1 :
                System.out.println("Toplama işleminin sonucu: "+ (n1+n2));
                break;
            case 2 :
                System.out.println("Çıkarma işleminin sonucu: "+ (n1-n2));
                break;
            case 3 :
                System.out.println("Çarpma işleminin sonucu: "+ (n1*n2));
                break;
            case 4 :
                switch (n2){
                    case 0:
                        System.out.println("Bir sayı 0'a bölünemez !");
                        break;
                    default:
                        System.out.println("Bölme işleminin sonucu: "+ (n1/n2));
                        break;
                }

                break;
            default:
                System.out.println("Yanlış seçim yaptınız. Tekrar deneyiniz.");
                break;
        }
    }
}
