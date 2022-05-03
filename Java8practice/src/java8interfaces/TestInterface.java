package java8interfaces;

public class TestInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t1= (x1,x2,x3) ->{
			return (x1+x2+x3); 
		};
		System.out.println(t1.myFunction(5, 7, 8));
		Test t2=(x1,x2,x3) ->{
			return (x1*x2*x3);
		};
		System.out.println(t2.myFunction(3, 2, 4));

	}

}
