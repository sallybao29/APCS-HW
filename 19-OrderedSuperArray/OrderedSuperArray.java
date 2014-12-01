import java.lang.*;

public class OrderedSuperArray extends Sarray{
    String[] data;
    int last;
    int room = 100;

    public OrderedSuperArray(){
	super();
    }

    public OrderedSuperArray(int size, String s){
	super(size, s);
    }

    public String[] grow(){
	String[] newArray = new String[data.length + room];
	return newArray;
    }

    public boolean add(String s){
	String[] newArray;
	if (last == data.length - 1){
	    newArray = grow();
	}
	else{
	    newArray = new String[data.length];
	}
	int j = 0;
    
	for (int i = 0;i < last;i++){
	    if (s.compareTo(data[i]) <= 0){
		newArray[j] = s;
		j = i + 1;
	    }
	    newArray[j] = data[i];
	}	
	data = newArray;
	last++;
	return true;
    }

    public int small(){
	String smallest = data[0];
	int i;
	for (i = 0;i < last;i++){
	    if (smallest.compareTo(data[i]) > 1){
		smallest = data[i];
	    }
	}
	return i;
    }

    public void sort(){
	String[] m = new String[data.length];
	int i = 0;
        while (data != null){
	    m[i] = data[small()];
	    data[small()] = null;
	    i++;
	}
	data = m;
    }

    public String set(int index, String s){
	String old = data[index];
	data[index] = s;
	sort();
	return old;   
    }

    public static void main(String[]args){
	OrderedSuperArray a = new OrderedSuperArray(10, "computer");
	System.out.println(a);
	System.out.println(a.last);
	System.out.println(a.size());
	a.add("hello");
	a.add("chicken");
	a.add("potatoe");
	a.set(0,"hello");
	a.set(5,"cows:");
	System.out.println(a);

    }
}
