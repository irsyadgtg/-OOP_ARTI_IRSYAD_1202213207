package TPMODUL3_IRSYAD;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Restaurant machine = new Restaurant();
        int customerID, orderQty;
        try {

            System.out.println("Enter Customer ID: ");
            customerID = input.nextInt();

            System.out.println("Enter how much food to made: ");
            orderQty = input.nextInt();

            Thread t1 = new Thread(machine);
            Waiters Waiters = new Waiters(customerID, orderQty);
            Thread t2 = new Thread(Waiters);

            t1.start();
            t2.start();
            t1.join();
            t2.join();

        } catch (Exception e) {
            System.out.println("Input must be Integer");
        }

    }

}