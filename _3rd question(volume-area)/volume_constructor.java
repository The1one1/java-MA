import java.util.Scanner;

class box_volume{
    int h,w,l;
    box_volume(int x,int y,int z){
        h=x;
        w=y;
        l=z;
    }
    int vol(){
        return (h*w*l);
    }
};

public class volume_constructor{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        box_volume kl=new box_volume(in.nextInt(),in.nextInt(),in.nextInt());
        System.out.println(kl.vol());
        in.close();
    }
}