package OOP_Batch03_23UAM070;
public class Employee extends Person
{
    private int id;
    private String depart;
    private double salary;
    private MyDate DOJ;

    public Employee(String name, MyDate DOB, int id, String depart, double salary, MyDate DOJ)
    {
        super(name, DOB);
        setId(id);
        setDepart(depart);
        setSalary(salary);
        setDOJ(DOJ);
    }
    public void setId(int id){this.id = id;}
    public void setDepart(String depart){this.depart = depart;}
    public void setSalary(double salary){this.salary = salary;}
    public void setDOJ(MyDate DOJ){this.DOJ = DOJ;}

    public int getId(){return id;}
    public String getDepart(){return depart;}
    public double getSalary(){return salary;}
    public MyDate getDOJ(){return DOJ;}

    public String toString()
    {
        return super.toString()+"\nEmployee Id: "+getId()+"\nEmployee Department: "+getDepart()+"\nEmployee Salary: "+getSalary()+"\nEmployee Date Of Joining: "+getDOJ();
    }

}
