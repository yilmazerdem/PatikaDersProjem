package MainProje;
import java.util.Scanner;
public class BurcProgram {public static void main(String[] args) {
    int ay,gun;
    String burc = "Tekrar Deneyiniz";
    try (Scanner scanner = new Scanner(System.in)) {
        System.out.println("Lutfen dogdugunuz ayi yaziniz");
        ay = scanner.nextInt();

        System.out.println("Lutfen dogdugunuz gunu yaziniz");
        gun = scanner.nextInt();
    }


    if(ay==1) {
        if (gun > 22)
            burc = "Kova";
        else {
            burc = "Oglak";
        }
    }
    else if (ay==2 )
        {
            if (gun>20)
                burc="Balık";
            else
                burc="Kova";
        }

        else  if (ay==3)
        {
            if (gun>21)
                burc="Koc";
            else
                burc="Balık";
        }

        else  if (ay==4)
        {
            if (gun>21)
                burc="Boga";
            else
                burc="Koç";
        }

        else  if (ay==5)
        {
            if (gun>22)
                burc="İkizler";
            else
                burc="Boğa";
        }

        else  if (ay==6)
        {
            if (gun>23)
                burc="Yengec";
            else
                burc="İkizler";
        }

        else  if (ay==7 )
        {
            if (gun>23)
                burc="Aslan";
            else
                burc="Yengec";
        }

        else  if (ay==8 )
        {
            if (gun>23)
                burc="Basak";
            else
                burc="Aslan";
        }

        else  if (ay==9 )
        {
            if (gun>23)
                burc="Terazi";
            else
                burc="Basak";
        }

        else  if (ay==10 )
        {
            if (gun>23)
                burc="Akrep";
            else
                burc="Terazi";
        }

        else if (ay==11 )
        {
            if (gun>22)
                burc="Yay";
            else
                burc="Akrep";
        }

        else if (ay==12)
        {
            if (gun>22)
                burc="Oglak";
            else
                burc="Yay";
        }

        System.out.println(gun+"/"+ay+" - "+" gununde dogduysaniz burcunuz da "+burc+" olur");

    }
}
