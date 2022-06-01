package MainProje;
import java.util.Scanner;
public class SinifGecmeApp {


    public static void main(String[] args) {
        int math,physics,turkish,chemistry,music;
        double gradeAverage=0;
        int counter=0;
        double result=0;
        double average;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Matematik notunuz: ");
        math = scanner.nextInt();
        if(0 <= math && math <= 100) {
            result += math;
        }else {
            System.out.println("Gecersiz deger not!!!!");
        }

        System.out.println("Fizik notunuz: ");
        physics = scanner.nextInt();
        if(0 <= physics && physics <= 100) {
            result += physics;
        }else {
            System.out.println("Gecersiz deger not!!!!");
        }

        System.out.println("Turkce notunuz: ");
        turkish = scanner.nextInt();
        if(0 <= turkish && turkish <= 100) {
            result += turkish;
        }else {
            System.out.println("Gecersiz deger not!!!!");
        }

        System.out.println("Kimya notunuz: ");
        chemistry = scanner.nextInt();
        if(0 <= chemistry && chemistry <= 100) {
            result += chemistry;
        }else {
            System.out.println("Gecersiz deger not!!!!");
        }

        System.out.println("Muzik notunuz: ");
        music = scanner.nextInt();
        if(0 <= music && music <= 100) {
            result += music;
        }else {
            System.out.println("Gecersiz deger not!!!!");
        }

//        double average = (math+physics+turkish+chemistry+music) / 5;

        average = result / 5;
        if(average <= 55) {
            System.out.println("Sinifta kaldin seneye tekrardan gorusmek uzere!");
            System.out.println("Ortalama : " + average);
        }else {
            System.out.println("Tebrikler! sinifi gectiniz");
            System.out.println("Ortalama : " + average);

        }
    }
}
