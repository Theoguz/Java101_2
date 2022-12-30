import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mesafe;
        int age;
        int yolculuktip;
        double ücret = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Mesafeyi km türünden giriniz:");
        mesafe = input.nextInt();
        if (mesafe < 0) {
            System.out.println("Hatalı veri girdiniz!");
            System.exit(0);
        }

        System.out.println("Yaşınızı Giriniz:");
        age = input.nextInt();

        System.out.println("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş )");
        yolculuktip = input.nextInt();
        ücret = mesafe * 0.10;

        if (age < 12) {
            ücret = ücret * 0.5;

        } else if (age >= 12 && age <= 24) {
            ücret -= ücret * 0.10;

        } else if (age > 65) {
            ücret -= ücret * 0.3;
        } else {
            ücret = ücret;
        }

        switch (yolculuktip) {
            case 1:

                System.out.println("ücret " + ücret);

                break;

            case 2:
                ücret -= ücret * 0.20;
                System.out.println("ücret " + 2*ücret);

                break;
            default:
                System.out.println("Hatalı giriş yaptınız");
        }
    }
}