package MainProje;
import java.util.Scanner;
public class Manav {
    public static void main(String[] args) {
            Scanner inp=new Scanner(System.in);
            double Armut=2.14,Elma=3.67,Domates=1.11,Muz=0.95,Patlican=5;
            int akg,ekg,dkg,mkg,pkg;
            double sonuc=0;

            System.out.print("Armut kac kilo?");
            akg=inp.nextInt();
            System.out.print("Elma kac kilo?");
            ekg=inp.nextInt();
            System.out.print("Domates kac kilo?");
            dkg=inp.nextInt();
            System.out.print("Muz kac kilo?");
            mkg=inp.nextInt();
            System.out.print("Patlican kac kilo?");
            pkg=inp.nextInt();

            if (akg>0)
                sonuc+=(Armut*akg);
            if (ekg>0)
                sonuc+=(Elma*ekg);
            if (dkg>0)
                sonuc+=(Domates*dkg);
            if (mkg>0)
                sonuc+=(Muz*mkg);
            if (pkg>0)
                sonuc+=(Patlican*pkg);

            System.out.println("Toplam Tutar: "+sonuc+ " TL");
    }
}
