package model;

/**
 * Created by bitzero on 6/26/18.
 */
public class Student {

    private String firstName;
    private String lastName;
    private String unit;
    private String course;
    private Gender gender;
    private int age;
    private int grade;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String studentToString(){
        return " firstName " + firstName +
                " lastName :: " + lastName +
                " unit :: " +   unit +
                " course :: " + course +
                " gender :: " +  gender.getName() +
                " age :: " + age +
                " grade :: " + grade + "\n";
    }
}
