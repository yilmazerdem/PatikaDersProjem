package MainProje;
import java.util.Scanner;
public class NumberSorting {
    public static void main(String[] args) {
        int a,b,c;

        Scanner inp = new Scanner(System.in);

        System.out.println("A. Sayiyi giriniz : ");
        a=inp.nextInt();
        System.out.println("B. Sayiyi giriniz : ");
        b=inp.nextInt();
        System.out.println("C. Sayiyi giriniz : ");
        c=inp.nextInt();

        if (a<b && c<b ){
            if (a<c) System.out.println("A<C<B" + " (B EN BUYUK,A EN KUCUK)");
            else System.out.println("C<A<B"+ " (B EN BUYUK,C EN KUCUK)");
        }else if (a<c && b<c){
            if (a<b) System.out.println("A<B<C"+ " (C EN BUYUK,A EN KUCUK)");
            else System.out.println("B<A<C"+ " (C EN BUYUK,B EN KUCUK)");
        }else {
            if (b<c) System.out.println("B<C<A"+ " (A EN BUYUK,B EN KUCUK)");
            else System.out.println("C<B<A"+ " (A EN BUYUK,C EN KUCUK)");
        }
    }
}

