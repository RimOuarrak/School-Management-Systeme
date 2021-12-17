package mypackage;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;



public final class FileFactory {

    /**
     * Constructor.
     */
    private FileFactory() {

    }

    /***
     * 
     * @param path
     *            File path that need to read.
     * @return List of student read from file.
     */
    public static ArrayList<Student> readFile(final String path) {

        // temporary student.
        Student studentTemp = new Student();
        ArrayList<Student> listStudent = new ArrayList<Student>();

        try {
            // open file in UTF-8
            FileInputStream fileInputStream = new FileInputStream(path);
            InputStreamReader inputStreamReader = new InputStreamReader(
                    fileInputStream, "UTF-8");
            BufferedReader bufferedReader = new BufferedReader(
                    inputStreamReader);

            // read .csv file header
            bufferedReader.readLine();

            String line = bufferedReader.readLine();

            // while there is data in the file
            while (line != null) {

                // split data with ','
                String[] arr = line.split(",");
                if (arr.length == Constants.NUMBER_OF_FIELD) {
                    studentTemp = new Student();

                    studentTemp.setId(Integer.parseInt(arr[Constants.CODE_POS]));
                    studentTemp.setName(arr[Constants.NAME_POS]);
                    studentTemp.setScore(Float.parseFloat(arr[Constants.POINT_POS]));
                    studentTemp.setImage(arr[Constants.IMAGE_POS]);
                    studentTemp.setAdresse(arr[Constants.ADDRESS_POS]);
                    studentTemp.setDescription(arr[Constants.NOTE_POS]);
                    studentTemp.setPhoneNbr(arr[Constants.PHONE_POS]);
                    studentTemp.setPhoneNbr(arr[Constants.EMAIL_POS]);

                    listStudent.add(studentTemp);
                }

                line = bufferedReader.readLine();
            }

            // close file
            bufferedReader.close();
            inputStreamReader.close();
            fileInputStream.close();
        } catch (Exception e) {
            System.out.println("#####ERROR#####");
            listStudent.clear();
        }

        // return studen list
        return listStudent;
    }

    /***
     * 
     * @param list
     *            List of all students that will write to file.
     * @param path
     *            File path that student list will be save.
     * @return True if complete, false if error.
     */
    public static Boolean writeFile(final ArrayList<Student> list,
            final String path) {
        try {
            // create file stream in UTF-8
            FileOutputStream fileOutputStream = new FileOutputStream(path);
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(
                    fileOutputStream, "UTF-8");
            BufferedWriter bufferedWriter = new BufferedWriter(
                    outputStreamWriter);

            // write file header
            bufferedWriter.write(Constants.CSV_FILE_HEADER);
            bufferedWriter.newLine();

            // write list
            for (Student student : list) {
                String data = student.toStringSaveFile();
                bufferedWriter.write(data);
                bufferedWriter.newLine();
            }

            // close file
            bufferedWriter.close();
            outputStreamWriter.close();
            fileOutputStream.close();

            return true;
        } catch (Exception e) {
            System.out.println("#####ERROR#####");
        }

        // return false if any error.
        return false;
    }

    /***
     * 
     * @param path
     *            File path that need to import.
     * @return List of Student read from file.
     */
    public static ArrayList<Student> readFileBinary(final String path) {
        Student studentTemp = new Student();
        ArrayList<Student> listStudent = new ArrayList<Student>();

        try {
            // create file
            DataInputStream dis = new DataInputStream(
                    new FileInputStream(new File(path)));

            // read size of list
            int size = dis.readInt();

            // read all
            for (int i = 0; i < size; i++) {
                studentTemp = new Student();
                studentTemp.setId(dis.readInt());
                studentTemp.setName(dis.readUTF());
                studentTemp.setScore(dis.readFloat());
                studentTemp.setImage(dis.readUTF());
                studentTemp.setAdresse(dis.readUTF());
                studentTemp.setDescription(dis.readUTF());
                studentTemp.setAttendance(dis.readUTF());
                studentTemp.setPhoneNbr(dis.readUTF());
                studentTemp.setEmail(dis.readUTF());
                listStudent.add(studentTemp);
            }

            dis.close();

        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("#####ERROR#####");
            listStudent.clear();
        }

        // return data.
        return listStudent;
    }

    /***
     * 
     * @param list
     *            List of all students.
     * @param path
     *            File path that need to write.
     * @return True if complete, false if error.
     */
    public static Boolean writeFileBinary(final ArrayList<Student> list,
            final String path) {
        try {
            // open file in binary mode
            DataOutputStream dos = new DataOutputStream(
                    new FileOutputStream(new File(path)));

            // size
            dos.writeInt(list.size());

            // list
            for (Student student : list) {
                dos.writeInt(student.getId());
                dos.writeUTF(student.getName());
                dos.writeFloat(student.getScore());
                dos.writeUTF(student.getImage());
                dos.writeUTF(student.getAddresse());
                dos.writeUTF(student.getDescription());
                dos.writeUTF(student.getPhoneNbr());
                dos.writeUTF(student.getEmail());
            }

            // close
            dos.flush();
            dos.close();

            return true;
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("#####ERROR#####");
        }

        // if there are an error
        return false;
    }

}
