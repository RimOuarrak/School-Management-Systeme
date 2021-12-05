package mypackage;

import java.util.Scanner;

/**
 * @author Yong Kang
 * @version 1.0 Mar 7, 2017
 */

public final class Main {

    /***
     * User scanner from keyboard.
     */
    private static Scanner scanner;

    /***
     * User choice.
     */
    private static int choice;

    /**
     * Constructor.
     */
    private Main() {

    }

    /**
     * 
     * @param args
     *            Agrs isnot use.
     */
    public static void main(final String[] args) {

        // initiate
        choice = 0;
        scanner = new Scanner(System.in);

        StudentList.init();

        Boolean isExit = false;
        String temp = "";

        while (true) {
            System.out.println("Student Management System");
            System.out.println(
                    "#" + constants.ADD_STUDENT_FUNCTION + ". Add student");
            System.out.println("#" + constants.UPDATE_STUDENT_FUNCTION
                    + ". Update student info");
            System.out.println("#" + constants.DETELE_STUDENT_FUNCTION
                    + ". Delete sudent");
            System.out.println("#" + constants.SHOW_STUDENT_FUNCTION
                    + ". Show student list");
            System.out.println("#" + constants.SORT_STUDENT_FUNCTION
                    + ". Sort student list");
            System.out.println("#" + constants.IMPORT_STUDENT_FUNCTION
                    + ". Import student list");
            System.out.println("#" + constants.EXPORT_STUDENT_FUNCTION
                    + ". Export student list");
            System.out.println("#" + constants.EXIT_FUNCTION + ". Exit");

            // get user choice
            while (true) {
                System.out.print("(?) Your choice: ");
                temp = scanner.nextLine();
                if (InputChecker.isInteger(temp)) {
                    choice = Integer.parseInt(temp);
                    break;
                } else {
                    System.out.println("(!) Invalid scanner data");
                }
            }
            
            // solve
            switch (choice) {
            case constants.ADD_STUDENT_FUNCTION:
                StudentList.addList();
                break;
            case constants.UPDATE_STUDENT_FUNCTION:
                StudentList.editList();
                break;
            case constants.DETELE_STUDENT_FUNCTION:
                StudentList.deleteList();
                break;
            case constants.SHOW_STUDENT_FUNCTION:
                StudentList.showList();
                break;
            case constants.SORT_STUDENT_FUNCTION:
                StudentList.sortList();
                break;
            case constants.IMPORT_STUDENT_FUNCTION:
                // get file type info
                int choiceFileTypeIM;

                System.out.println("Choose file type");
                System.out.println("#1. File binary");
                System.out.println("#2. File text (csv)");

                // get right input from user
                while (true) {
                    System.out.print("(?) Your choice: ");
                    temp = scanner.nextLine();

                    if (InputChecker.isInteger(temp)) {
                        choiceFileTypeIM = Integer.parseInt(temp);
                        if (choiceFileTypeIM == 1) {
                            StudentList.importList("bin");
                        } else if (choiceFileTypeIM == 2) {
                            StudentList.importList("text");
                        } else {
                            System.out.println("(!) Invalid choice");
                        }
                        break;
                    } else {
                        System.out.println("(!) Invalid scanner data");
                    }
                }
                break;

            case constants.EXPORT_STUDENT_FUNCTION:
                    // get file type info
                int choiceFileTypeEX;
                System.out.println("Choose file type?");
                System.out.println("#1. File binary");
                System.out.println("#2. File text (csv)");

                // get right input from user
                while (true) {
                    System.out.print("(?) Your choice: ");
                    temp = scanner.nextLine();

                    if (InputChecker.isInteger(temp)) {
                        choiceFileTypeEX = Integer.parseInt(temp);
                        if (choiceFileTypeEX == 1) {
                            StudentList.exportList("bin");
                        } else if (choiceFileTypeEX == 2) {
                            StudentList.exportList("text");
                        } else {
                            System.out.println("(!) Invalid choice");
                        }
                        break;
                    } else {
                        System.out.println("(!) Invalid scanner data");
                    }
                }
                break;
            case constants.EXIT_FUNCTION:
                isExit = true;
                break;
            default:
                System.out.println("Invalid choice");
                break;
            }

            // 
            if (isExit) {
                break;
            }

            // 
            clearConsole();
            System.out.println("Press enter to continue");

            // pause console
            while (temp != null) {
                if (temp.isEmpty()) {
                    break;
                }

                if (scanner.hasNextLine()) {
                    temp = scanner.nextLine();
                } else {
                    temp = null;
                }
            }
        }

        clearConsole();
        System.out.println("---Thank you for using my program---");
    }

    /***
     * Use to clear console.
     * Removed code because eclipse's console error. 
     */
    private static void clearConsole() {
        System.out.println("-------------------------------------------------");
    }
}