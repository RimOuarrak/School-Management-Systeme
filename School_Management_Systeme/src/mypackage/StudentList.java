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
	            if (student.getID() == id) {
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
	                        newStudent.setID(id);
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
	                newStudent.setAddress(tempString);
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
	        // phone number

	        while (true) {
	            System.out.print("Student phone number      : ");
	            tempString = input.nextLine();
	            if (InputChecker.isInteger(tempString)) {
	                newStudent.setPhonenbr(Integer.parseInt(tempString));
	                break;
	            } else {
	                System.out.println("(!) Invalid input data");
	            }
	        }

	        //
	        return newStudent;
	    }

}
