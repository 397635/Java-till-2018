import java.util.Stack;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DiscManager manager = new DiscManager();
		Disc s = manager.small;
				manager.small= null;
		
		
		Stack<Disc> discs = new Stack <Disc>();
		
		Disc big = new Disc ("big");
		Disc medium = new Disc ("medium");
		Disc small = new Disc ("small");

		discs.push(big);
		discs.push(medium);
		discs.push(small);
		
		for( Disc s1: discs) {
			System.out.println(s.name);
		}
		
		Disc top = discs.pop();
		System.out.println(top.name);
		
		Disc top1 = discs.pop();
		System.out.println(top1.name);
		
		Disc top2 = discs.pop();
		System.out.println(top2.name);
		
	}
	
	
	

}
