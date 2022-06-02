package MainProje;
import java.util.Scanner;

public class CinZodyakTakvim {
    public static void main(String[] args) {
        int ddate,zodyak;
        Scanner inp = new Scanner(System.in);
        System.out.print("Dogum Tarihini Belirtiniz : ");
        ddate=inp.nextInt();
        zodyak=ddate%12;
        switch (zodyak) {
            case 0:
                System.out.println("Maymun");
                break;
            case 1:
                System.out.println("Horoz");
                break;
            case 2:
                System.out.println("Kopek");
                break;
            case 3:
                System.out.println("Domuz");
                break;
            case 4:
                System.out.println("Fare");
                break;
            case 5:
                System.out.println("Okuz");
                break;
            case 6:
                System.out.println("Kaplan");
                break;
            case 7:
                System.out.println("Tavsan");
                break;
            case 8:
                System.out.println("Ejderha");
                break;
            case 9:
                System.out.println("Yılan");
                break;
            case 10:
                System.out.println("At");
                break;
            case 11:
                System.out.println("Koyun");
                break;
            default:
                System.out.println("***Siz ozel Birisiniz***");
        }
    }
}
