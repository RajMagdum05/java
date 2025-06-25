package maxNo;

public class Max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a=18;
        int b=18;
        int c=15;
        
        System.out.println("Largest No. from a,b,c: ");
        if(a>b && a>c)
        {
        	System.out.println(+a);
        }
        else if(b>c)
        {
        	System.out.println(+b);
        }
        else
        {
        	System.out.println(+c);
        }
        
	}

}
