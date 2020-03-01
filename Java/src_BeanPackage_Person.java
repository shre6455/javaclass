package BeanPackage;

public class Person implements Being {
    public String firstName;
    public String lastName;
    public String city;
    public String state;
    public String country;
    public boolean hasLaptop;
    public int bankBalance;
    public int creditLimit;
    protected String category;

    public Person(){

    }

    public void print() {
        System.out.println("in class person");
    }

    public String getName() {
        StringBuilder strBuilder = new StringBuilder();
        strBuilder.append(this.firstName);
        strBuilder.append(" ");
        strBuilder.append(this.lastName);
        return strBuilder.toString();
    }

    public Person(int bankBalance, int creditLimit){
        bankBalance = bankBalance + 1;
        creditLimit = creditLimit + 1;
    }


    @Override
    public void printall() {

    }
}


