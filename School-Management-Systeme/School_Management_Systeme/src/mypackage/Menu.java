package mypackage;

import java.util.Scanner;

public class Menu {
    private void displayHeader(String message){
        System.out.println();
        int width = message.length() + 6;
        StringBuilder sb = new StringBuilder();
        sb.append("+");
        for(int i = 0; i < width; ++i){
            sb.append("-");
        }
        sb.append("+");
        System.out.println(sb.toString());
        System.out.println("|   " + message + "   |");
        System.out.println(sb.toString());
    }
    private void printHeader() {
        System.out.println("+-----------------------------------+");
        System.out.println("|        Welcome !          |");
        System.out.println("|        Awesome School App           |");
        System.out.println("+-----------------------------------+");
    }

    private void printMenu() {
        printHeader();
        displayHeader("Please make a selection");
        System.out.println("1) Create a new Student");
        System.out.println("2) drop a student");
        System.out.println("3) show student's informations");
        System.out.println("4) show all student");
        System.out.println("5) Create a new Professor");
        System.out.println("6) drop a Professor");
        System.out.println("7) show Professor's informations");
        System.out.println("8) show all Professors");
        System.out.println("0) Exit");
    }
    private int getMenuChoice() {
        Scanner keyboard = new Scanner(System.in);
        int choice = -1;
        do {
            System.out.print("Enter your choice: ");
            try {
                choice = Integer.parseInt(keyboard.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid selection. Numbers only please.");
            }
            if (choice < 0 || choice > 8) {
                System.out.println("Choice outside of range. Please chose again.");
            }
        } while (choice < 0 || choice > 8);
        return choice;
    }
    public static void main(String[] args) {
        Menu m = new Menu();
        m.printMenu();
       System.out.println(m.getMenuChoice()); 
    }
}
