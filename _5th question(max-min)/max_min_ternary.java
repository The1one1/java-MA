import java.util.Scanner;

public class max_min_ternary {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int x[]= new int[4];
        System.out.print("Enter values::");
        for(int i=0;i<4;i++){
            x[i]=in.nextInt();
        }

        int a=134556;
        int b=-1;
        for(int i=0;i<4;i++)
        {
            a=(x[i]<a)?x[i]:a;
            b=(x[i]>b)?x[i]:b;
        }
        System.out.println("max:"+b);
        System.out.println("min:"+a);
        in.close();
    }

}
