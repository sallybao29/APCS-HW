public class Sarray {
    int[] data;
    int last;

    public Sarray() {
	data = new int[100];
	last = 0;
        // set up the initial instance variables
    }

    public int[] grow(int[] nums){
	int[] newArray = new int[nums.length + 1];
	for (int i = 0;i < nums.length;i++){
	    newArray[i] = nums[i];
	}
	return newArray;
    }

    public String toString(){
	String s = "";
	for (int i = 0;i < size();i++){
	    s += data[i] + ", ";
	}
	return s;
    }

    public boolean add(int i){
        // adds an item to the end of the list, grow if needed
        // returns true

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
        // adds item i  at index, shifting everything down as needed.
        // also grows as needed 

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
        // returns the number of items in the list (not the array size)
	int count = 0;
	for (int i = 0;i < last + 1;i++){
	    count++;
	}
	return count;
    }

    public int get(int index) {

	return data[index];

        // returns the item at location index of the lsit
    }

    public int set(int index, int i){
        // sets the item at location index to value i
        // returns the old value. 

	int old = data[index];
	data[index] = i;
	return old;
      
    }

    public int remove(int index){
        // removes the item at index i
        // returns the old value
	int old = data[index];
	for (int i = index;i < last;i++){
	    data[i] = data[i + 1];
	}
	data[last] = 0;
	last--;
	return old;
    }
}
