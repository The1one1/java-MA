import java.util.Scanner;

class cirlce_rectangle{

    void circle(int r){
        System.out.println("area of circle:"+3.14*r*r);
    }

    void rectangle(int l,int b){
        System.out.println("area of rectangle:"+(l*b));
    }
}

public class area {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        cirlce_rectangle cr=new cirlce_rectangle();
        System.out.print("Radius of circle:");
        cr.circle(in.nextInt());
        System.out.print("length and breadth of rectangle:");
        cr.rectangle(in.nextInt(),in.nextInt());;
        in.close();
    }
    
}
