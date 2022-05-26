package MainProje;
import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;
public class VucutKitleEndeks {
    public static void main(String[] args) {
        int boy,kilo,kendeks;
        Scanner inp =new Scanner(System.in);
        System.out.println("BOY UZUNLUGUNUZU BELIRTIR MISINIZ ?");
        boy=inp.nextInt();
        System.out.println("KILONUZU KG CINSINDEN GIRER MISINIZ ?");
        kilo=inp.nextInt();

        kendeks=(boy*boy)/kilo;

        if (kendeks<22){
            System.out.println("NORMAL SEVIYE - " + kendeks);
        }
        else {
            System.out.println("OBEZITE SEVIYESI - "+kendeks);

        }
    }
}
