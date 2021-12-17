package mypackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public final class SortStudentList {

    /***
     * Private constructor.
     */
    private SortStudentList() {

    }
    /***
     * 
     * @param listStudent
     *            Input a list to sort
     */
    public static void sortIDIncrease(final ArrayList<Student> listStudent) {
        Collections.sort(listStudent, new Comparator<Student>() {
            @Override
            public int compare(final Student o1, final Student o2) {
                return Integer.compare(o1.getId(), o2.getId());
            }
        });
    }

    /***
     * 
     * @param listStudent
     *            Input a list to sort
     */
    public static void sortIDDecrease(final ArrayList<Student> listStudent) {
        Collections.sort(listStudent, new Comparator<Student>() {
            @Override
            public int compare(final Student o1, final Student o2) {
                return Integer.compare(o2.getId(), o1.getId());
            }
        });
    }

    /***
     * 
     * @param listStudent
     *            Input a list to sort
     * 
     */
    public static void sortScoreIncrease(final ArrayList<Student> listStudent) {
        Collections.sort(listStudent, new Comparator<Student>() {
            @Override
            public int compare(final Student o1, final Student o2) {
                return Float.compare(o1.getScore(), o2.getScore());
            }

        });
    }

    /***
     * 
     * @param listStudent
     *            Input a list to sort
     */
    public static void sortScoreDecrease(final ArrayList<Student> listStudent) {
        Collections.sort(listStudent, new Comparator<Student>() {
            @Override
            public int compare(final Student o1, final Student o2) {
                return Float.compare(o2.getScore(), o1.getScore());
            }

        });
    }

 
}
