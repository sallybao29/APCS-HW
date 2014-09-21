public class Driver {
    public static void main(String[]args){
	Greeter g1 = new Greeter();
	g1.setGreeting("Hello!");
	System.out.println(g1.greet());
	System.out.println(g1.greetPerson("Tom"));
	System.out.println(g1.greetPerson("Sue"));
    }
}
