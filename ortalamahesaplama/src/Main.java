import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bir sayi giriniz");
        Scanner input = new Scanner(System.in);
        int sayi = input.nextInt();
        int avg;
        int toplam = 0;
        int n = 0;
        for (int i = 1; i <= sayi; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                n++;
                toplam += i;
                System.out.println(i + " sayisi 3 ve 4'e tam bolunur");


            }
        }
        avg = toplam / n;
        System.out.println("Ortalama: " + avg);

    }
}