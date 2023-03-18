import java.util.Scanner;
public class ManavKasa {
    public static void main(String[] args) {

        double armutkg, elmakg, domateskg, muzkg, patlicankg;
        double armut=2.14, elma=3.67, domates=1.11, muz=0.95, patlican=5.00, toplam;

        Scanner scan = new Scanner(System.in);
        System.out.print("Armut kaç kilo? :");
        armutkg = scan.nextDouble();

        System.out.print("Elma kaç kilo? :");
        elmakg = scan.nextDouble();

        System.out.print("Domates kaç kilo? :");
        domateskg = scan.nextDouble();

        System.out.print("Muz kaç kilo? :");
        muzkg = scan.nextDouble();

        System.out.print("Patlıcan kaç kilo? :");
        patlicankg = scan.nextDouble();

        toplam = (armutkg*armut + elmakg*elma + domateskg*domates+ muzkg*muz + patlicankg*patlican);

        System.out.println("Toplam tutar: " + toplam);

    }
}
