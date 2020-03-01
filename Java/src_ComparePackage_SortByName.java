package ComparePackage;

import BeanPackage.Student;

import java.util.Comparator;

public class SortByName implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.firstName.compareTo(o2.firstName);
    }
}
