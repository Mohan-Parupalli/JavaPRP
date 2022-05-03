package optionalclass;
import java.util.Optional;
public class Optional1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String names[] = new String[5];
		names[0]="Mohan";
		Optional<String> op=Optional.ofNullable(names[0]);
        if(op.isPresent())
        	System.out.println(op.get().length());
        else
        	System.out.println("Null Value");
	}

}
