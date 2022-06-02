package MainProje;
import java.util.Scanner;
public class UcakBiletProg {
    public static void main(String[] args) {
        double amount,agediscount = 0,damount,rtdiscount,topamount,distance,age;
        int triptype;
        Scanner inp = new Scanner(System.in);

        try {
            System.out.println("Mesafe Giriniz");
            distance=inp.nextDouble();
            System.out.println("Yaşınızı giriniz");
            age=inp.nextDouble();
            amount=distance*0.10;

            if (age<12 && age>0){
               agediscount=amount*0.50;
            } else if (age>12 && age<24) {
                agediscount=amount*0.10;
            }
            else if (age>65){
                agediscount=amount*0.30;
            }
            damount=amount-agediscount;

            System.out.println("Yolculuk tipini giriniz (1 => Tek Yon , 2 => Gidiş Donus )");
            triptype=inp.nextInt();
            if (triptype==1) {

                System.out.println("Tek Yon Bilet");
                topamount=damount;
                System.out.println("Toplam Tutar : "+topamount);

            } else if (triptype==2) {
                System.out.println("Gidiş-Donus Bilet");
                rtdiscount=damount*0.20;
                topamount=(damount-rtdiscount)*2;
                System.out.println("Toplam Tutar : "+topamount);
            }else{
                System.out.println("HATALI BILGI GIRISI YAPILDI");
            }

        } catch (Exception e) {
            System.out.println("Something went wrong.");
        }
    }
}
