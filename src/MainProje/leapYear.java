package MainProje;

import java.util.Scanner;

public class leapYear {
    public static void main(String[] args) {
        int toDay, sonuc, sonuc2;
        Scanner inp = new Scanner(System.in);
        System.out.println("Yıl Giriniz");
        try {
            toDay = inp.nextInt();
            sonuc = toDay % 4;
            sonuc2 = toDay % 400;
            if (toDay % 100 == 0){
                System.out.println(toDay % 100);
            if (sonuc2 == 0) {
                System.out.println(toDay + " artık bir yıldır ! ..:(");
            } else {
                System.out.println(toDay + " artık bir değildir !.. :)");
            }
            }else {
                if (sonuc == 0) {
                    System.out.println(toDay + " artık bir yıldır ! ..:(");
                } else{
                    System.out.println(toDay + " artık bir değildir !.. :)");
                }
            }

        }catch (Exception e){
            System.out.println("Hata alındı tekrardan deneyiniz");
        }

    }
}
