
package listandsetlab;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class EmployeePart2 {
    public static void main(String[] args) {
        Employee e1 = new Employee("1", "Laura", "Hendrickson");
        Employee e2 = new Employee("2", "Tim", "Smith");
        Employee e3 = new Employee("3", "Bob", "White");
    
        List<Employee> employee = new ArrayList<Employee>();
        employee.add(e1);
        employee.add(e2);
        employee.add(e3);
        
        System.out.println(employee.size());
        
        for(Employee e : employee){
            System.out.println(e);
        }
    }
}
