import java.util.Scanner;

public class sinav {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.println("Adınızı giriniz");
        String ad = scan.nextLine();
        System.out.println("Soyadınızı giriniz");
        String soyad = scan.nextLine();
        System.out.println(String.format("Merhaba %s %s", ad, soyad));
        scan.close();

    }
}