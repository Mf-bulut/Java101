import java.util.Scanner;
public class BurcBulma {
    public static void main(String[] args) {
        int month, day;

        Scanner scan = new Scanner(System.in);

        System.out.print("Doğduğunuz ay: ");
        month = scan.nextInt();

        System.out.print("Doğduğunuz gün: ");
        day = scan.nextInt();

if (month >= 1 && month <=12) {
        if (month == 1) {
            if ((day >= 1 && day <= 31)) {

                if (day < 22) {
                    System.out.println("Oğlak Burcu");

                } else {
                    System.out.println("Kova Burcu");

                }
            } else {
                System.out.println("Hatalı giriş yaptınız! Tekrar deneyiniz");
            }

        } else if (month == 2) {

            if ((day >= 1 && day <= 28)) {

                if (day < 20) {
                    System.out.println("Kova burcu");

                } else {
                    System.out.println("Balık burcu");

                }
            } else {
                System.out.println("Hatalı giriş yaptınız! Tekrar deneyiniz");
            }
        } else if (month == 3) {

            if ((day >= 1 && day <= 31)) {

                if (day < 20) {
                    System.out.println("Balık burcu");

                } else {
                    System.out.println("Koç burcu");
                }
            } else {
                System.out.println("Hatalı giriş yaptınız! Tekrar deneyiniz");
            }
        } else if (month == 4) {

            if ((day >= 1 && day <= 30)) {

                if (day < 21) {
                    System.out.println("Koç burcu");

                } else {
                    System.out.println("Boğa burcu");
                }
            } else {
                System.out.println("Hatalı giriş yaptınız! Tekrar deneyiniz");
            }
        } else if ( month == 5 ) {

            if ((day >= 1 && day <= 31)) {

                if (day < 22) {
                    System.out.println("Boğa burcu");

                } else {
                    System.out.println("İkizler burcu");
                }
            } else {
                System.out.println("Hatalı giriş yaptınız! Tekrar deneyiniz");
            }
        } else if ( month == 6 ) {

            if ((day >= 1 && day <= 30)) {

                if (day < 23) {
                    System.out.println("İkizler burcu");

                } else {
                    System.out.println("Yengeç burcu");
                }
            } else {
                System.out.println("Hatalı giriş yaptınız! Tekrar deneyiniz");
            }
        } else if ( month == 7 ) {

            if ((day >= 1 && day <= 31)) {

                if (day < 23) {
                    System.out.println("Yengeç burcu");

                } else {
                    System.out.println("Aslan burcu");
                }
            } else {
                System.out.println("Hatalı giriş yaptınız! Tekrar deneyiniz");
            }
        } else if ( month == 8 ) {

            if ((day >= 1 && day <= 31)) {

                if (day < 23) {
                    System.out.println("Aslan burcu");

                } else {
                    System.out.println("Başak burcu");
                }
            } else {
                System.out.println("Hatalı giriş yaptınız! Tekrar deneyiniz");
            }
        } else if ( month == 9 ) {

            if ((day >= 1 && day <= 30)) {

                if (day < 23) {
                    System.out.println("Başak burcu");

                } else {
                    System.out.println("Terazi burcu");
                }
            } else {
                System.out.println("Hatalı giriş yaptınız! Tekrar deneyiniz");
            }
        } else if (month == 10) {

            if ((day >= 1 && day <= 31)) {

                if (day < 23) {
                    System.out.println("Terazi burcu");

                } else {
                    System.out.println("Akrep burcu");
                }
            } else {
                System.out.println("Hatalı giriş yaptınız! Tekrar deneyiniz");
            }
        } else if (month == 11) {

            if ((day >= 1 && day <= 30)) {

                if (day < 22) {
                    System.out.println("Akrep burcu");

                } else {
                    System.out.println("Yay burcu");
                }
            } else {
                System.out.println("Hatalı giriş yaptınız! Tekrar deneyiniz");
            }
        } else if ( month == 12 ) {

            if ((day >= 1 && day <= 31)) {

                if (day < 22) {
                    System.out.println("Yay burcu");

                } else {
                    System.out.println("Oğlak burcu");
                }
            } else {
                System.out.println("Hatalı giriş yaptınız! Tekrar deneyiniz");
            }
        }
    } else {

    System.out.println("Hatalı giriş yaptınız! Tekrar deneyiniz");

    }
}
}








