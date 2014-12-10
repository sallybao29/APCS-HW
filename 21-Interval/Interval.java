import java.util.*;
import java.io.*;

public class Interval implements Comparable{
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

    public int compareTo(Object other){
	Interval o = (Interval)other;
	if (this.low == o.low){
	    return this.high - o.high;
	}
	else{
	    return this.low - o.low;
	}
    }

    public String toString(){
	return "[" + low + "," + high + "]";
    }


    public static void main(String[] args){
	Interval[] ia = new Interval[10];
	for (int j = 0;j < ia.length;j++){
	    ia[j] = new Interval();
	}

	System.out.println(Arrays.toString(ia));
	Arrays.sort(ia);
	System.out.println(Arrays.toString(ia));
    }
    
}


    
