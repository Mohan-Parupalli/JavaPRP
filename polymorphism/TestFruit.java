package polymorphism;

public class TestFruit {

	public static void main(String[] args) {
		Fruit f1=new Apple();
		Fruit f2=new Orange();
		f1.name="apple";
		f1.taste="sweet";
		f1.size="medium";
		f1.eat();
		f2.name="Orange";
		f2.taste="bitter";
		f2.size="small";
		f2.eat();
		
		// TODO Auto-generated method stub

	}

}
