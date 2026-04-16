import java.util.*;
class Array{
	public static void main(String args[]){
		int i, j, min = 0, max =0;
		System.out.println("enter the length :");
		Scanner sc  = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
System.out.println("enter the number :");
	for(i=0;  i<n;  i++){
		arr[i] = sc.nextInt();
	
}

	min = max = arr[0] ;
	for(j=0;  j<n;  j++){
		if(arr[j]>max){
		max = arr[j];	
		}
		if(arr[j]<min){
		min = arr[j];	
		}	
	
	}
System.out.println(" max is : " +max);
	System.out.println(" min is : " +min);

}



}