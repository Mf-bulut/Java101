import java.util.Scanner;
public class Döngüler2 {

    /*Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden
    ve girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.
     */

    public static void main(String[] args) {

        int n;
        int total =0;
        Scanner scan= new Scanner(System.in);

        do {

            System.out.print("Bir sayı giriniz: ");
            n = scan.nextInt();

            if((n % 4 == 0)){
                total += n;
            }


        }while (n % 2 == 0);
        System.out.println("Girilen sayılardan çift ve 4'ün katları olan sayıların toplamı : " + total);

    }
}
