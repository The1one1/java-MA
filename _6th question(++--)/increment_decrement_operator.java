public class increment_decrement_operator {
    public static void main(String args[]) {
        int z = 8;
        System.out.println("a:" + (z++ + ++z));
        System.out.println("b:" + (z-- + --z));
        System.out.println("c:" + (z++));
        System.out.println("d:" + (++z));
        System.out.println("e:" + (z--));
        System.out.println("f:" + (--z));
    }
}
