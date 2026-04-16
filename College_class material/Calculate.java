import java.util.*;
class Arithmatic {
	int add(int a, int b){
	int sum = a +b;
	System.out.println("Addition : "+ sum);
		return sum;
		}

	int substract(int a, int b){
	int Subtraction = a - b;
	System.out.println("Subtraction : "+ Subtraction);
		return Subtraction;
		}

	int division(int a, int b){
	int division = a - b;
	System.out.println("division : "+ division);
		return division;
		}
	int multiply(int a, int b){
		int multiplication = a*b;
	System.out.println("multiplication : "+ multiplication);
		return multiplication;
		}
}

class Calculate{
	public static void main(String args[]){
		System.out.println("Enter  a: ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		System.out.println("Enter  b: ");
		int b = sc.nextInt();

		Arithmatic obj = new Arithmatic();

		while(true){
		System.out.println("Enter  a choice: ");
		Scanner ch = new Scanner(System.in);
		int choice = ch.nextInt();
		switch(choice){
			case 1 : 	obj.add(a,b);
				break;	
			case 2 : 	obj.substract(a,b);
				break;	
			case 3 : 	obj.division(a,b);
				break;	
			case 4 : 	obj.multiply(a,b);
				break;	

			case 5 : 	System.exit(0);
				break;	
			default : System.out.println("enter a valid choice");





		}

		
}



		


}


}