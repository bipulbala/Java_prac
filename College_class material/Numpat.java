public class Numpat {
        public static void pnt(int n){
            int i,j;
            for(i=1;i<n;i++){
                for(j=1;j<i;j++){
                    System.out.print(i);
                }
                System.out.println(i);
            }
        }
        
        public static void main (String args[]){
            int n =5;
            pnt(n);
            
        }
        }

