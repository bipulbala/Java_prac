import java.util.*;
class Room{
		int length, breadth, height;
	void get_value(){
		Scanner obj = new Scanner(System.in);
		System.out.println("enter the lenght :");
		length = obj.nextInt();

		
		System.out.println("enter the breadth :");
		breadth = obj.nextInt();

		System.out.println("enter the height :");
		height = obj.nextInt();
		

		
		}
	int value() {
			return length * breadth * height ;
			 
		}

}

public class Room_demo {
	public static void main(String args[]){
		Room abc = new  Room();
			abc.get_value();
	System.out.println("volume is : " + abc.value());
}

}