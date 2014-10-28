public class arrays{
    private int[] a;
    Random r;
    
    public String toString(){
	String s = "";
	for(int i = 0;i < a.length;i++){
	    s = s +a[i] + ",";
	}
	return s;
    }

    public arrays(){
	this(100);	
    }

    public arrays(int n){
	r = new Random();
	a = new int[n];
	for(int i = 0;i < a.length;i++){
	    a[i] = 75 + r.nextInt(76);
	}	
    }
    
    public static void main(String[] args){
	arrays as = new arrays();
	System.out.println(as);
    }
	
}
