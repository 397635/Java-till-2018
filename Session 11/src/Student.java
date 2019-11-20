
public class Student {
	
	String name;
	int grade;
	
	void readBook (Book book) {
		System.out.println("Reading " + book.name + " by " + book.author);
	}
	
	Book getBookRead () {
		Book b = new Book();
		b.name = "Harry Potter";
		b.author = "JK Rowling";
		System.out.println("Read " + b.name + " by " + b.author);
		return b;
		
		
	}

}
