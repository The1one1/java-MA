import java.util.Scanner;

public class max_min {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int x[]= new int[4];
        System.out.print("Enter values::");
        for(int i=0;i<4;i++){
            x[i]=in.nextInt();
        }
        
        int a=1349348;
        int b=-1;
        for(int i=0;i<4;i++)
        {
            if(x[i]>b) b=x[i];
            if(x[i]<a) a=x[i];
         }
        System.out.println("max:"+b);
        System.out.println("min:"+a);
        in.close();
    }

}
