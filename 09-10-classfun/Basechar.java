/* superclass for warrior (base class) and Mage */
public class Basechar {
    private int health=20;
    private String name;

    public String toString(){
	return getName();
    }
    public int getHealth() {
	return health;
    }
   
    public Basechar(String n){
	name = n;
    }
    public Basechar(){
	name = "Mr. Popper";
    }
   
    public String getName(){
	return name;
    }
    
}
