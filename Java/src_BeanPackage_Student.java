package BeanPackage;

public class Student extends Person {

    public int studentId ;
    public EducationDetails edudetails;

    @Override
    public String toString() {

        return this.studentId + this.firstName + this.lastName;
    }

    @Override
    public void print() {
        System.out.println("in class student");
    }
}

