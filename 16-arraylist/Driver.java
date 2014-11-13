import java.util.*;
import java.lang.*;

public class Driver{
    public static void main(String[] args){
	ArrayList<Integer> ai = new ArrayList<Integer>();
	Random r = new Random();
	for (int i = 0;i < 20;i++){
	    ai.add(r.nextInt(5));
	}

	System.out.println(ai);
     
	for (int i = 0;i < ai.size() - 1;i++){
	    if (ai.get(i) == ai.get(i + 1)){
		ai.remove(i);
		i--;
	    }
	}
	         
	System.out.println(ai);

    }
    
  
}
