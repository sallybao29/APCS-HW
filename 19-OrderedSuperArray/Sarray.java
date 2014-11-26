import java.lang.*;

public class Sarray {
    String[] data;
    int last;
    int room = 100;

    public Sarray() {
	data = new String[100];
	last = -1;
    }

    public String[] grow(String[] nums){
	String[] newArray = new String[nums.length + room];
	for (int i = 0;i < nums.length;i++){
	    newArray[i] = nums[i];
	}
	return newArray;
    }

    public boolean indexInRange(int index){
	return (index <= last && index >= 0);
    }

    public String toString(){
	String s = "";
	for (int i = 0;i < size();i++){
	    s += data[i] + ", ";
	}
	return s;
    }

    public boolean add(String s){
	String[] newArray;
	if (last == data.length - 1){
	    newArray = grow(data);
	}
	else{
	    newArray = data;
	}
	newArray[last + 1] = s;
	last++;
	data = newArray;
	return true;
    }

    public void  add(int index, String s){
	if (indexInRange(index) == false){
	    throw new IndexOutOfBoundsException();
	}
	String[] newArray;
	if (last == data.length - 1){
	    newArray = grow(data);
	}
	else{
	    newArray = data;
	}
	for (int n = last;n > index;n--){
	    newArray[n] = newArray[n - 1];
	}
	last++;
	newArray[index] = s;
	data = newArray;	
    }

    public int size() {
	int count = 0;
	for (int i = 0;i < last + 1;i++){
	    count++;
	}
	return count;
    }

    public String get(int index) {
	if (indexInRange(index) == false){
	    throw new IndexOutOfBoundsException();
	}
	return data[index];      
    }

    public String set(int index, String s){
	if (indexInRange(index) == false){
	    throw new IndexOutOfBoundsException();
	}
	String old = data[index];
	data[index] = s;
	return old;   
    }

    public String remove(int index){
	if (indexInRange(index) == false){
	    throw new IndexOutOfBoundsException();
	}
	String old = data[index];
	for (int i = index;i < last;i++){
	    data[i] = data[i + 1];
	}
	data[last] = null;
	last--;
	return old;
    }

}
