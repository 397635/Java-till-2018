import java.util.ArrayList;

public class OddNumberArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] oddnumbers = new int[3];
		
		oddnumbers [0] = 1;
		oddnumbers [1] = 3;
		oddnumbers [2] = 5;
	
		for(int i=oddnumbers.length -1; i>=0 ;i=i-1) {//oddnumbers.length is property
		System.out.println(oddnumbers[i]);
}
		
		ArrayList<String> subjects = new ArrayList<String> ();
		subjects.add("Math");
		subjects.add("Humanities");
		subjects.add("Science");
		subjects.add("Spanish");
		
		for(int i = 0; i<subjects.size(); i=i+1) {//subjects.size is method--has action get(i)
			System.out.println(subjects.get(i));
		}
		
	
	}

}
