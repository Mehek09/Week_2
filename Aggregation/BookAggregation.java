package Week2;


class Author
{
 private String name;
 private String mail;
 private char gender;
 
 
 Author(String name,String mail,char gender) {
	 this.name=name;
	 this.mail=mail;
	 this.gender=gender;
	
     }
 

 public String getName() {
	 return name;
 }
 

 public void setName(String name) {
	 this.name = name;
  }

 public String getMail() {
	return mail;
}

public void setMail(String mail) {
	this.mail = mail;
}

public char getGender() {
	return gender;
}

public void setGender(char gender) {
	this.gender = gender;
}
  
}

class Book {
	private static String name;
    private static Author author;
    private static double price;
    private static int quantity;
 Book(String name,Author author,double price,int quantity){
	 
	 Book.name=name;
	 Book.author=author;
	 Book.price=price;
	 Book.quantity=quantity;
	 
 }
 

 public static String getName() {
	 return name;
}


public void setName(String name) {
	
	Book.name = name;
}



public static Author getAuthor() {
	return author;
}


public void setAuthor(Author author) {
	Book.author = author;
}


public static double getPrice() {
	return price;
}


public void setPrice(double price) {
	Book.price = price;
}


public static int getQuantity() {
	return quantity;
}


public void setQuantity(int quantity) {
	Book.quantity = quantity;
}


public void diaplayAuthordetails()
 {
	System.out.println("Author Details are:");
	System.out.println("Author's Name"+author.getName());
	System.out.println("Author's mail:"+author.getMail());
	System.out.println("Author's Gender"+author.getGender()); 

 }
public void diaplayBookdetails() 
{
	System.out.println("Book details are :");	
	System.out.println("Title iof the Book:"+Book.getName());
	System.out.println("Price of the book:"+Book.getPrice());
	System.out.println("Quantity of the books:"+Book.getQuantity());
}
}
class BookAggregation {
	public static void main(String[] args) {
		Author author=new Author("Joshua Blouch","Joshua@gmail.comn",'M');
	    Book book=new Book("Effective Java",author,45,15);
	    book.diaplayAuthordetails();
	    book.diaplayBookdetails();
 }
}