import java.util.Scanner;

public class AreaPerimeterof2DShapes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	System.out.print("Enter what shape you want to find area or perimeter of: (1 for Circle, 2 for Rectangle, 3 for Square, 4 for Triangle, 5 for Trapezoid, 6 for Rhombus, 7 for Paralelogram \n");
	Scanner scanner = new Scanner(System.in);
	int Shape = scanner.nextInt();
	
	double pi = 3.14;
	
	if (Shape == 1) {
	System.out.print("Enter Radius: ");
	Scanner scanner1 = new Scanner(System.in);
	int r = scanner1.nextInt();
	double area1 = r * r * pi;
	double circumference = r * 2 * pi;
	
	System.out.println("\nThe area of the circle is: " + area1 + "\nThe circumference of the circle is: " + circumference);
	}
	
	if (Shape == 2) {
	
	System.out.print("Enter Length: ");
	Scanner scanner2 = new Scanner(System.in);
	int l = scanner2.nextInt();
	
	System.out.print("Enter Width: ");
	Scanner scanner3 = new Scanner(System.in);
	int w = scanner3.nextInt();
	double area2 = l * w;
	double perimeter1 = 2*l + 2*w;
	
	System.out.println("\nThe area of the rectangle is: " + area2 + "\nThe perimeter of the rectangle is: " + perimeter1 );
	
	}
	
	if (Shape == 3) {
	
	System.out.print("Enter Side: ");
	Scanner scanner3 = new Scanner(System.in);
	int s = scanner3.nextInt();
	
	double area3 = s*s;
	double perimeter2 = 4*s;
	
	System.out.println("\nThe area of the square is: " + area3 + "\nThe perimeter of the square is: " + perimeter2);
	}	

	
}
}
