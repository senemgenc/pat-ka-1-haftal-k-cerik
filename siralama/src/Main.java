import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("1. Sayıyı Giriniz: ");
        int sayi1 = scanner.nextInt();

        System.out.print("2. Sayıyı Giriniz: ");
        int sayi2 = scanner.nextInt();

        System.out.print("3. Sayıyı Giriniz: ");
        int sayi3 = scanner.nextInt();
        
        int[] sayilar = {sayi1, sayi2, sayi3};
        java.util.Arrays.sort(sayilar);

        System.out.println("Küçükten Büyüğe Sıralanmış Hali:");
        for (int sayi : sayilar) {
            System.out.println(sayi);
        }
    }
}