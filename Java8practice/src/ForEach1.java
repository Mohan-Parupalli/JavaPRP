import java.util.*;
public class ForEach1 {

	public static void main(String[] args) {
		List<String> w=new ArrayList<String>();
		w.add("Monday");
		w.add("Tuesday");
		w.add("Wednesday");
		w.add("Thusrday");
		w.add("Friday");
		//w.forEach(System.out::println);
		w.forEach(n -> System.out.println(n));
		// TODO Auto-generated method stub

	}

}
