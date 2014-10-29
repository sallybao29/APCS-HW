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
	return s;}

    /*------------------- Homework -------------------*/

    public int find(int n){
	for(int i = 0;i < a.length;i++){
	    if (a[i] == n){
		return i;
	    }
	}
	return -1;
    }

    public int maxVal(){
	int largest = 0;
	for(int i = 0;i < a.length;i++){
	    if (largest < a[i]){
		largest = a[i];
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

    public static int sum67(int[] nums){
	int sum = 0;
	int i = 0;
	while (i < nums.length){
	    if (nums[i] == 6){
		i = nums.find(7) + 1;
	    }
	    sum += nums[i];
	}
	return sum;
    }

    public static boolean more14(int[] nums) {
	int a = 0;
	int b = 0;
	for (int i = 0;i < nums.length;i++){
	    if (nums[i] == 1){
		a++;
	    }
	    if (nums[i] == 4){
		b ++;
	    }
	}
	return a > b;
    }
    //in progress
    public int[] tenRun(int[] nums) {
	int mult = 0;
	int i = 0;
	while (i < nums.length){
	    if (nums[i] % 10 == 0){
		mult = nums[i];
	    }
	    else{
		i++;
	    }
	    while (nums[i + 1] % 10 != 0){
		nums[i] = mult;
		i++;
	    }
	}
	return nums;
    }


    public static boolean tripleUp(int[] nums){
	int i = 0;
	int count = 0;
	int temp = 0;
	while (i < nums.length){
	    count = 0;
	    temp = i;
	    while (count < 3){
		count++;
		if (temp + 1 < nums.length && nums[temp + 1] - nums[temp] == 1){
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
    //in progress
    public boolean canBalance(int[] nums){
        int start = 0;
        int fin = nums.length - 1;
	int beg = nums[start];
	int end = nums[fin];
        
	while (start != fin){
	    if (beg == end){
		return true;
	    }
	    if (beg > end && fin - 1 > 0){
                fin -= 1;
		end += nums[fin];
	    }
            else {
                start += 1;
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


    
    /*--------------------- Main --------------------*/ 

    public static void main(String[] args) {
	Arraystuff as = new Arraystuff();
	int[] intArray = {1,2,2,6,99,99,7};
	/*
	System.out.println(as);
	System.out.println(as.find(100));
	System.out.println(as.maxVal());
	*/
	
    }
    
}
