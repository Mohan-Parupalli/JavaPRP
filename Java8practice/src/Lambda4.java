interface WordCount
{
	abstract int count(String str);
}

public class Lambda4 {

	public static void main(String[] args) {
		WordCount wc= (s)->
		{
			String st[] = s.split(" ");
			int count=st.length;
			return count;
		};
		System.out.println(wc.count("He is mapped to java stream"));
		// TODO Auto-generated method stub

	}

}
