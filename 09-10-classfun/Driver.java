public class Driver {
    public static void main(String[] args){
	Basechar c1 = new Basechar();

	Basechar b1,b2;
	Warrior w1,w2;
	Mage m1,m2,m3;

	w1 = new Warrior();


	m1 = new Mage();
	System.out.println("m1 is " + m1);

	m2 = new Mage("Pablo");
	System.out.println("m2 is " + m2);

	m3 = new Mage("Superman", 9000);
	System.out.println("m3 " + m3 + " has " + m3.getManna() + " manna");


	/*
	b1 = new Basechar("Bob");
	System.out.println("b1 is " + b1);

	b2 = new Basechar();
	System.out.println("b2 is " + b2);
	*/
	


    }

}
