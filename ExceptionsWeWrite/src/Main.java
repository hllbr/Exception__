
import java.util.Scanner;


public class Main {
    //Bizim yazdığımız exceptionlar
    public static void mekan_kontrol(int age){
        if(age<18){
            throw new InvalidAgeException("Invalid Age");
        }else{
            System.out.println("Mekana Hoşgeldiniz...");
        }
    }
        public static void mekan_kontrol2(int age) throws InvalidSecond{
        if(age<18){
            throw new InvalidSecond("Invalid2 Age");
        }else{
            System.out.println("Mekana Hoşgeldiniz...");
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        System.out.println("Lütfen yaşınızı girin:");
        int age = scn.nextInt();
       // mekan_kontrol(age);//hatayı yakalıyacağımızı Java öngöremiyor bizim burda try-catch yapmamız gerekiyor...
        try {
              mekan_kontrol(age);
        } catch (InvalidAgeException e) {
            //system.println gerek yok çünkü biz onu diğer classımızda yazdık
           // e.printStackTrace();//buradaki yapımız kendi yazdığımız ınvalid classından geldi eğer biz mekan_kontrol içerisine yazdığımız kısmı çalıştırmak istersek ...
            System.out.println(e);//şeklinde bir ifade kullanmamız yeterli oldu 
        }
        //Checkexceptionları bizim mutalak yakalamamız gerekiyor.
        System.out.println("Lütfen 2. katılımcının yaşını giriniz...");
        int age2 = scn.nextInt();
        try {
            mekan_kontrol2(age2);
        } catch (InvalidSecond e) {
            e.printStackTrace();//yazdığımız check exception
           // System.out.println(e);//yazdığımız mekan_kontrol2 içerisindeki handling çalıştı
        }
        
        
    }
    
}
