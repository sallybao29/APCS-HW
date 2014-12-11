import java.util.*;

public class Nomar extends Basechar{
    private String name;
    private double intimidation;
    String[] items = {"Water Bottle","Coffee"};

    public Nomar(){
	super();
	name = "The Great Nomar";
	intimidation = 0.5;
    }
    
    public Nomar(String name){
    	super(name);
    	intimidation = 0.1;
    }

    public void setStats(Basechar other){
	Random r = new Random();
	int levelFactor = r.nextInt(5) - 3;
	if (levelFactor <= 0){
	    this.setLv(1);
	}
	else{
	    this.setLv(levelFactor + other.getLv());
	}
	this.setHP(this.getLv() * 10);
    }
    
    public double getIntimidation(){
    	return intimidation;
    }
    
    public void setIntimidation(double NewIntimidation){
    	intimidation = NewIntimidation;
    }
    
    public static void wait(int ms){
    	try {
	    Thread.sleep(ms);
    	} catch (Exception e) {}
    }

    public void itemDrop(Basechar other){
	Random r = new Random();
	int i = r.nextInt(2);
	String weapon = this.getWielded();
	if (other.getLv() > 0){
	    dropChance(items[0]);
	}
	if (other.getLv() > 5){
	    dropChance(items[1]);
	}
	if (weapon != "Bare Hands"){
	    System.out.println("You got your " + weapon + " back!");
	    wait(3000);
	    Scanner sc = new Scanner(System.in);
	    String input = sc.nextLine();
	    while(!(input.equals("0") || input.equals("1"))){
		System.out.println("Do you want to equip it?\n0) Yes 1) No");
		if (input.equals("0")){
		    other.setWielded(weapon);
		    System.out.println("You equip your " + weapon);
		}
		else if (input.equals("1")){
		    System.out.println("You put your " + weapon + " away");
		}
	    }
	}
    }
       
  
    public void dropChance(String item){
	Random chanceToDrop = new Random();
	if (chanceToDrop.nextDouble() > 0.3){
	    System.out.println(this + " dropped " + item + "!");
	    wait(2000);
	    System.out.println("You take it for yourself");
	    //add item to inventory;
    
	}
    }

    public void attack(Basechar other) {
	Random r = new Random();
	int i = r.nextInt(4);

	switch (i) {
	case 0:
	    basicAttack(other);
	    break;
			
	case 1:
	    lecture(other);
	    break;

	case 2:
	    instaKill(other);
	    break;

	case 3:
	    confiscation(other);
	    break;
	}
    }

    public void basicAttack(Basechar other) {
	System.out.println(this + " attacks you!");
	wait(2000);
	if (this.toHit(1)) {
	    int damage = this.getAtk(false) - (other.getDef() / 2);
	    other.setHP(other.getHP() - damage);
	    System.out.println(this + " landed a hit!");
	    wait(2000);
	    System.out.println(this + " inflicted " + damage + " damage!!");
	    wait(3000);
	}

	else {
	    System.out.println(this + " missed!!");
	    wait(3000);
	}
    }
	
    public void lecture(Basechar other){

	Random chanceToHit = new Random();
	Random IntFactor = new Random();
	double intd = this.getIntimidation();
		
	if (chanceToHit.nextDouble() < this.getAccuracy()){
	    System.out.println(this + " gives you a lengthy lecture");
	    wait(5000);
	    other.setHP(other.getHP() - (this.getAtk(false) - (other.getDef() / 2)));
	    this.setIntimidation(intimidation + ((Math.abs(IntFactor.nextDouble() - intimidation)) * 0.5));
	}

	else{
	    System.out.println(this + " tries to lecture you but you can't hear him over your blasting headphones");
	    wait(3000);
	}
    }
    
    public void instaKill(Basechar other){
        Random chanceToHit = new Random();
        if (chanceToHit.nextDouble() < (this.getAccuracy() * 0.3)){
	    System.out.println(this + " calls your parents");
	    wait(3000);
	    other.setHP(0);
        }
        else{
	    System.out.println(this + " calls your parents but no one answers");
	    wait(3000);
        }
    
    }
    
    public void confiscation(Basechar other){
    	Random chanceToHit = new Random();
    	if (chanceToHit.nextDouble() < (this.getAccuracy())) {
	    if (other.getWielded().equals("Bare Hands")) {
		System.out.println(this + " uses confiscate");
		wait(3000);
		System.out.println("...but you had nothing on you");
		wait(3000);
	    }
	    else{
		System.out.println(this + " confiscates your " + other.getWielded());
		wait(3000);
		this.setWielded(other.getWielded());
		other.setWielded("Bare Hands");	
	    }   		
    	}
    }

    public static void main(String[] args){
	Nomar a = new Nomar("Pencil");
	Nomar b = new Nomar("Sharpener");
	System.out.println(a.compareTo(b));
    }

}

  

	
