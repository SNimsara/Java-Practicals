/*
Exercise 3-1: Develop a code for the following scenario. 
“An encapsulated class contains three variables to store Name, Age and Salary of the employee. Evelop getters and setters to set and get values . Develop a 
test class to test your code.” */

public class Employee{
    private String empName;
    private int age;
    private double salary;

    //Getter and Setter methods for Name
    public String getEmpName(){
        return empName;
    }
    public void setEmpName(String en){
        empName = en;
    } 

    //Getter and Setter methods for Age
    public int getAge (){
        return age;
    }
    public void setAge (String a){
        age= a;
    }
  
    //Getter and Setter methods for Salary
    public double getSalary (){
        return salary;
    }
    public void setSalary (String sl){
        salary = sl;
    }
}


public class EncapsTest{
    public static void main(String args[]){
         Employee e = new Employee();

    //set values using the setter method
         e.setEmpName("John");
         e.setAge("23");
	 e.setSalary("5000000.00");

    //display values using the getter method
	 System.out.println("Employee Name: " +e.getEmpName());
	 System.out.println("Employee Age: " +e.getEmpAge());
	 System.out.println("Employee Salary: " +e.getSalary());
    } 
}

//Now modify the same code by  trying to replace the setters using  a constructor. 

public class Employee{
    private String empName;
    private int age;
    private double salary;
    //Constructor
    public Employee(String en,int a,double sl){
    	empName = en;
    	age = a;
	    salary = s;
    }
    //Getter method for Name
    public String getEmpName(){
        return empName;
    }
    //Getter method for Age
    public int getAge(){
        return age;
    }
    //Getter method for Salary
    public double getSalary(){
        return salary;
    }
}


public class EncapsTest{
    public static void main(String args[]){
     //set values using the setter method
         Employee e = new Employee("John",23,500000.00);
    //display values using the getter method
	       System.out.println("Employee Name: " +e.getEmpName());
	       System.out.println("Employee Age: " +e.getEmpAge());
	       System.out.println("Employee Salary: " +e.getSalary());
    } 
}
    
    
/*
Exercise 3-2: Code for the last example that we have discussed during the class. We need the following Output. (Use Netbeans code generation option where necessary)
Employee Name: xxxxx (Use setter to set and getter to retrieve)
Basic Salary: xxxx (Use setter to set and getter to retrieve)
Bonus: xxxx (You may use the constructor to pass this value)
Bonus Amount: xxxxx (Develop a separate method to calculate Bonus amount. Bonus amount is the total of Bonus and Basic Salary)
E.g. 
Employee Name: Bogdan
Basic Salary: 50000 
Bonus: 10000 
Bonus Amount: 60000
*/

public class Employee{
    private String empName;
    private double basicSalary;
    private double bonus;
//Constructor
    public Employee(String en,double bSalary,double b){
      empName = en;
    	basicSalary = bSalary;
	    bonus = b;
    }
    //Getter and Setter methods for Name
    public String getEmpName(){
        return empName;
    }
    public void setEmpName(String en){
        empName = en;
    }
    //Getter and Setter methods for basic salary
    public double getBasicSalary(){
        return basicSalary;
    }
    public void setBasicSalary(String bSalary){
        basicSalary = bSalary;
    }
    //Getter method for bonus
    public double getBonus(){
        return bonus;
    }
    //Method for get bonus amount
    public double getBonusAmount(){
        return basicSalary + bonus;
    }
}


public class EncapsTest{
    public static void main(String args[]){
         Employee e = new Employee("Bogdan",50000,10000);

    //display values using the getter and setter methods
	       System.out.println("Employee Name: " +e.getEmpName());
	       System.out.println("Employee Basic Salary: " +e.getbasicSalary());
	       System.out.println("Employee Bonus: " +e.getBonus());
	       System.out.println("Employee Bonus Amount: " +e.getBonusAmount());
    } 
}







  
