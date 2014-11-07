public class Sarray {
    int[] data;
    int last;

    public Sarray() {
	data = new int[100];
	last = 0;
        // set up the initial instance variables
    }

    public boolean add(int i){
	if (last == data.length - 1){
	    int[] newArray = new int[data.length + 2];
	    newArray[last + 1] = i;
	    data = newArray;
	}
	else{
	    data[last + 1] = i;
	}
	return true;
        // adds an item to the end of the list, grow if needed
        // returns true
    }

    public void  add(int index, int i){
        // adds item i  at index, shifting everything down as needed.
        // also grows as needed 
    }

    public int size() {
        // returns the number of items in the list (not the array size)
    }

    public int get(int index) {
        // returns the item at location index of the lsit
    }

    public int set(int index, int i){
        // sets the item at location index to value i
        // returns the old value. 
    }

    public int remove(int index){
        // removes the item at index i
        // returns the old value
    }
}
