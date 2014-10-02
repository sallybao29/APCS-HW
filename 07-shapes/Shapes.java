public class Shapes {
    public String box(int r, int c) {
	String s = "";

	while (r>0){
	    int cc = 0;
	    while (cc < c){
		s += "*";
		cc += 1;
	    }
	    s = s + "\n";
	    r--;
	}

	return s;
    }
    //15 minutes
    public String tri1(int h){
	String ans = "";
	int num  = 1;
	int count = num;
	while (num <= h){
	    count = num;
	    while (count > 0){
		ans = ans + "*";
		count = count - 1;
	    }
	    ans = ans + "\n";
	    num = num + 1;
	}
	return ans;
    }
    public String tri2(int h){
	String ans = "";
	int num = 1;
	int count = num;
	while (num <= h){
	    count = num;
	    int space = h - count;
	    while (count > 0){
		while (space > 0){
		    ans = ans + " ";
		    space = space - 1;
		}
		ans = ans + "*";
		count = count - 1;
	    }
	    ans = ans + "\n";
	    num = num + 1;
	}
	return ans;
    }
}
