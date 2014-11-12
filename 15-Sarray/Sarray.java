import java.lang.*;

public class Sarray {
    int[] data;
    int last;
    int room = 100;

    public Sarray() {
	data = new int[100];
	last = -1;
    }

    public int[] grow(int[] nums){
	int[] newArray = new int[nums.length + room];
	for (int i = 0;i < nums.length;i++){
	    newArray[i] = nums[i];
	}
	return newArray;
    }

    public boolean indexInRange(int index){
	if (index > last || index < 0){
	    return false;
	}
	else {
	    return true;
	}
    }

    public String toString(){
	String s = "";
	for (int i = 0;i < size();i++){
	    s += data[i] + ", ";
	}
	return s;
    }

    public boolean add(int i){
	int[] newArray;
	if (last == data.length - 1){
	    newArray = grow(data);
	}
	else{
	    newArray = data;
	}
	newArray[last + 1] = i;
	last++;
	data = newArray;
	return true;
    }

    public void  add(int index, int i){
	if (indexInRange(index) == false){
	    throw new IndexOutOfBoundsException();
	}
	int[] newArray;
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
	newArray[index] = i;
	data = newArray;	
    }

    public int size() {
	int count = 0;
	for (int i = 0;i < last + 1;i++){
	    count++;
	}
	return count;
    }

    public int get(int index) {
	if (indexInRange(index) == false){
	    throw new IndexOutOfBoundsException();
	}
	return data[index];      
    }

    public int set(int index, int i){
	if (indexInRange(index) == false){
	    throw new IndexOutOfBoundsException();
	}
	int old = data[index];
	data[index] = i;
	return old;   
    }

    public int remove(int index){
	if (indexInRange(index) == false){
	    throw new IndexOutOfBoundsException();
	}
	int old = data[index];
	for (int i = index;i < last;i++){
	    data[i] = data[i + 1];
	}
	data[last] = 0;
	last--;
	return old;
    }
}
