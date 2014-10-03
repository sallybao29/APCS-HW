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
    //around 15 minutes
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
    //10 minutes
    public String tri3(int h){
	String s = "";
	int sp,st,row;
	for(row = 1;row <= h;row++){
	    for(sp = h - row;sp > 0;sp--){
		s += " ";
	    }
	    for(st = (row * 2) - 1;st > 0;st--){
		s += "*";
	    }
	    s += "\n";
	}
	return s;
    }
    //30 minutes. Can't get it working properly for even number inputs. 
    public String diamond(int h){
	String s = "";
	int sp,st;
	int lim = (h / 2) + 1;
	int row = 1;
	if (h % 2 == 0){
	    lim = h / 2;
	}
	while(row < lim){
	    for(sp = h - row;sp > 0;sp--){
		s += " ";
	    }
	    for(st = (2 * row) - 1;st > 0;st--){
		s += "*";
	    }
	    row += 1;
	    s += "\n";
	}

	if (lim % 2 == 0){
	    row += 1;
	}

	while(row > 0){
	   
	    for(sp = h - row;sp > 0;sp--){
		s += " ";
	    }
	    for(st = (2 * row) -1;st > 0;st--){
		s += "*";
	    }
	    row -= 1;
	    s += "\n";
	}
	return s;
    }
  
    //8 minutes
    public String tri4(int h){
	String s = "";
	int sp,st,row;
	for(row = 0;row < h;row++){
	    for(sp = row;sp > 0;sp--){
		s += " ";
	    }
	    for(st = h - row;st > 0;st--){
		    s += "*";
	    }
	    s += "\n";
	}
	return s;
    }
}
