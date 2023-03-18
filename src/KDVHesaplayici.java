import java.util.Scanner;
public class KDVHesaplayici {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // b: kdv li fiyat, c: kdv tutarı

        double fiyat, b, c;

        System.out.print("Lütfen ürünün fiyatını giriniz: ");
        fiyat = scan.nextDouble();

        if (fiyat < 1000) {
            c = (fiyat * 18) / 100;
            b = fiyat + c;

            System.out.println("Ürünün fiyatı : " + fiyat + " TL");
            System.out.println("Ürünün KDV'li fiyatı: " + b + " TL");
            System.out.println("KDV Tutarı: " + c + " TL");

        } else {
            c = (fiyat * 8) / 100;
            b = fiyat + c;

            System.out.println("Ürünün fiyatı : " + fiyat + " TL");
            System.out.println("Ürünün KDV'li fiyatı: " + b + " TL");
            System.out.println("KDV Tutarı: " + c + " TL");
        }
    }
}
