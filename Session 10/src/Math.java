
public class Math {

	//static = share
	
	int previousnumber;
	
	static int add(int x, int y) {
		int z = x + y;
		return z;
	}

	int addSpecial(int n) {
		
		int result = previousnumber +n;
		
		previousnumber = result;
		return result;
	}
	
	int sub(int x2, int y2) {
		int z2 = x2 - y2;
		return z2;
	}

}



