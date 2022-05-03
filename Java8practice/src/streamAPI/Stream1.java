package streamAPI;
import java.util.*;
import java.util.stream.Collectors;
public class Stream1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> al=new ArrayList<Integer>(Arrays.asList(1,2,-3,4,-6,7,10,-9));
		List<Integer> new1=al.stream().filter(x -> x > 0).collect(Collectors.toList());
		List<Integer> new2=new1.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
        System.out.println(al);
		System.out.println(new2);
	}

}
