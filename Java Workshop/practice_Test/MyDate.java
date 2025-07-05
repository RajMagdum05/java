package OOP_Batch03_23UAM070;

public class MyDate
{
    private int day;
    private int month;
    private int year;

    public MyDate(int d, int m, int y)
    {
        setDay(d);
        setMonth(m);
        setYear(y);
    }
    public void setDay(int d)
    {
        if(d<0 || d>31){System.out.println("Day cannot be "+d);}
        else{day = d;}
    }
    public void setMonth(int m)
    {
        if(m<0 || m>12){System.out.println("Month cannot be "+m);}
        else{month = m;}
    }
    public void setYear(int y)
    {
        year = y;
    }
    public int getDay(){return day;}
    public int getMonth(){return month;}
    public int getYear(){return year;}

    public String toString()
    {
        return getDay() + "-" +getMonth() + "-"+getYear();
    }
}

