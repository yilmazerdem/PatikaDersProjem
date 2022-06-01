package MainProje;

public class Kosullu_ifadeler {
    private static String[] args;

    public static void main(String[] args) {
        Kosullu_ifadeler.args = args;
        int day=1;

        switch (day){
            case 1:
                System.out.println("Bugun Pazartesi");
                break;
            case 2:
                System.out.println("Bugun Salı");
                break;
            case 3:
                System.out.println("Bugun Çarşamba");
                break;
            default:
                System.out.println("Ekrana Hatalı Giriş Yaptınız");
        }

    }
}
