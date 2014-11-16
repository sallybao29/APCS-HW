import java.util.*;
import java.lang.*;

public class ArrayLists{
    private ArrayList<Integer> a;
    private Random r;

    public ArrayLists(){
	this(10);	
    }

   public ArrayLists(int len){
	a = new ArrayList<Integer>();
	for (int i = 0;i < len;i++){
	    a.add(i);
	}
    }

    public String toString(){
	return "" + a;
    }

    public void randomize(){
	r = new Random();
	for (int i = 0;i < a.size();i++){
	    int current = a.remove(i);
	    a.add(r.nextInt(a.size()), current);
	}
    }

    public static int[] randomize(int[] nums){
	Random r = new Random();
	ArrayList<Integer> n = new ArrayList<Integer>();
	for (int i = 0;i < nums.length;i++){
	    n.add(i);
	}
	int[] newArray = new int[nums.length];
	for (int i = 0;i < nums.length;i++){
	    int index = r.nextInt(n.size());
	   newArray[i] =  n.remove(index);	  
	}
	return newArray;
    }

    public String printArray(int[] nums){
	String s = "";
	for (int i = 0;i < nums.length;i++){
	    s += nums[i] + ", ";
	}
	return s;
    } 



    /*--------------------------------- Test -----------------------------*/

    public static void main(String[] args){
	ArrayLists ai = new ArrayLists();
	int[] n = {0,1,2,3,4,5,6};
	System.out.println(ai);

	ai.randomize();

	System.out.println(ai);
	System.out.println(ai.printArray(n));
	System.out.println(ai.printArray(randomize(n)));
    }

        
}
