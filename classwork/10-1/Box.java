public class Box{
    public String Box(int r, int c){
	String ans = "";
	int a = c;
	int b = r;
	while (b > 0){
	    a = c;
	    while (a > 0){
		ans = ans + "*";
		a = a - 1;
	    }
	    ans = ans + "\n";
	    b = b - 1;
	}
	return ans;
    }
}
