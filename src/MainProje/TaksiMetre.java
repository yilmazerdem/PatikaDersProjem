package MainProje;
import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;
public class TaksiMetre {
    public static void main(String[] args) {
        int mesafe;
        double toplamtutar,tarife=2.5,bastutar=12;
        Scanner inp =new Scanner(System.in);
        System.out.println("TOPLAM GIDILEN MESAFE GIRINIZ");
        mesafe=inp.nextInt();
        toplamtutar=mesafe*tarife;
        toplamtutar+=bastutar;
        if (toplamtutar<20){
            System.out.println("BORCUNUZ 20 PARADIR");
        }
        else {
            System.out.println("BORCUNUZ "+toplamtutar+" PARADIR");
        }
    }
}
