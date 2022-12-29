import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int day, month;
        Scanner input = new Scanner(System.in);
        System.out.print("Doğum ayınızı giriniz: ");
        month = input.nextInt();
        System.out.print("Doğum gününüzü giriniz: ");
        day = input.nextInt();

        switch (month) {
            case 1:
                System.out.printf("Ocak--");
                if (day < 21)
                    System.out.println("Oğlak");
                else
                    System.out.println("Kova");
                break;

            case 2:
                System.out.printf("Şubat--");
                if (day < 20)
                    System.out.println("Kova");
                else
                    System.out.println("Balık");

                break;
            case 3:
                System.out.printf("Mart--");
                if (day < 21)
                    System.out.println("Balık");
                else
                    System.out.println("Koç");
                break;
            case 4:
                System.out.printf("Nisan--");
                if (day < 21)
                    System.out.println("Koç");
                else
                    System.out.println("Boğa");
                break;
            case 5:
                System.out.printf("Mayıs--");
                if (day < 22)
                    System.out.println("Boğa");
                else
                    System.out.println("İkizler");
                break;
            case 6:
                System.out.printf("Haziran--");
                if (day < 23)
                    System.out.println("İkizler");
                else
                    System.out.println("Yengeç");
                break;
            case 7:
                System.out.printf("Temmuz--");
                if (day < 23)
                    System.out.println("Yengeç");
                else
                    System.out.println("Aslan");
                break;
            case 8:
                System.out.printf("Ağustos--");
                if (day < 23)
                    System.out.println("Aslan");
                else
                    System.out.println("Başak");
                break;
            case 9:
                System.out.printf("Eylül--");
                if (day < 23)
                    System.out.println("Başak");
                else
                    System.out.println("Terazi");
                break;
            case 10:
                System.out.printf("Ekim--");
                if (day < 23)
                    System.out.println("Terazi");
                else
                    System.out.println("Akrep");
                break;
            case 11:
                System.out.printf("Kasım--");
                if (day < 22)
                    System.out.println("Akrep");
                else
                    System.out.println("Yay");
                break;
            case 12:
                System.out.printf("Aralık--");
                if (day < 22)
                    System.out.println("Yay");
                else
                    System.out.println("Oğlak");
                break;


        }
    }
}