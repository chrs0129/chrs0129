package day24_CustumMethodReturn;

public class ReturnMethodPrectice {
    public static int maxNumber(int a, int b) {
        int result = 0;
        if (a > b) {
            result = a;
        } else {
            result = b;
        }
        return result;
    }

    public static void main(String[] args) {
        int max=maxNumber(100, 200);
        System.out.println(max);
        int multiplication = max*2;
        System.out.println(multiplication);
    }
}

