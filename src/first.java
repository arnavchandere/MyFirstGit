import java.util.ArrayList;

public class first {

	public static void main(String[] args) {
		// TODO Auto-generated method stub  ArrayList<Integer> x=new ArrayList<Integer>();
	       ArrayList<Integer> y=new ArrayList<Integer>();
	       ArrayList<Integer> z=new ArrayList<Integer>();
	       x.add(10);
	       x.add(11);
	       x.add(6);
	       x.add(15);
	       x.add(9);
	       x.add(56);
	       System.out.println("original List:"+x);
	       for(int i=0;i<x.size();i++)
	       {
	    	   if(x.get(i)%2==0)
	    	   {
	    		   y.add(x.get(i));
	    	   }
	    	   else
	    	   {
	    		   z.add(x.get(i));
	    	   }
	       }
	       System.out.println("Even List is:"+y);
	       System.out.println("Odd List is:"+z);

	}

}
