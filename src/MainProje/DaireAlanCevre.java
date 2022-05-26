package MainProje;
import java.util.Scanner;
public class DaireAlanCevre {
    public static void main(String[] args) {
        int r;
        double pi=3.14;
        Scanner inp =new Scanner(System.in);

        System.out.println("YARICAP UZUNLUGUNU GIRINIZ");
        r= inp.nextInt();
        double alan= pi *r*r;
        double cevre =2*pi*r;
        System.out.println("DAIRE ALANI : "+alan+" - DAIRE CEVRESI : "+cevre);
    }
}
