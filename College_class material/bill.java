class bill{
    public static void main(String[] args) {
        double discount = 0, totalamount = 10000;
        double netamount =0;
        if(totalamount >= 50000){                                cccccccv 
            discount = 15;
        }
        else if(totalamount <= 50000 && totalamount >= 25000){
            discount = 10;
        }
        else if(totalamount <= 25000 && totalamount >= 10000){
            discount = 5;
        }
        else if(totalamount <= 10000 && totalamount >= 5000){
            discount = 2;
        }
        else if (totalamount < 50000 ){
            discount = 0;
        }
        
        netamount = totalamount - (totalamount * discount)/100;
        System.out.println("Discount is " + discount + "%");
         System.out.println("netamount is " + netamount);
    }
}