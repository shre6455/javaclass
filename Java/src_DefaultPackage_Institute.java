package DefaultPackage;

import BeanPackage.ClassRoom;
import BeanPackage.Employee;
import BeanPackage.Student;
import ComparePackage.SortById;
import ComparePackage.SortByName;
import Helpers.ClassRoomHelper;

import java.util.*;

public class Institute {

     public static void main(String[] args) {
          ClassroomExample classroomExample = new ClassroomExample();
          classroomExample.createClassroom();
         loops();
         hashmapexample();
         compareArraywithMap(2323);


         ClassRoomHelper helper = new ClassRoomHelper();
         ClassRoom javaClass = helper.prepareClass("java" , 4,6,true);
         ClassRoom qaClass = helper.prepareClass("QA" , 4,6,true);
         helper.addTeacher(
                 "Aseem",
                 "ahuja",
                 "texas",
                 "TX",
                 "232",
                 true,
                 javaClass
         );

         helper.addStudent(
                 "Bishnu",
                 "Tmalsina",
                 "texas",
                 "TX",
                 "232",
                 true,
                 javaClass
         );
         
         helper.printAll(javaClass);

    }

    private static void loops() {


        int[] arrayIntegers = {1,2,3,4,5,6,7,8,9,10};
        System.out.print("while:::");
        for (int i : arrayIntegers){
            if (i>4){

                System.out.print(i + ".");

            }
        }
        int i = 0;
        while (i < arrayIntegers.length ){
            if (arrayIntegers[i] > 4) {
                System.out.print(arrayIntegers[i] + " ");
                System.out.println(" ");
            }
            i++;
        }

    }

    private static void hashmapexample() {
        Map<Integer, String> mapValue = new HashMap<>();
        mapValue.put(5, "abd");
        mapValue.put(6, "fjssljsf");
        System.out.println("Print value at position ");


        for(Map.Entry<Integer, String> entry : mapValue.entrySet()){
            System.out.println("map key " + entry.getKey() + " " + entry.getValue());
        }


    }

    private static void sorting(){
         List<Integer> numberList = new ArrayList<>();
        List<Student> studentList = new ArrayList<>();
        Student s1 = new Student();
        Student s2 = new Student();
        studentList.add(s1);
        studentList.add(s2);
        s2.firstName = "abcd";
        s1.firstName = "fslfksj";


         numberList.add(4);
        numberList.add(1);
        numberList.add(6);
        numberList.add(7);
        numberList.add(3);
        numberList.add(2);

        for(Integer num: numberList) {
            System.out.println(num + ",");
        }

        Collections.sort(numberList);
        for(Integer num: numberList) {
            System.out.println(num + ",");
        }

        Collections.sort(numberList, Collections.reverseOrder());
        for(Integer num: numberList) {
            System.out.println(num + ",");
        }

        Collections.sort(studentList, new SortByName());
        for(Student student: studentList) {
            System.out.println(student.firstName + ",");
        }
        Collections.sort(studentList, Collections.reverseOrder(new SortById()));

    }
    private static void compareArraywithMap(int studentId) {
        Student s1  = new Student();
        s1.firstName = "First1";
        s1.studentId = 2323;


        Student s2 = new Student();
        s2.firstName = "first2";
        s2.studentId = 23224;

        Map<Integer,Student> studentMap = new HashMap<>();
        studentMap.put(s1.studentId, s1);
        studentMap.put(s2.studentId, s2);

        List<Student> studentarrayList = new ArrayList();

        studentarrayList.add(s1);
        studentarrayList.add(s2);

        for (Student s: studentarrayList) {

            if(studentId == s.studentId ) {
                System.out.println("Student ID if found");
                break;
            }
            else {
                System.out.println("False");
            }
        }

        if(null != studentMap.get(studentId) ){ 
        }


    }


    public static void overloading() {
         add(1,2);
         add(2, "wfwf");
         add(3,3,4);
    }

    public static void add(int a, int b) {
          int c  = a + b;
    }

    public static void add(int a, int b, int c) {
        int d  = a + b + c;
    }

    public static void add(int a, String b) {
       String c  = a + b;

    }

    public static void overriding() {
         Student s1 = new Student();
         s1.print();

         Employee t1 = new Employee();
         t1.print();

    }
}
