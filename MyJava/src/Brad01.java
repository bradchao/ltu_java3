
public class Brad01 {
	public static void main(String[] args) {
		//Bike b1 = new Bike();
		Scooter s1 = new Scooter(1,"name1");
		Scooter s2 = new Scooter(2,"name2");
		
	}
}

class Bike {
	// �Y�L�w�q�غc��, �N�ϥ�super���L�ǰѼƤ��غc��
	Bike(){
		// super() or this()
		System.out.println("Bike()");
	}
}

class Scooter extends Bike {
	int color;
	String name;
	double speed;
	Scooter (){
		// super();
		System.out.println("Scooter()");
	}
	Scooter(int color, String name){
		// super();
		this();
		this.color = color; this.name = name;
	}
}
