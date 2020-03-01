package DefaultPackage;

import BeanPackage.EducationDetails;
import BeanPackage.Employee;
import BeanPackage.Person;
import BeanPackage.Student;

import java.util.ArrayList;
import java.util.List;

public class ClassroomExample {


    public static void createClassroom(){
        int chairs = 5;
        int tables = 2;
        int monitors;
        boolean isBoardPresent = true;
        boolean isProjectorPresent = true;
        String className;
        double classStandard;
        double classStandardPercentage = 0.0;
        Person student = new Person();

        List<Student> studentList = getStudentList();

        getStudentList(studentList);


        Employee teacher = new Employee();
        teacher.setCategory("dhurba");
        Employee cook = new Employee("Cook");
        System.out.println(cook.getCategory());

        teacher.firstName = "Basu";
        teacher.state = "Id";
        teacher.country = "india";
        teacher.hasLaptop = true;
        teacher.lastName = "Sapkota";
        teacher.city = "Plano";

        System.out.println("No of chairs " + chairs);
        System.out.println("No of tables " + tables);
        System.out.print("Student name : " + student.firstName);
        System.out.println(" " + student.lastName);
        System.out.println("Student city : " + student.city);
        System.out.println("Student country : " + student.country);

        List<Integer> arrayList = new ArrayList();


        System.out.print("Teacher name : " + teacher.firstName + " ");
        System.out.println(teacher.lastName);
        System.out.println(student.hasLaptop);
        System.out.println(teacher.hasLaptop);
        System.out.println(isBoardPresent);
        System.out.println(isProjectorPresent);








    }

    private static List<Student> getStudentList(){

      //  Student student = new Student();
        Student student1 = new Student();
        Student student2 = new Student();

//        System.out.print(student1.edudetails.degree);
  //      System.out.println(student1.edudetails.degreeType);


        student1.studentId = 33;
     //   student1.edudetails.firstName = "Ronaldo";
        student1.edudetails = new EducationDetails();
        student1.edudetails.degree = "Computer Science  :::: ";
        student1.edudetails.degreeType = EducationDetails.DegreeTypeEnum.Master;
//        student.lastName = "christiano";
//        student.city = "barcelona";
//        student.country = "europe";
//        student.state = "None";
//        student.hasLaptop = true;
//
//        student.firstName = "Sam";
//        student.lastName = "shreshta";
//        student.city = "Kleen";
//        student.country = "USA";
//        student.state = "TX";
//        student.hasLaptop = true;


        student2.firstName = "Sam";
        student2.lastName = "shreshta";
        student2.city = "Kleen";
        student2.country = "USA";
        student2.state = "TX";
        student2.hasLaptop = true;

        List<Student> studentArrayList = new ArrayList<>();
        studentArrayList.add(student1);
        studentArrayList.add(student2);

        return studentArrayList;
    }

    private static void getStudentList(List<Student> studentList){
        for(Student student: studentList) {
            System.out.print("Student name : " + student.firstName);
            System.out.println("Student lastname:  " + student.lastName);
            System.out.println("Student city : " + student.city);
            System.out.println("Student country : " + student.country);
            System.out.println("Student has laptop : " + student.hasLaptop);
//            System.out.println("Student degree : " + student.edudetails.degree);
//            System.out.println("Student degreetype : " + student.edudetails.degreeType);
           // System.out.println("Student degreetype : " + student.edudetails.hasdegree());
        }


    }




}
