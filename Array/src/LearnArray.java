
public class LearnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String [] subjects;
		subjects = new String[3];
		
		subjects [0] = "Math ";
		subjects [1] = "Humanities ";
		subjects [2] = "Science";
	
		
		//for(int i=0; i< subjects.length;i++) {
			//System.out.println(subjects[i]);
		//}
		
		for(String s: subjects) {
			System.out.println(s);
		}

	}

}
