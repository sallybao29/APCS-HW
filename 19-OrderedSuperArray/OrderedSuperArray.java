import java.lang.*;

public class OrderedSuperArray extends Sarray{

    public OrderedSuperArray(){
	super();
    }

    public boolean add(String s){
	String[] newArray;
	if (last == data.length - 1){
	    newArray = grow(data);
	}
	else{
	    newArray = data;
	}
	int i = 0;
	while (i < data.size()){
	    if (s.compareTo
	}
    }


  

    public static void main(String[]args){
	OrderedSuperArray a = new OrderedSuperArray();
	System.out.println(a);
	a.add("hello");
	a.add("chicken");
	System.out.println(a);

    }
}
