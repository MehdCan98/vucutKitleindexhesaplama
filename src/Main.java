import java.util.Scanner;
//Kullanıcıdan verileri alabilmek için Scanner sınıfını projeye dahil diyoruz


public class Main {
    public static void main(String[] args) {

        //Boy(m) ve Kilo(kg) verileri için int ve double türünde iki farklı değişken oluşturuyoruz.
        int kg;
        double m;

        Scanner input = new Scanner(System.in);

        //Kullanıcıdan Boy(m) ve Kilo(kg) verilerini alıyoruz
        System.out.print("Lütfen Boyunuzu Giriniz: ");
        m = input.nextDouble();

        System.out.print("Lütfen Kilonuzu Giriniz: ");
        kg = input.nextInt();


        //Vicut kitle index formulünü değişken ile verilerie uygulayıp kullanıcıya sonucu iletiyoruz.
        double kitleİnddex = m*m/kg;
        System.out.println(kitleİnddex);
    }
}