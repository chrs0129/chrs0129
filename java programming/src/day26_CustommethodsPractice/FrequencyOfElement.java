package day26_CustommethodsPractice;

public class FrequencyOfElement {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 11, 1, 22, 333, 44, 1, 1, 1, 1, 1};
        int n = frequencyOfElement(arr, 1);
        System.out.println(n);
        char[] ch = {'a', 'a', 'c', 'd'};
        int n1 = frequencyOfElement(ch,'a');
        System.out.println(n1);

    }
    //returns the frequency of the given element from the given array
    public static int frequencyOfElement(int[] array, int element){
        int count = 0;
        for (int each : array) {
            if(each == element){
                count++;
            }
        }

        return count;
    }


    //returns the frequency of the given element from the given array
    public static int frequencyOfElement(double[] array, double element){
        int count = 0;
        for (double each : array) {
            if(each == element){
                count++;
            }
        }

        return count;
    }


    //returns the frequency of the given element from the given array
    public static int frequencyOfElement(char[] array, char element){
        int count = 0;
        for (char each : array) {
            if(each == element){
                count++;
            }
        }

        return count;
    }


    //returns the frequency of the given element from the given array
    public static int frequencyOfElement(String[] array, String element){
        int count = 0;
        for (String each : array) {
            if(each.equals( element )){
                count++;
            }
        }

        return count;
    }


}

