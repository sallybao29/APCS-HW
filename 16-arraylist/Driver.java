import java.util.*;
import java.lang.*;

public class Driver{
    public static void main(String[] args){
	ArrayList<Integer> ai = new ArrayList<Integer>();
	Random r = new Random();
	for (int i = 0;i < 20;i++){
	    ai.add(r.nextInt(10));
	}

	System.out.println(ai);
     
	for (int i = 0;i < ai.size();i++){
	    if (i + 1 < ai.size() && ai.get(i) == ai.get(i + 1)){
		ai.remove(i);
	    }
	}
	         
	System.out.println(ai);

    }
    
  
}
