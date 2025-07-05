package OOP_Batch03_23UAM070;

public class Person
{
    private String name;
    private MyDate DOB;

    public Person(String n, MyDate DOB)
    {
        setName(n);
        setDOB(DOB);

    }
    public void setName(String name){this.name = name;}
    public void setDOB(MyDate DOB){this.DOB = DOB;}

    public String getName(){return name;}
    public MyDate getDOB(){return DOB;}

    public String toString()
    {
        return "Name: "+getName()+"\nDate Of Birth: "+getDOB();
    }
}
