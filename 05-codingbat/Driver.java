public class Driver {
    public static void main(String[]args) {
	StringStuff s = new StringStuff();
	System.out.println(s.nonStart("hello", "goodbye"));
	System.out.println(s.makeAbba("yo", "lo"));
	System.out.println(s.diff21(30));
	System.out.println(s.nearHundred(108));
	System.out.println(s.teaParty(4,6));
	System.out.println(s.lastDigit(52,62,70));
    }
}
