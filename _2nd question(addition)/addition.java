public class addition {
    int a, b, c,d;
    addition(int x, int y) {
        a = x;
        b = y;
    }
    void sum1() {
        System.out.println("sum of two numbers:" + (a + b));
    }

    addition(int x, int y, int z) {
        a = x;
        b = y;
        c = z;
    }
    void sum2() {
        System.out.println("sum of three numbers:" + (a + b + c));
    }
    
    addition(int x, int y, int z, int w) {
        a = x;
        b = y;
        c = z;
        d = w;
    }
    
    void sum3() {
        System.out.println("sum of four numbers:" + (a + b + c + d));
    }
};
