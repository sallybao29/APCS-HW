public class StringStuff {
    public String nonStart(String a, String b) {
	return a.substring(1) + b.substring(1);
    }
    public String makeAbba(String a, String b) {
	return a + b + b + a;
    }
    public int diff21(int n) {
	if (n > 21) {
	    return 2 * (n - 21);
	}
	else {
	    return 21 - n;
	}
    }
    public int teaParty(int tea, int candy) {
        if ((tea < 5) || (candy < 5)) {
	    return 0;
	}
	else if ((tea >= (2* candy)) || (candy >= (2 * tea))) {
	    return 2;
	}
	else {
	    return 1;
	}
    }
    public boolean lastDigit(int a, int b, int c) {
	int d = a%10;
	int e = b%10;
	int f = c%10;
	return (d == e || e == f || d == f);
    }

}
