import java.util.Scanner;
public class UcgeninAlaniniHesaplayanProgram {
    public static void main(String[] args) {
        // u : üçgenin çevresinin yarısı

        int a, b, c;
        double u, alan;

        Scanner scan = new Scanner(System.in);
        System.out.print("Üçgenin birinci kenarının uzunluğunu giriniz: ");
        a= scan.nextInt();

        System.out.print("Üçgenin ikinci kenarının uzunluğunu giriniz: ");
        b= scan.nextInt();

        System.out.print("Üçgenin üçüncü kenarının uzunluğunu giriniz: ");
        c= scan.nextInt();

        u = (a + b + c)/2;

        alan = Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println("Üçgenin alanı: " + alan);



    }
}
