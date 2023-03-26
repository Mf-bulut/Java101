import java.util.Scanner;
public class UcakBileti {
    public static void main(String[] args) {

        double mesafe, normalTutar;
        int age, yolculukTipi;

        Scanner scan = new Scanner(System.in);

        System.out.print("Lütfen mesafeyi Km cinsinden giriniz: ");
        mesafe = scan.nextDouble();

        System.out.print("Yaşınızı giriniz: ");
        age = scan.nextInt();

        System.out.println("1- Tek Yön\n2- Gidiş-Dönüş");
        System.out.print("Yolculuk tipini seçiniz 1/2? : ");
        yolculukTipi = scan.nextInt();

        normalTutar = mesafe * 0.10;

     if (mesafe >= 0) {

         if ((yolculukTipi==1) || (yolculukTipi ==2 )){
             if (yolculukTipi==1){

                 if (age>0){
                     if( age<12 ){
                         System.out.println("Toplam Tutar : " + (normalTutar/2));
                     } else if (age>11 && age<25 ){
                         System.out.println("Toplam Tutar : " + (normalTutar-(normalTutar*0.10)));
                     } else if (age>65){
                         System.out.println("Toplam Tutar : " + (normalTutar-(normalTutar*0.30)));
                     } else {
                         System.out.println("Toplam Tutar : " + normalTutar);
                     }

                 } else {
                     System.out.println("Hatalı veri girdiniz!");
                 }
             } else if ( yolculukTipi==2 ){

                 if( age<12 ){
                     System.out.println("Toplam Tutar : " + ((normalTutar/2)-(normalTutar*0.20)));
                 } else if (age>11 && age<25 ){
                     System.out.println("Toplam Tutar : " + ((normalTutar-(normalTutar*0.10))-(normalTutar*0.20)));
                 } else if (age>65){
                     System.out.println("Toplam Tutar : " + ((normalTutar-(normalTutar*0.30))-(normalTutar*0.20)));
                 } else {
                     System.out.println("Toplam Tutar : " + (normalTutar-(normalTutar*0.20)));
                 }
             }

         } else {
             System.out.println("Hatalı veri girdiniz!");
         }
     } else {
         System.out.println("Hatalı veri girdiniz!");
     }


}
}
