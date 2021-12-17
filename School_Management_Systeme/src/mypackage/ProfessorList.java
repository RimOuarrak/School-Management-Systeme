package mypackage;

import java.util.ArrayList;
import java.util.Scanner;

public class ProfessorList {
    /**
	     * User choice.
	     */
	    private static int choice;

	    /***
	     * User input from keyboard.
	     */
	    private static Scanner input;

	    /***
	     * Store Professor list.
	     */
	    private static ArrayList<Professor> professors = new ArrayList<Professor>();

	    /***
	     * Check if Professor list is empty.
	     * 
	     * @return True if empty (no elements)
	     */
	    public static boolean isEmptyList() {
	        return (professors.size() == 0);
	    }
        
        /***
	     * Check if an ID is existed.
	     * 
	     * @param id
	     *            ID to check.
	     * @return True if id is existed
	     */
	    public static boolean isIDExisted(final int id) {
	        //
	        for (Professor professor : professors) {
	            if (professor.getId() == id) {
	                return true;
	            }
	        }

	        return false;
	    }
        
	    /***
	     * Add 1 Professor.
	     * 
	     * @param isCheckID
	     *            If true it will check if a ID is already exists.
	     * 
	     * @return a new Professor.
	     */
	    private static Professor createProfessor(final boolean isCheckID) {

	        // 
	        Professor newProfessor = new Professor();
	        String tempString = "";

	        // id
	        while (true) {
	            System.out.print("Professor ID         : ");
	            tempString = input.nextLine();
	            if (InputChecker.isInteger(tempString)) {
	                int id = Integer.parseInt(tempString);
	                if (isCheckID) {
	                    if (isIDExisted(id)) {
	                        System.out.println("(!) This ID already existed");
	                    } else {
	                        newProfessor.setId(id);
	                        break;
	                    }
	                } else {
	                    break;
	                }
	            } else {
	                System.out.println("(!) Invalid input data");
	            }
	        }

	        // name
	        while (true) {
	            System.out.print("Professor name       : ");
	            tempString = input.nextLine();
	            if (tempString.length() != 0) {
	                newProfessor.setName(tempString);
	                break;
	            } else {
	                System.out.println("(!) Invalid input data");
	            }
	        }

	        // image
	        while (true) {
	            System.out.print("Professor image      : ");
	            tempString = input.nextLine();
	            if (tempString.length() != 0) {
	                newProfessor.setImage(tempString);
	                break;
	            } else {
	                System.out.println("(!) Invalid input data");
	            }
	        }

	        // address
	        while (true) {
	            System.out.print("Professor address    : ");
	            tempString = input.nextLine();
	            if (tempString.length() != 0) {
	                newProfessor.setAdresse(tempString);
	                break;
	            } else {
	                System.out.println("(!) Invalid input data");
	            }
	        }
            
            //email
	        while (true) {
	            System.out.print("Professor Email    : ");
	            tempString = input.nextLine();
	            if (tempString.length() != 0) {
	                newProfessor.setEmail(tempString);
	                break;
	            } else {
	                System.out.println("(!) Invalid input data");
	            }
	        }

	        // phone number
	        while (true) {
	            System.out.print("Professor phone number      : ");
	            tempString = input.nextLine();
	            if (InputChecker.isInteger(tempString)) {
	                newProfessor.setPhoneNbr(tempString);
	                break;
	            } else {
	                System.out.println("(!) Invalid input data");
	            }
	        }
			// salary 
	        while (true) {
	            System.out.print("Professor phone number      : ");
	            tempString = input.nextLine();
	            if (InputChecker.isDouble(tempString)) {
	                newProfessor.setSalary(Double.parseDouble(tempString));
	                break;
	            } else {
	                System.out.println("(!) Invalid input data");
	            }
	        }

	        //
	        return newProfessor;
	    }
		    /***
	     * Edit list of professors.
	     */
	    public static void editList() {
	        
	        // temporary data.
	        String tempString = "";
	        int professorID = 0;

	        // get right input from user
	        while (true) {
	            System.out.print("(?) Professor ID: ");
	            tempString = input.nextLine();

	            if (InputChecker.isInteger(tempString)) {
	                professorID = Integer.parseInt(tempString);
	                break;
	            }

	            System.out.println("(!) Invalid input data");
	        }

	        // check and solve
	        if (isIDExisted(professorID)) {
	            professors.add(createProfessor(false));
	            System.out.println("(i) Add successful");
	        } else {
	            System.out.println("(i) Professor ID does not exist");
	        }
	    }

		/***
	     * Add 1 Professor to list.
	     */
	    public static void addList() {
	        Professor newProfessor =  createProfessor(true);

	        professors.add(newProfessor);

	        System.out.println("Add Professor successful");
	    }
		
		/***
	     * Delete 1 Professor.
	     */
	    public static void deleteList() {
	        
	        // 
	        String tempString = "";
	        int professorID = 0;

	        // get right input from user
	        while (true) {
	            System.out.print("(?) Professor ID: ");
	            tempString = input.nextLine();

	            if (InputChecker.isInteger(tempString)) {
	                professorID = Integer.parseInt(tempString);
	                break;
	            }
	            System.out.println("(!) Invalid input data");
	        }

	        // check and solve
	        if (isIDExisted(professorID)) {
	            professors.remove(professorID);
	            System.out.println("(i) Delete successful");
	        } else {
	            System.out.println("(i) Professor ID does not exist");
	        }

	    }
	/***
     * show list of students.
     */
    public static void showList() {

        int size = professors.size();

        for (int i = 0; i < size; i++) {
            System.out.println("Student No." + (i + 1));
            System.out.println(professors.get(i).toString());
        }
    }

}
