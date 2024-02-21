import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int k;
        int b = 0;

        // Kullanıcıdan bir değer girmesini bekliyoruz.
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        k = input.nextInt();

        //Girilen değere kadar, istenilen koşulun yazdırıldığı bir döngü başlatıyoruz.
        for (int i = 1; i <= k; i *= 4) {

            System.out.println("4'ün " + b + " kuvveti " + i);
            b++;
        }

        //Girilen değere kadar, istenilen diğer koşulun yazdırıldığı bir döngü başlatıyoruz.
        //b değerinin yukarıda değeri değiştiği için, öncede sıfıra eşitliyoruz.
        b = 0;
        for (int i = 1; i <= k; i *= 5) {

            System.out.println("5'in " + b + " kuvveti " + i);
            b++;
        }

    }

}