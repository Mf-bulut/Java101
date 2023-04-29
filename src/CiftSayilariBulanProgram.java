import java.util.Scanner;
public class CiftSayilariBulanProgram {
    public static void main(String[] args) {

        int k, total=0, num=0;

        Scanner scan = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        k = scan.nextInt();

        for(int i=1;i<=k; i++ ){

            if((i % 3== 0) && (i % 4==0)){

                total +=i;
                num++;
            }
        }
        double average;
        average = total/num;

        System.out.println("3 ve 4'e tam bölünen sayıların toplamı : " + total);
        System.out.println("3 ve 4'e tam bölünen sayıların ortalaması : " + average);


    }
}
