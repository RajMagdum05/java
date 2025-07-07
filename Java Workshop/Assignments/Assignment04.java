public class Main2 {
    public static void main(String[] args)
  {
    Cost c = new Cost(150, 200, 250, 109.5, 21.5);
    System.out.println("Total Cost for Each day: "+(c.OtherCosts()+c.CalculateFuelCost()));
  }
}

class Genral
{
    private int parkingFees;
    private int tolls;

    public Genral(int parkingFees, int tolls)
    {
        this.parkingFees = parkingFees;
        this.tolls = tolls;
    }
    public int getParking(){return parkingFees;}
    public int getTolls(){return tolls;}

    public int OtherCosts()
    {
        return parkingFees+tolls;
    }

}


class Cost extends Genral
{
    private double totalMiles;
    private double costPerGallon;
    private double average;

    public Cost (int parkingFees, int tolls, double totalMiles, double costPerGallon, double average)
    {
        super(parkingFees, tolls);
        this.totalMiles = totalMiles;
        this.costPerGallon = costPerGallon;
        this.average = average;
    }
    public double CalculateFuelCost()
    {
        return (totalMiles/average)*costPerGallon;
    }
}

