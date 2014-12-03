import java.lang.*;

public class OrderedSuperArray extends Sarray{
  
    public OrderedSuperArray(){
	super();
    }

    public OrderedSuperArray(int size, String s){
	super(size, s);
    }

    public int rightIndex(String s){
	int place = 0;
	for(int i = 0;i < getLast() && s.compareTo(getData()[i]) > 0;i++){
	    place = i;
	}
	place = getLast();
	return place;
    }

    public boolean add(String s){
	int index = rightIndex(s);
	super.add(index, s);
	return true;
    }

    public String set(int index, String s){
	String old = getData()[index];
	remove(index);
	this.add(s);
	return old;
    }


    public static void main(String[]args){
	OrderedSuperArray a = new OrderedSuperArray();
	System.out.println(a);
	a.add("hello");
	a.add("chicken");
	a.add("potatoe");
	System.out.println(a);
	a.set(0,"rooster");
	a.set(5,"cows");
	System.out.println(a);

    }
}
