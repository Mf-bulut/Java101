import java.util.Scanner;
public class DaireninAlanı {
    public static void main(String[] args) {
/* Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız
  a : merkez açı ölçüsü */

        int r, a;
        double pi=3.14 ,alan;

        Scanner scan = new Scanner(System.in);

        System.out.print("Lütfen dairenin yarıçapını giriniz: ");
        r = scan.nextInt();

        System.out.print("Lütfen dairenin merkez açı ölçüsünü giriniz: ");
        a = scan.nextInt();

        alan=(pi*(r*r)*a)/360 ;

        System.out.println("Dairenin alanı: "+ alan);


    }
}
