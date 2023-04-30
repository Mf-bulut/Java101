import java.util.Scanner;
public class UsBulma {

    public static void main(String[] args) {

        int n;

        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sınır sayısı giriniz: ");
        n = scan.nextInt();

        for (int i=1; i<=n; i*=4){

            System.out.print(i + " ");
        }
        System.out.println("\n********");

        for (int j=1; j<=n; j*=5){

            System.out.print(j + " ");
        }
    }
}
