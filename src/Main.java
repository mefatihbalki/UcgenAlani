import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        //değişkenler
        int a, b, c;
        double u;
        double alan;

        //Kullanıcı verileri
        Scanner input = new Scanner(System.in);
        System.out.print("1. Kenar Değerini Giriniz: ");
        a = input.nextInt();
        System.out.print("2. Kenar Değerini Giriniz: ");
        b = input.nextInt();
        System.out.print("3. Kenar Değerini Giriniz: ");
        c = input.nextInt();

        //Çevre Hesabı
        u = (a+b+c);
        System.out.print("Üçgenin çevresi : " + (u*2));

        //Alan Hesabı
        alan = Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.print("Üçgenin Alanı : " + alan);
    }
}