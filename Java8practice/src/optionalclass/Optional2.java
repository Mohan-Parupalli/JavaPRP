package optionalclass;
import java.util.Optional;
public class Optional2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String address=null;
		String default_add="India";
		Optional<String> op=Optional.ofNullable(address);
		System.out.println(op.orElse(default_add));

	}

}
