
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DiscManager manager = new DiscManager();
		Disc s = manager.getSmall();
		System.out.println(s.getSize());
		Disc m = manager.getMedium();
		System.out.println(m.getSize());
		Disc b = manager.getBig();
		System.out.println(b.getSize());

	}

}
