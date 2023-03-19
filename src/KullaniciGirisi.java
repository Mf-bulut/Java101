import java.util.Scanner;
public class KullaniciGirisi {
    public static void main(String[] args) {

    /* Kullanıcı adı : Patika
       Şifre : java123
     */
        String userName, password, karar, yenisifre;

        Scanner scan = new Scanner(System.in);

        System.out.print("Kullanıcı adınızı giriniz: ");
        userName = scan.nextLine();

        System.out.print("Şifrenizi giriniz: ");
        password = scan.nextLine();

        if (userName.equals("Patika") && password.equals("java123")){

            System.out.println("Giriş yaptınız !");
        }
        else
        {
            System.out.println("Bilgileriniz hatalıdır !");
            System.out.print("Şifrenizi sıfırlamak ister misiniz? ");
            karar = scan.nextLine();

            if (karar.equals("Evet")){
                System.out.print("Yeni şifre giriniz: ");
                yenisifre = scan.nextLine();

                if (yenisifre.equals("java123")){
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz");
                }
                else
                {
                    System.out.println("Şifre oluşturuldu");
                }
            }
            else
            {
                System.out.println("Bilgileriniz hatalı olduğu için giriş yapılamadı");
            }
        }
    }
}
