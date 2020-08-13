package employeeRecordSystem;
import java.util.ArrayList;

public class UapCse
{
    String name;
    ArrayList<Employee> employees;

    public UapCse(String name)
    {
        this.name=name;
        employees = new ArrayList<>();
    }

    private void addNewEmployee(Employee emp)
    {
        employees.add(emp);
    }

    public void addNewEmployee(String nm, String id, String des, double sal)
    {
        Employee emp=new Employee(name,des,id,sal);
        addNewEmployee(emp);
    }

    private Employee findEmployee(String id)
    {
        for(int i=0;i<employees.size();i++)
        {
            if(employees.get(i).getId().equals(id))
                return employees.get(i);

        }
        return null;
    }

    public void increaseSalary(String id, double amt)
    {
        Employee emp=findEmployee(id);
        if(emp==null) System.out.println("Employee not found");
        else
            emp.increaseSalary(amt);

    }

    void getSalary(String id)
    {
        Employee emp=findEmployee(id);
        if(emp==null) System.out.println("Employee not found");
        else
            emp.getSalary();
    }

    void display(String id)
    {
        Employee emp=findEmployee(id);
        if(emp==null) System.out.println("Employee not found");
        else
            emp.display();
    }

    void display()
    {
        for(int i=0;i<employees.size();i++)
        {
            employees.get(i).display();
        }
    }
}















