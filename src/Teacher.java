import java.util.ArrayList;
public class Teacher {

    ArrayList<String> TeacherSubjects;
    String TeacherName;

    private double TeacherSalary;

    private String TeacherEducation;

    //Getters
    String GetTeacherEducation() {return TeacherEducation;}
    double GetTeachersalary() {return TeacherSalary;}

    //Setters
    void setTeacherEducation(String newTeacherEducation) {TeacherEducation = TeacherEducation;}

    void setTeacherSalary(double newTeacherSalary) {TeacherSalary = TeacherSalary;}

    //Constructor
    Teacher(ArrayList<String> TeacherSubjects, String Name, double TeacherSalary, String TeacherEducation) {

        this.TeacherSubjects = TeacherSubjects;
        this.TeacherName = TeacherName;
        this.TeacherSalary = TeacherSalary;
        this.TeacherEducation = TeacherEducation;

    }

    void TeacherDetails() {




    }












}
