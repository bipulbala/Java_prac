public class primet{
	public static void main (String args[]){
		int i =2, count = 1, flag = 0, j;
		while(count<10){
			flag = 0;
			for(j=2; j<i; j++){
				if(i%j == 0){
					flag = 1;
					break;
					}

				}
			if(flag  ==  0){
			System.out.println(i);
			count++;     }
			i++;
			
			}
		}
}



