import src.ui.Menu;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu(scanner);

        int option;

        do {
            menu.show();
            option = menu.readOption();

            switch (option) {
                case 1:
                    System.out.println("Register income");
                    break;

                case 2:
                    System.out.println("Register expense");
                    break;

                case 3:
                    System.out.println("List transactions");
                    break;

                case 4:
                    System.out.println("View financial summary");
                    break;

                case 0:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid option!");
            }

        } while (option != 0);

        scanner.close();
    }
}