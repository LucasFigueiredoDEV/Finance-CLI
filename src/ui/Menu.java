package src.ui;

import java.util.Scanner;

public class Menu {

    private final Scanner scanner;

    public Menu(Scanner scanner) {
        this.scanner = scanner;
    }

    public void show() {
        System.out.println("\n=== SISTEMA FINANCEIRO ===");
        System.out.println("1. Register income");
        System.out.println("2. Register expense");
        System.out.println("3. List transactions");
        System.out.println("4. View financial summary");
        System.out.println("0. Exit");
        System.out.print("Choose an option: ");
    }

    public int readOption() {
        return scanner.nextInt();
    }
}