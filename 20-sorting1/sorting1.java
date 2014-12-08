import java.lang.*;

public class sorting1 {
    private String[] data;
    private int last;
    private int room = 100;

    public sorting1() {
	data = new String[100];
	last = -1;
    }

    public sorting1(int size, String s){
	data = new String[size];
	last = -1;
	for(int i = 0;i < size;i++){
	    data[i] = s;
	    last++;
	}
    }

    public String[] getData(){
	return data;
    } 

    public int getLast(){
	return last;
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

    public void add(int index, String s){
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

    public void insert(String s, int l){
	int i;
	for(i = l;i > 0 && s.compareTo(data[i - 1]) < 0;i--){
	    data[i] = data[i-1];
	}
	data[i] = s;
    }

    public int find(int start){
	int smallest = start;
	for(int i = start;i <= last;i++){
	    if (data[smallest].compareTo(data[i]) > 0){
		smallest = i;
	    }
	}
	return smallest;
    }

    public void isort(){
	for(int i = 0;i <= last;i++){
	    insert(data[i], i);
	}
    }

    public void ssort(){
	for(int i = 0;i <= last;i++){
	    int smallest = find(i);
	    String holder = data[smallest];
	    data[smallest] = data[i];
	    data[i] = holder;
	}
    }

    public void swap(){
	for(int i = 0;i < last;i++){
	    String current = data[i];
	    String next = data[i + 1];
	    if (current.compareTo(next) > 0){
		data[i] = next;
		data[i + 1] = current;
	    }
	}
    }

    public void bsort(){
	int i = 0;
	while(i < last){
	    if (find(i) != i){
		swap();
	    }
	    else{
		i++;
	    }
	}
    }

    public static void main(String[] args){
	int size = 1000;
	String s = "hello";
      
	if (args.length == 0){
	    System.out.println("First argument must be i, s, or b");
	    System.exit(0);
	}
	String choice = args[0];
	if (args.length > 1){
	    size = Integer.parseInt(args[1]);
	}
	if (args.length > 2){
	    s = args[2];
	}
	
	sorting1 n = new sorting1(size, s);
	n.add("potato");
	n.add("goodbye");
	n.add("apples");
	n.add("thesaurus");
	
	if (choice.equals("i")){
	    n.isort();
	    System.out.println("isort");
	}
	if (choice.equals("s")){
	    n.ssort();
	    System.out.println("ssort");
	}
	else{
	    n.bsort();
	    System.out.println("bsort");
	}
	
    }

}
