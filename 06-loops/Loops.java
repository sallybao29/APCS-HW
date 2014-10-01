public class Loops {
    //ten minutes
    public String frontTimes(String str, int n){
	String a = str;
	String b = "";
	if (str.length() > 3){
	    a = str.substring(0,3);
	}
	while (n > 0){
	    b = b + a;
	    n = n - 1;
	}
	return b;
    }
    //4 minutes
    public String stringBits(String str){
	String a = "";
	int n = 0;
	while ( n < str.length()){
	    a = a + str.substring(n, n + 1);
	    n = n + 2;
	}
	return a;
    }
    public int stringMatch(String a, String b){
	int count = 0;
	int n = 0;
	String y = "";
	if (a.length() < b.length()){
	    y = a;
	}
	else{
	    y = b;
	}
	while (n < y.length()){
	    if(n + 2 <= y.length() && a.substring(n, n + 2).equals(b.substring(n,n +2))){
		count = count + 1;
	    }
	    n = n + 1;
	}
	return count;
    }
    public String stringYak(String str){
	String a = "";
	int n = 0;
	while (n < str.length()){
	    if (n + 3 <= str.length() && str.substring(n, n + 1).equals("y") && str.substring(n + 2, n + 3).equals("k")){
		n = n + 3;
    }
	    else{
		a = a + str.charAt(n);
		n = n + 1;
	    }
	}
	return a;
    }
}
   
