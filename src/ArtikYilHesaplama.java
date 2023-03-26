import java.util.Scanner;
public class ArtikYilHesaplama {
    public static void main(String[] args) {
        int year;

        Scanner scan = new Scanner(System.in);

        System.out.print("Yıl giriniz : ");
        year = scan.nextInt();

        if( year%4 == 0 ){

            if ((year%100 ==0) && (year%400==0) ){
                System.out.println(year + " Bir artık yıldır!");
            } else {
                System.out.println(year + " Bir artık yıl değildir!");
            }
        } else {
            System.out.println(year + " Bir artık yıl değildir!");
        }

    }

}
