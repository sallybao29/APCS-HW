import java.util.Random;

public class Interval{
    private int low, high;
    private static Random r = new Random();

    public void setup(int l, int h){
	high = h;
	low = l;
    }
    
    public Interval(int l, int h){
	setup(l, h);
    }

    public Interval(){
	int h = 1 + r.nextInt(100);
	int l = r.nextInt(h);
	setup(l, h);
    }

    public int compareTo(Interval other){
	if (this.low == other.low){
	    return this.high - other.high;
	}
	else{
	    return this.low - other.low;
	}
    }

    public String toString(){
	return "[" + low + "," + high + "]";
    }


    public static void main(String[] args){
	Interval i = new Interval();
	Interval s = new Interval(20, 30);
	System.out.println(i);
	System.out.println(s);
	System.out.println(i.compareTo(s));
	System.out.println(s.compareTo(i));

      
    }
    
}


    
