import java.util.Scanner;
public class SıralamaProgrami {
    public static void main(String[] args) {

        int a, b, c;
        Scanner scan = new Scanner(System.in);

        System.out.print("1. sayıyı giriniz: ");
        a = scan.nextInt();

        System.out.print("2. sayıyı giriniz: ");
        b = scan.nextInt();

        System.out.print("3. sayıyı giriniz: ");
        c = scan.nextInt();

        if (a<b && a<c){
            System.out.println("En küçük sayı: " + a);
        } else if (b<a && b<c){
            System.out.println("En küçük sayı:" + b);
        }else{
            System.out.println("En küçük sayı:" + c);
        }
    }
}
