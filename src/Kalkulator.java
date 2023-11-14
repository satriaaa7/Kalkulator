import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("=== Calculator ===");
            System.out.println("1. Akar Kuadrat");
            System.out.println("2. Pangkat");
            System.out.println("3. Logaritma");
            System.out.println("4. Faktorial");
            System.out.println("5. Keluar");

            System.out.print("Pilih operasi (1/2/3/4/5): ");
            int Pilih = scanner.nextInt();

            switch (Pilih) {
                case 1:
                    squareRoot();
                    break;
                case 2:
                    power();
                    break;
                case 3:
                    logarithm();
                    break;
                case 4:
                    factorial();
                    break;
                case 5:
                    System.out.println("Terima kasih telah menggunakan kalkulator ini.");
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
            }
        }
    }

    private static void squareRoot() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        double number = scanner.nextDouble();

        double result = Math.sqrt(number);

        System.out.println("Hasil akar kuadrat dari " + number + " adalah " + result);
    }

    private static void power() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        double base = scanner.nextDouble();

        System.out.print("Masukkan pangkat: ");
        double exponent = scanner.nextDouble();

        double result = Math.pow(base, exponent);

        System.out.println(base + " pangkat " + exponent + " adalah " + result);
    }

    private static void logarithm() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        double number = scanner.nextDouble();

        double result = Math.log(number);

        System.out.println("Logaritma natural dari " + number + " adalah " + result);
    }

    private static void factorial() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int number = scanner.nextInt();

        long result = 1;

        for (int i = 1; i <= number; i++) {
            result *= i;
        }

        System.out.println("Faktorial dari " + number + " adalah " + result);
    }
}