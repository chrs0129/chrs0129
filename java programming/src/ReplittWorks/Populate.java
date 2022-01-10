package ReplittWorks;

public class Populate {
    public static int[] populate (int[] r){
        int[] result = new int[r.length];
        result[0] =1;
        for (int i = 0; i <r.length ; i++) {
            result[i] =i+1;
        }
        return result;
    }

    public static void main(String[] args) {

    }
}
