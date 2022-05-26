/*
www.patika.dev
 */

package MainProje;
import java.util.Scanner;
public class UcgenHesaplama {
    public static void main(String[] args) {
        int uk,kk;
        double h;
        Scanner inp = new Scanner(System.in);
        System.out.println("KENAR UZUNLUKLARINI GİRİNİZ");
        System.out.print("KISA KENAR : ");
        kk=inp.nextInt();
        System.out.print("UZUN KENAR : ");
        uk= inp.nextInt();
        h=Math.sqrt((kk*kk)+(uk*uk));

        System.out.println("HIPOTENUS UZUN : "+ h);
    }

}
