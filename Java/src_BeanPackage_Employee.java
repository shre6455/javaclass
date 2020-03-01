package BeanPackage;

public class Employee extends Person {

    public Employee(){
        System.out.println("Default constructor called from employee()");
        this.category = "Employee";
    }

    public Employee(String category){
        System.out.println("created parameterized constructor");
        this.category = category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCategory() {
        return this.category;
    }

    @Override
    public void print() {
        System.out.println("in class Employee");
    }

    public String EmployeeID;
}
