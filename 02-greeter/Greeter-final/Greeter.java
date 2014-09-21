public class Greeter {
    private String greeting = new String("What's up?");
    public String getGreeting(){
	return greeting;
    }
    public void setGreeting(String s){
	greeting = s;
    }
    public String greet(){
	return greeting;
    }
    public String greetPerson(String name){
	return "Hello" + " " + name;
    }
}
