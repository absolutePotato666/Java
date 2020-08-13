package employeeRecordSystem;

public class Employee
{
    private String name, designation,id;

    private double salary;

    public Employee(String name, String designation,String id, double salary)
    {
        this.name=name;
        this.designation=designation;
        this.id=id;
        this.salary=salary;
    }

    void increaseSalary(double amt)
    {
        salary+=amt;
    }

    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }

    public String getDesignation()
    {
        return designation;
    }
    public void setDesignation(String designation)
    {
        this.designation = designation;
    }

    public String getId()
    {
        return id;
    }
    public void setId(String id)
    {
        this.id = id;
    }

    public double getSalary()
    {
        return salary;
    }

    void display()
    {
        System.out.println("Name:"+name+"Id:"+id+"Designation:"+designation+"Salary:"+salary);
    }

}








