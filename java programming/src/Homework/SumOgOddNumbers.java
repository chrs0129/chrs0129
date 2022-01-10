package Homework;

public class SumOgOddNumbers {
    public static void main(String[] args) {
        int total = 0;
        for(int i = 1; i<100; i++){
            if(i%2==1){
                total = total + i;
            }
        }
        System.out.println(total);
    }
}
