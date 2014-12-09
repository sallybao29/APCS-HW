import java.util.Random;

public class Interval{
    private double low, high;
    Random r;

    public Interval(double l, double h){
	low = l;
	high = h;
    }

    public Interval(){
	r = new Random();
	double l = r.nextDouble();
	double h = r.nextDouble();
	while (h <= l){
	    h = r.nextDouble();
	}
	this(l, h);
    }

    public String toString(){
	return "[ " + low + "," + high + " ]";
    }


    public static void main(String[] args){
	Interval i = new Interval();
	Interval s = new Interval(0.25, 1.00);
	System.out.println(i);
	System.out.println(s);
    }
    
}


    
