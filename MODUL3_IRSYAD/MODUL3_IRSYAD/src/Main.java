import java.util.Scanner;
import java.util.InputMismatchException;

class Main {
    public static void main(String[] args) {

        boolean repeat = true;
        Scanner scan = new Scanner(System.in);
        Calculation hitung = new Calculation();

        do {
            try {
                System.out.println("\n==Menu Program==");
                System.out.println("1. Square");
                System.out.println("2. Circle");
                System.out.println("3. Trapezoid");
                System.out.println("0. Exit");
                System.out.print("Pilih menu : ");
                int menu = scan.nextInt();

                switch (menu) {

                    case 1:

                        System.out.print("\nMasukkan sisi persegi : ");
                        double persegi = scan.nextDouble();
                        hitung.setSquare(persegi);
                        hitung.run();
                        System.out.println("\nHasil Persegi : " + hitung.getSquare());
                        break;

                    case 2:

                        System.out.print("\nMasukkan jari-jari lingkaran : ");
                        double lingkaran = scan.nextDouble();
                        hitung.setCircle(lingkaran);
                        hitung.run();
                        System.out.println("\nHasil Lingkaran : " + hitung.getCircle());
                        break;

                    case 3:

                        System.out.print("\nMasukkan sisi atas trapesium : ");
                        double a = scan.nextDouble();
                        System.out.print("Masukkan sisi bawah trapesium : ");
                        double b = scan.nextDouble();
                        System.out.print("Masukkan tinggi trapesium : ");
                        double t = scan.nextDouble();
                        hitung.setTrapezoid(a, b, t);
                        hitung.run();
                        System.out.println("\nHasil Trapesium: " + hitung.getTrapezoid());
                        break;

                    case 0:

                        System.out.println("\nProgram End");
                        break;

                    default:

                        System.out.println("\nOption not availaible");
                        continue;

                }
                repeat = false;

            } catch (InputMismatchException e) {
                System.out.println("\n====Error : Input must be number====");
                scan.next();
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());

            }
        } while (repeat);

        scan.close();
    }
}