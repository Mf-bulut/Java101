import java.util.Scanner;
public class Combination {
    public static void main(String[] args) {

        int n,r,subtraction,combination ;

        int nfac =1;
        int rfac =1;
        int sfac=1;

        Scanner scan = new Scanner(System.in);

        System.out.print("Birinci sayıyı giriniz: ");
        n= scan.nextInt();

        System.out.print("İkinci sayıyı giriniz: ");
        r= scan.nextInt();

        subtraction = n - r;

        for (int i=1; i<=n; i++){
            nfac = nfac*i;
        }
        for (int i=1; i<=r; i++){
            rfac = rfac*i;
        }
        for (int i=1; i<=subtraction; i++){
            sfac = sfac*i;

        }
        combination = nfac / (rfac * sfac);

        System.out.println(n + "'in " + r + "' li kombinasyonu : " + combination);

    }
}
