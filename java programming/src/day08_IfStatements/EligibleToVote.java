package day08_IfStatements;

public class EligibleToVote {
    public static void main(String[] args) {
        String name = "Josh";
        int age = 28;
        String citizen = "USA";
        boolean isEligible = age >= 21  && citizen == "USA";
        if(isEligible){
            System.out.println(name + " is eligible ote");
        }
if (!isEligible){
    System.out.println(name + "is not eligible to vote");
}

    }

}
