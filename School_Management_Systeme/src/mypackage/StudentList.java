package mypackage;

import java.util.ArrayList;
import java.util.Scanner;


public final class StudentList {
	
		/**
	     * User choice.
	     */
	    private static int choice;

	    /***
	     * User input from keyboard.
	     */
	    private static Scanner input;

	    /***
	     * Store students list.
	     */
	    private static ArrayList<Student> listStudent = new ArrayList<Student>();

	    /***
	     * Check if student list is empty.
	     * 
	     * @return True if empty (no elements)
	     */
	    public static boolean isEmptyList() {
	        return (listStudent.size() == 0);
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
	        for (Student student : listStudent) {
	            if (student.getId() == id) {
	                return true;
	            }
	        }

	        return false;
	    }
	
	    /***
	     * Add 1 student.
	     * 
	     * @param isCheckID
	     *            If true it will check if a ID is already exists.
	     * 
	     * @return a new student.
	     */
	    private static Student createStudent(final boolean isCheckID) {

	        // 
	        Student newStudent = new Student();
	        String tempString = "";

	        // id
	        while (true) {
	            System.out.print("Student ID         : ");
	            tempString = input.nextLine();
	            if (InputChecker.isInteger(tempString)) {
	                int id = Integer.parseInt(tempString);
	                if (isCheckID) {
	                    if (isIDExisted(id)) {
	                        System.out.println("(!) This ID already existed");
	                    } else {
	                        newStudent.setId(id);
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
	            System.out.print("Student name       : ");
	            tempString = input.nextLine();
	            if (tempString.length() != 0) {
	                newStudent.setName(tempString);
	                break;
	            } else {
	                System.out.println("(!) Invalid input data");
	            }
	        }

	        // score
	        while (true) {
	            System.out.print("Student score      : ");
	            tempString = input.nextLine();
	            if (InputChecker.isFloat(tempString)) {
	                newStudent.setScore(Float.parseFloat(tempString));
	                break;
	            } else {
	                System.out.println("(!) Invalid input data");
	            }
	        }

	        // image
	        while (true) {
	            System.out.print("Student image      : ");
	            tempString = input.nextLine();
	            if (tempString.length() != 0) {
	                newStudent.setImage(tempString);
	                break;
	            } else {
	                System.out.println("(!) Invalid input data");
	            }
	        }

	        // address
	        while (true) {
	            System.out.print("Student address    : ");
	            tempString = input.nextLine();
	            if (tempString.length() != 0) {
	                newStudent.setAdresse(tempString);
	                break;
	            } else {
	                System.out.println("(!) Invalid input data");
	            }
	        }

	        // description
	        while (true) {
	            System.out.print("Student description: ");
	            tempString = input.nextLine();
	            if (tempString.length() != 0) {
	                newStudent.setDescription(tempString);
	                break;
	            } else {
	                System.out.println("(!) Invalid input data");
	            }
	        }
			
	        // Email
	        while (true) {
	            System.out.print("Student Email: ");
	            tempString = input.nextLine();
	            if (tempString.length() != 0) {
	                newStudent.setEmail(tempString);
	                break;
	            } else {
	                System.out.println("(!) Invalid input data");
	            }
	        }
	        // phone number

	        while (true) {
	            System.out.print("Student phone number      : ");
	            tempString = input.nextLine();
	            if (InputChecker.isInteger(tempString)) {
	                newStudent.setPhoneNbr(Integer.parseInt(tempString));
	                break;
	            } else {
	                System.out.println("(!) Invalid input data");
	            }
	        }

	        //
	        return newStudent;
	    }
	    /***
	     * Private constructor.
	     */
	    private StudentList() {
	    }

	    /***
	     * Initiate.
	     */
	    public static void init() {
	        choice = 0;
	        input = new Scanner(System.in);
	        listStudent.clear();
	    }

	    /***
	     * Edit list of students.
	     */
	    public static void editList() {
	        
	        // temporary data.
	        String tempString = "";
	        int studentID = 0;

	        // get right input from user
	        while (true) {
	            System.out.print("(?) Student ID: ");
	            tempString = input.nextLine();

	            if (InputChecker.isInteger(tempString)) {
	                studentID = Integer.parseInt(tempString);
	                break;
	            }

	            System.out.println("(!) Invalid input data");
	        }

	        // check and solve
	        if (isIDExisted(studentID)) {
	            listStudent.add(createStudent(false));
	            System.out.println("(i) Add successful");
	        } else {
	            System.out.println("(i) Student ID does not exist");
	        }
	    }

	    /***
	     * Add 1 student to list.
	     */
	    public static void addList() {
	        Student newStudent = createStudent(true);

	        listStudent.add(newStudent);

	        System.out.println("Add student successful");
	    }
	    /***
	     * Delete 1 student.
	     */
	    public static void deleteList() {
	        
	        // 
	        String tempString = "";
	        int studentID = 0;

	        // get right input from user
	        while (true) {
	            System.out.print("(?) Student ID: ");
	            tempString = input.nextLine();

	            if (InputChecker.isInteger(tempString)) {
	                studentID = Integer.parseInt(tempString);
	                break;
	            }
	            System.out.println("(!) Invalid input data");
	        }

	        // check and solve
	        if (isIDExisted(studentID)) {
	            listStudent.remove(studentID);
	            System.out.println("(i) Delete successful");
	        } else {
	            System.out.println("(i) Student ID does not exist");
	        }

	    }


	/***
     * show list of students.
     */
    public static void showList() {

        int size = listStudent.size();

        for (int i = 0; i < size; i++) {
            System.out.println("Student No." + (i + 1));
            System.out.println(listStudent.get(i).toString());
        }
    }
}
