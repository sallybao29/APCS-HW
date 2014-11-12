public class Driver{
    public static void main(String[] args){
	Sarray s = new Sarray();
	s.add(5);
	System.out.println(s);
	s.add(10);
	System.out.println(s);
	s.remove(1);
	System.out.println(s);
	try {
	s.get(18);
	} catch (IndexOutOfBoundsException e){
	    System.out.println(e);
	}

    }
}
