import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;


public class Zad6 {

    public static void main(String[] args){

            int id,year;
            Scanner liczba1 = new Scanner(System.in);
            EmployeeList list = new EmployeeList();
            //zbior obiektow
            Employee[] zbior_obiektow = new Employee[5];
        for(int i = 0; i < zbior_obiektow.length ; i ++)
        {
            zbior_obiektow[i] = new Employee();
            System.out.println("Podaj nr pracownika: ");
            id = liczba1.nextInt();
            zbior_obiektow[i].setEmployeeNumber(id);
            System.out.println("Podaj date uro pracownika: ");
            year = liczba1.nextInt();
            zbior_obiektow[i].setEmployeeExp(year);
            System.out.println("NO I MAMY TO");
            list.GetObject(zbior_obiektow[i]);
        }
        list.displayList();

        list.experiencedWorkes();

    }
}
class Employee{

    private int employeeNumber;
    private int employeeExp;

    public Employee()
    {}
    public Employee(int employeeNumber, int employeeExp)
    {
        this.employeeNumber = employeeNumber;
        this.employeeExp = employeeExp;
    }
    public void displayEmp()
    {
        System.out.println(employeeNumber + ": " + employeeExp);
    }

    public int getEmployeeExp() {
        return employeeExp;
    }
    public int getEmployeeNumber(){
        return employeeNumber;
    }
    public void setEmployeeExp(int x){
        employeeExp = x;
    }
    public void setEmployeeNumber(int x){
        employeeNumber = x;
    }
}


 class EmployeeList {

    private List<Employee> empList = new ArrayList<>();

    public EmployeeList() {

    }

    public void GetObject(Employee emp) {
        empList.add(emp);
    }

    public List<Employee> getEmployes() {
        return empList;
    }

    public void displayList() {
        for (int i = 0; i < empList.size(); i++) {
            System.out.println(" | " + empList.get(i).getEmployeeExp() + " | " + empList.get(i).getEmployeeNumber() + " | ");
        }
    }

    public void experiencedWorkes() {
        for (int i = 0; i < empList.size(); i++) {
            Employee emp1 = empList.get(i);
            int date = 2020;
            if (date - emp1.getEmployeeExp() > 10) {
                System.out.println("ID: " + emp1.getEmployeeExp());
            }


        }

    }
}


