package MainProje;
import java.util.Scanner;
public class EtkinlikApp {
    public static void main(String[] args) {


        int calor;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sicaklik giriniz :");
        calor = scanner.nextInt();

        if(calor < 5) {
            System.out.println("Uygun Etkinlik : Kayak.");
        }else if(calor < 15) {
            System.out.println("Uygun Etkinlik : Sinema.");
        }else if (calor < 25) {
            System.out.println("Uygun Etkinlik : Piknik. ");
        }else {
            System.out.println("Uygun Etkinlik : Yuzme.");
        }
    }
}
