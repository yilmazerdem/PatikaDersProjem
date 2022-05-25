package MainProje;
import java.util.Scanner;
public class KdvTutariHesapla {
    public static void main(String[] args) {
        Scanner inp =new Scanner(System.in);
        double KdvOrani,Tutar,KdvTutar,Toplam;

        System.out.println("TOPLAM UCRET TUTARINI GIRINIZ : ");
        KdvOrani=0.18;
        Tutar = inp.nextInt();
        System.out.println("Tutar  : "+Tutar);
        KdvTutar=(Tutar*KdvOrani);
        System.out.println("Kdv    : "+Tutar*KdvOrani);
        Tutar+=KdvTutar;
        System.out.println("Toplam : "+Tutar);


    }
}
