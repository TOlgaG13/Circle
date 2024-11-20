package task;
import java.util.Scanner;
public class CircleTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	    double x=0;
	    double y=0;
	    double r=4;
	    
	    System.out.println("input q");
	    double q=sc.nextDouble();
	    System.out.println("input w");
	    double w=sc.nextDouble();
	   
	    if((x-q)*(x-q)+(y-w)*(y-w)<=(r*r)){
	    	System.out.println("Point inside circle");
	    }else {
	    	System.out.println("point outside the circle");
	    }
	}
}    
	     
	    
	    
	    		
	    
	    
	    
	   
	