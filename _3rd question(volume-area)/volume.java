import java.util.Scanner;

class box_vol
{
    int vol(int h,int w ,int l)
    {
        return (h*w*l);
    }
};

public class volume{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        box_vol kl=new box_vol();
        System.out.println(kl.vol(in.nextInt(),in.nextInt(),in.nextInt()));
        in.close();
    }
}