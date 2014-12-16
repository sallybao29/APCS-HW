import java.util.*;

public class Searching{
    private Comparable[] a;

    public Searching(int n){
	a = new Comparable[n];
    }

    public String toString(){
	return Arrays.toString(a);
    }

    public Comparable[] get(){
	return a;
    }

    public void additem(Comparable c, int i){
	if (a[i] == null){
	    a[i] = c;
	}
    }

    public Comparable Isearch(Comparable item){
	for (int i = 0;i < a.length;i++){
	    if (item.compareTo(a[i]) == 0){
		return a[i];
	    }
	}
	return null;
    }

    public Comparable bsearch(Comparable item){
	Arrays.sort(a);
	int low = 0;
	int high = a.length - 1;
	while (low <= high){
	    int mid = (low + high) / 2;
	    if (a[mid].compareTo(item) == 0){
		return a[mid];
	    }
	    else if (a[mid].compareTo(item) > 0){
		high = mid - 1;
	    }
	    else {
		low = mid + 1;
	    }
	}
	return null;
    }
  
    public Comparable rbsearch(Comparable item){
	Arrays.sort(a);
	return rbsearch(item, 0, a.length - 1);
    }

    public Comparable rbsearch(Comparable item, int low, int high){
	if (low >= high){
	    return null;
	}
	int mid = (low + high) / 2;
	if (a[mid].compareTo(item) == 0){
	    return a[mid];
	}
	if (a[mid].compareTo(item) > 0){
	    return rbsearch(item, low, mid - 1);
	}
	else {
	    return rbsearch(item, mid + 1, high);
	}
    }


    /*--------------------------- Main -------------------------------------*/

    public static void main(String[] args){
	Searching s = new Searching(20);
	
	Random r = new Random();
	for(int i = 0;i < s.get().length;i++){
	    s.additem(r.nextInt(100), i);
	}

	System.out.println(s);
	System.out.println(s.Isearch(50));
	System.out.println(s.bsearch(50));
	System.out.println(s.rbsearch(50));

    }
}
