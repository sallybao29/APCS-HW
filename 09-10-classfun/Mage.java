public class Mage extends Basechar{
    private int manna =12345;
    private String name;

    //without constructors in Basechar, Mage constructors become null
    public Mage(String n){
	name = n;
    }
    public Mage(){
	name = "Chickens";
    }
    public Mage(String n, int m){
	name = n;
	manna = m;
    }

    public String toString(){
	return getName();
    }
    public String getName(){
	return name;
    }
    public int getManna(){
	return manna;
    }
    
}
