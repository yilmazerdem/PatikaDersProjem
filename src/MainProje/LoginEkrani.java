package MainProje;
import java.util.Scanner;
public class LoginEkrani {
    public static void main(String[] args) {
        String userName,password;

        Scanner inp = new Scanner(System.in);

        System.out.print("Kullanici Adinizi Giriniz");
        userName=inp.nextLine();
        System.out.println("Parolanizi Giriniz");
        password=inp.nextLine();

        if (userName.equals("admin")&& password.equals("admin")) System.out.println("Giris Basarili");
        else System.out.println("Bilgiler yanlış girilmiştir");

    }
}
