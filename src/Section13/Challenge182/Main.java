package Section13.Challenge182;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

record Employee(String firstName, String lastName, String hireDate) {
    public String getFullName(){
        return firstName + " " + lastName;
    }
    public int getYearsWorked(){
        int currentYear = 2024;
        int hireYear = Integer.parseInt(hireDate.split("/")[2]);
        return currentYear - hireYear;
    }

    @Override
    public final String toString() {
        return "Name: " + getFullName() + " | Years Worked: " + getYearsWorked();
    }

}

public class Main {
  
    public static LinkedList<Employee> employeeList(Employee... employees){   
        LinkedList<Employee> employeeList = new LinkedList<>();
        employeeList.addAll(List.of(employees));
        return employeeList; 
    }

    public static <T> void sortIt(List<T> list, String sortType){
        var comparator = new Comparator<Employee>(){
            @Override
            public int compare(Employee o1, Employee o2) {
                if(sortType.equals("name")){
                    return o1.getFullName().compareTo(o2.getFullName());
                }
                Integer year1 = o1.getYearsWorked();
                Integer year2 = o2.getYearsWorked();

                return year1.compareTo(year2);
            }
        };
        
        list.sort((Comparator<? super T>) comparator);
        for(var employee : list){
            System.out.println(employee);
        }
    }

    public static void main(String[] args) {
        LinkedList<Employee> employeeList = employeeList(new Employee("Lucas", "Falcao", "01/01/2020"),
                                                         new Employee("Maria", "Melo", "02/02/2021"),
                                                         new Employee("Leticia", "Falcao", "02/02/2019")); 

        sortIt(employeeList, "name");
        System.out.println();
        sortIt(employeeList, "year");

    }
}