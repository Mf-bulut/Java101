import java.util.Scanner;
public class VücutKitleIndex {
    public static void main(String[] args) {

       double kilo, boy, index;

        Scanner scan = new Scanner(System.in);

        System.out.print("Lütfen boyunuzu (metre cinsinden) giriniz: ");
        boy = scan.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz: ");
        kilo = scan.nextDouble();

        index = kilo/(boy*boy);

        System.out.println("Vücut kitle indeksiniz: "+index);

    }
}
