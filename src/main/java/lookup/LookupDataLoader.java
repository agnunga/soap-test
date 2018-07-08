package lookup;

import model.Gender;
import model.Student;

import java.io.*;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.util.*;
import java.util.logging.FileHandler;
import java.util.logging.Logger;

/**
 * Created by bitzero on 6/26/18.
 */
public class LookupDataLoader {

    private Logger logger = Logger.getLogger(getClass().getSimpleName());
    FileHandler fileHandler;

    public LookupDataLoader(){

        try {
            fileHandler = new FileHandler("LookupDataLoader.log");
        } catch (IOException e) {
            e.printStackTrace();
        }
        logger.addHandler(fileHandler);
    }

    public boolean loadDataFromLookup(String cvsFileName, String url){
        return downloadFromURL(cvsFileName, url);
    }

    public boolean downloadFromURL(String filename, String url){

        try{
            URL download=new URL(url);
            ReadableByteChannel rbc= Channels.newChannel(download.openStream());
            FileOutputStream fileOut = new FileOutputStream(filename);
            fileOut.getChannel().transferFrom(rbc, 0, 1 << 24);
            fileOut.flush();
            fileOut.close();
            rbc.close();
            return true;
        }catch(Exception e){ e.printStackTrace();
        }
        return false;
    }

    public List<Student> readDownloadedCsv() {

        String csvFile = "Students3DArrayTest.csv";
        BufferedReader br = null;
        String line = "";
        String splitter = ",";
        int count = 0 ;
        List<Student> students = new LinkedList<Student>();

        try {

            br = new BufferedReader(new FileReader(csvFile));

            while ((line = br.readLine()) != null) {
                if(count > 0) {
                    Student student = new Student();
                    // use comma as separator
                    String[] data = line.split(splitter);
                    student.setFirstName(data[0]);
                    student.setLastName(data[1]);
                    student.setUnit(data[2]);
                    student.setCourse(data[3]);
                    student.setGender(Gender.getGender(data[4]));
                    student.setAge(Integer.parseInt(data[5]));
                    student.setGrade(Integer.parseInt(data[6]));

                    students.add(student);
                }
                count ++;
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        Set<Student> set = new LinkedHashSet<Student>(students);

//        logger.info("students " + students.size());
//        logger.info("hashSet " + set.size());

        for (Student s: students) {
            logger.info(s.studentToString());
        }
        return students;
    }

    /*The Compare students method will help Find Duplicates*/
    public int compareStudents(Student student, Student other) {
        int i = student.getFirstName().compareTo(other.getFirstName());
        if (i != 0) return i;

        i = student.getLastName().compareTo(other.getLastName());
        if (i != 0) return i;

        i = student.getGender().compareTo(other.getGender());
        if (i != 0) return i;

        if(student.getAge() == other.getAge()){
            return 0;
        }
        return 1;
    }

    /*A list Of students taking a given Course or/and of a given gender*/
    public List<Student> extractSpecificStudents(List<Student> students, String courseName, Gender gender) {
        List<Student> studentList = new ArrayList<Student>();
        for (Student student: students) {
            if(student.getCourse().equalsIgnoreCase(courseName)){
                if (gender != null && student.getGender().equals(gender))
                    studentList.add(student);
                else
                    studentList.add(student);
            }
        }
        return studentList;
    }

    /*A list Of students taking a given Course or/and of a given gender*/
    public List<Student> extractOrder(List<Student> students, int grade, Gender gender) {
        List<Student> maleStudents = new ArrayList<Student>();
        List<Student> femaleStudents = new ArrayList<Student>();

       return null;
    }

}
