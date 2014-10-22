public class Shapes {
    public String line(int a, String str){
	String s = "";
	int i;
	for(i = 0;i < a;i++){
	    s += str;
	}
	return s;
    }
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
	String s = "";
	int r;
	for(r = 0;r < h;r++){
	    s += line(r + 1, "*");
	    s += line(h - r - 1, " ");
	    s += "\n";
	}
	return s;
    }

    //around 15 minutes
    public String tri2(int h){
	String s = "";
	int r;
	for(r = 0;r < h;r++){
	    s += line(h - r - 1, " ");
	    s += line(r + 1, "*");
	    s += "\n";
	}
	return s;
    }

    //10 minutes
    public String tri3(int h){
	String s = "";
	int r;
	for(r = 0;r < h;r++){
	    s += line(h - r - 1, " ");
	    s += line(r * 2 + 1, "*");
	    s += "\n";
	}
	return s;
    }
    //30 minutes
    public String diamond(int h){
	h = h - (h / 2);
	String s = tri3(h);
	int r;
	for(r = h - 2; r >= 0;r--){
	    s += line(h - r - 1, " ");
	    s += line(r * 2 + 1, "*");
	    s += "\n";
	}
	return s;
    }
  
    //8 minutes
    public String tri4(int h){
	String s = "";
	int r;
	for(r = 0;r < h;r++){
	    s += line(r, " ");
	    s += line(h - r, "*");
	    s += "\n";
	}
	return s;
    }
}
