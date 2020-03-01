package Helpers;

import BeanPackage.ClassRoom;
import BeanPackage.Employee;
import BeanPackage.Student;

import java.util.ArrayList;
import java.util.List;

public class ClassRoomHelper {
    ClassRoom classRoom1 = new ClassRoom();
    ClassRoom classRoom2 = new ClassRoom();
    ClassRoom classRoom3 = new ClassRoom();

    public void addStudent(
            String firstName,
            String lastName,
            String city,
            String state,
            String empId,
            boolean hasLaptop,
            ClassRoom classRoom) {
        Student student = new Student();
        student.firstName = firstName;
        student.lastName = lastName;
        student.city = city;
        student.hasLaptop = hasLaptop;
        List<Student> studentlist = classRoom.getStudentList();
        
        if(null == studentlist) {
            studentlist = new ArrayList<>();
            
        }
        
        studentlist.add(student);
        classRoom.setStudentList(studentlist);


    }

    public void addTeacher(
            String firstName,
            String lastName,
            String city,
            String state,
            String empId,
            boolean hasLaptop,
            ClassRoom classRoom) {
        Employee teacher = new Employee();
        teacher.firstName = firstName;
        teacher.lastName = lastName;
        teacher.city = city;
        teacher.EmployeeID = empId;
        teacher.hasLaptop = hasLaptop;


        classRoom.setTeacher(teacher);
    }

    public ClassRoom prepareClass(
            String name,
            int tables,
            int chairs,
            boolean hasProjector
            ) {


        ClassRoom classRoom = new ClassRoom();
        classRoom.setChairs(chairs);
        classRoom.setTables(tables);
        classRoom.setName(name);
        classRoom.setHasProjector(hasProjector);


        return classRoom;
    }

    public void printAll(ClassRoom classRoom) {
        System.out.println("this is " + classRoom.getName());
        if(classRoom.isHasProjector()){
            System.out.println("Projector is present");
        }
        
        else {
            System.out.println("projector is not present");
        }

        System.out.println("Teacher Name is" + classRoom.getTeacher().firstName + " " + classRoom.getTeacher().lastName);
    }
}
