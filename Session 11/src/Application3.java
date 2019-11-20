
public class Application3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1 = new Student();
		s1.grade = 8;
		s1.name = "Gauri";
		Book b1 = new Book();
		
		b1.author = "JK Rowling";
		b1.name = "Harry Potter";
		s1.readBook(b1);
		
		Book bookRead = s1.getBookRead();
		
		
		
		
		

	}

}
