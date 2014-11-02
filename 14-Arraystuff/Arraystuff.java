import java.util.*;

public class  Arraystuff {

    /*--------------------- Instance Variables --------------------*/ 

    private int[] a;
    Random rnd;
    // By making x final, we can set it once but then never change it
    // private final int x = 123;

    /*--------------------- Constructors --------------------*/ 

    public Arraystuff(int n){
	rnd = new Random();
	a = new int[n];
	for (int i=0; i<a.length;i++){
	    a[i] = 75+rnd.nextInt(76);
	}
    }

    public Arraystuff(){
	this(100);
    }
    

    /*--------------------- Methods --------------------*/ 

    public String toString(){
	String s = "";
	for (int i = 0; i < a.length; i++) {
	    s = s + a[i]+", ";
	}
	return s;
    }

    /*------------------- Homework -------------------*/

    public int find(int n){
	for(int i = 0;i < a.length;i++){
	    if (a[i] == n){
		return i;
	    }
	}
	return -1;
    }

    public int maxVal(int[] nums){
	int largest = nums[0];
	for(int i = 0;i < nums.length;i++){
	    if (largest < nums[i]){
		largest = nums[i];
	    }
	}
	return largest;
    }

    //14b
 
    public int freq(int i){
	int target = a[i];
	int counter = 0;
	for(int k = 0;k < a.length;k++){
	    if (target == a[i]){
		counter++;
	    }
	}
	return counter;
    }

  
    
    public int sum67(int[] nums){
	int sum = 0;
	for (int i = 0;i < nums.length;i++){
	    if (nums[i] == 6){
		while (nums[i] != 7){
		    i++;
                }     	
	    }
            else{
		sum += nums[i]; 
            } 
	}
	return sum;
    }

    public boolean more14(int[] nums) {
	int a = 0;
	int b = 0;
	for (int i = 0;i < nums.length;i++){
	    if (nums[i] == 1){
		a++;
	    }
	    if (nums[i] == 4){
		b++;
	    }
	}
	return a > b;
    }
   
    public int[] tenRun() {
	int mult = 0;
	int i = 0;
	while (i < a.length){
	    if (a[i] % 10 == 0){
		mult = a[i];
                i++;
                while (i < a.length && a[i] % 10 != 0){
		    a[i] = mult;
		    i++;
                }
	    }
	    else{
                i++;
	    } 
	}
	return a;
    }

    public boolean tripleUp(){
	int i = 0;
	int count = 0;
	int temp = 0;
	while (i < a.length){
	    count = 0;
	    temp = i;
	    while (count < 3){
		count++;
		if (temp + 1 < a.length && a[temp + 1] - a[temp] == 1){
		    temp++;
		}
		else{
		    break;
		}   
	    }
	    if (count == 3){
		return true;
	    }
	    else {
		i++;
	    }   
	}
	return false;
    }
   
    public boolean canBalance(int[] nums){
        int start = 0;
        int fin = nums.length - 1;
	int beg = nums[start];
	int end = nums[fin];
        
	while (start < fin){
	    if (beg == end){
		if (fin - start == 1){
		    return true;
		} 
		else{
		    start++;
		    beg += nums[start];
		    fin--;
		    end += nums[fin];
		}
	    }
	    if (beg > end){
                fin--;
		end += nums[fin];
	    }
            else {
                start++;
                beg += nums[start];
            }
	}
	return false;
    }

    public int[] seriesUp(int n) {
	int len = n * (n + 1) / 2;
	int[] intArray = new int[len];
	int count = 1;
	int a = 1;
	int i = 0;
	while (count < n + 2){
	    a = 1;
	    while (a < count){
		intArray[i] = a;
		a++;
		i++;
	    }
	    count++;
	}
	return intArray;
    }
  
    public int maxMirror(int[] nums){
	int pos = 0;
	int mirr = nums.length - 1;
	int count = 0;
	int[] lens = new int[nums.length];
	for (int i = 0;i < nums.length / 2;i++){
	    if (freq(i) > 1){
		pos = i;
		while (nums[mirr] != nums[pos]){
		    mirr--;
		}
		while (mirr > 0 && pos < nums.length && nums[pos] == nums[mirr]){
		    if (mirr == pos){
			count++;
		    }
		    count++;
		    pos++;
		    mirr--;
		}    
	        lens[i] = count;
		count = 0;
		mirr = nums.length - 1;
	    }
	}
	int max = maxVal(lens);
	return max;
    }

    
    /*--------------------- Main --------------------*/ 

    public static void main(String[] args) {
	Arraystuff as = new Arraystuff();
	int[] x = {1, 2, 3, 8, 9, 3, 2, 1};
	int[] y = {1, 2, 1, 4};
	int[] z = {7, 1, 2, 9, 7, 2, 1};

	System.out.println(as.maxMirror(x));
	System.out.println(as.maxMirror(y));
	System.out.println(as.maxMirror(z));


    }
    
}
