package day07_Operators;

public class UnaryOperators {
    public static void main(String[] args) {
        int a =5;
        ++a; // pre increment: increases value by 1 immediatly
--a; // decrease value by 1
        System.out.println(a);
        System.out.println("--------------------------------------");
int b = 100;
        System.out.println(++b);
        int c = 100;
        int x =200;
int y = 200;
int z =45;
        System.out.println(c++); // post increment
        System.out.println(c);
        System.out.println(--x);
        System.out.println(y--);
        System.out.println(y);
        System.out.println(++z);
        System.out.println(z++);
        System.out.println(z);

        int q = 30;
        System.out.println(--q);
        System.out.println(q--);
        System.out.println(q);

    }
}
