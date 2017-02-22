
public class JavaOneAssignmentThree {

	public static void main(String[] args) {
		int a = 2;
		int b= 3;
		System.out.println("Before Swap - alue of A : "+ a);
		System.out.println("Before Swap - alue of B : "+ b);
		
		a = a+ b;
		b = a- b;
		a = a- b;
		
		System.out.println("After Swap - alue of A : "+ a);
		System.out.println("After Swap - alue of B : "+ b);
		
	}
}
