public class Driver {
    public static void main(String[]args){
	String s = "sally bao";
	String first = new String(s.substring(0, s.indexOf(" ")));
	String last = new String(s.substring(s.indexOf(" ")+ 1));
	System.out.println(s);
	System.out.println(first);
	System.out.println(last);
    }
}
