package encapsulation;

public class Book {
       String name;
       Author author;
       double price;
       int qtyInStock;
       Book(String bname,double p,int  q,String aname,String aemail,char agender)
       {
    	   name=bname;
    	   price=p;
    	   qtyInStock=q;
    	   author=new Author(aname,aemail,agender);
    	   
       }
       
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthorName() {
		return author.name;
	}

	public void setAuthorName(String name) {
		this.author.name = name;
	}
    public String getAuthorEmail()
    {
    	return author.email;
    
    }
    public void setAuthorEmail(String email)
    {
    	this.author.email=email;
    }
    public char getAuthorGender()
    {
    	return author.gender;
    }
    public void setAuthorGender(char gender)
    {
    	this.author.gender=gender;
    }
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQtyInStock() {
		return qtyInStock;
	}

	public void setQtyInStock(int qtyInStock) {
		this.qtyInStock = qtyInStock;
	}

	public static void main(String[] args) {
		Book b=new Book("Game Of Thrones",2000.55,50,"George Martin","george@got.com",'M');
		System.out.println(b.getName());
		System.out.println(b.getAuthorName());
		System.out.println(b.getAuthorEmail());
		System.out.println(b.getAuthorGender());
		System.out.println(b.getPrice());
		System.out.println(b.getQtyInStock());
		
		
		// TODO Auto-generated method stub

	}

}
