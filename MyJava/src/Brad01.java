
public class Brad01 {
	public static void main(String[] args) {
		//Bike b1 = new Bike();
		Scooter s1 = new Scooter(1,"name1");
		Scooter s2 = new Scooter(2,"name2");
		
	}
}

class Bike {
	// 若無定義建構式, 將使用super之無傳參數之建構式
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
