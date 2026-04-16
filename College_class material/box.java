class box{
    double length, breadth, height, volume;
    box(){
        this.length = 1;
        this.breadth = 2;
        this.height = 3;
    };
    box(double val){
        this.length = val;
        this.breadth = val;
        this.height = val;
    };
    box(double length, double breadth, double height){
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    void volume(){
        this.volume = length * breadth * height;
        // return this.volume;
    };
    void display(){
        
        System.out.println(this.volume);
        
    }
    public static void main (String[] args){
        box i = new box();
        box j = new box(2);
        box k = new box(1,2,3);

        

        i.volume();
        j.volume();
        k.volume();

         i.display();
         j.display();
         k.display();
    }
}