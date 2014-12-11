public class Searching{
    private Comparable[] a;

    public Searching(int numElements){
	a = new Comparable[numElements];
    }

    public void additem(Comparable c, int i){
	if (a[i] != null){
	    a[i] = c;
	}
    }


    public static void main(String[] args){
	Searching s = new Searching(10);
	
	Random r = new Random();
	for(int i = 0;i < s.length;i++){
	    s.additem(r.nextInt(100));
	}
    }
}
