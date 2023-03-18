import java.util.Scanner;
public class TaksimetreProgrami {
    public static void main(String[] args) {
        int km;
        double initialPrice = 10, total;

        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen mesafeyi km cinsinden giriniz: ");
        km = scan.nextInt();

        total = km*2.20;
        total += initialPrice;

        total = (total<20)? 20 : total;

        System.out.println("Toplam tutar: " + total+" TL");

    }
}
