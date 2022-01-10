package Day15_Forloop;

public class StringMethods {
    public static void main(String[] args) {
        String str = "     ";
        boolean r = str.isEmpty();
        System.out.println(r);
        boolean r1 = str.isBlank();
        System.out.println(r1);
        String str2 = "Cydeo";
        System.out.println(str2.isBlank());
        System.out.println("--------------------------------------------------");
        String s1 = "CYDEO";
        String s2 = "cydeo";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println("yEs".equalsIgnoreCase("yes"));
        System.out.println("---------------------------------------------------");
        String sentence = "My favorite programming language is Java";
        boolean hasCSharp = sentence.contains("C#");
        System.out.println(hasCSharp);
        boolean hasJava = sentence.contains("Java");
        System.out.println(hasJava);
        boolean hasJava3 = sentence.toLowerCase().contains("java");
        System.out.println(hasJava3);
        System.out.println("_____________________________________________________");
        String input1 = "I love jAvA";
        String input2 = "Java";
        System.out.println(input1.equals(input2));
        System.out.println(input1.equalsIgnoreCase(input2));
        System.out.println(input1.contains("Java"));
        System.out.println(input1.toLowerCase().contains("java"));
        System.out.println(input1.toUpperCase().contains("JAVA"));
        System.out.println("-----------------------------------------------------");
        String a = "Wooden Spoon";
        boolean x =a.startsWith("Woo");
        boolean y = a.endsWith("on");
        System.out.println(x);
        System.out.println(y);
        boolean z = a.toLowerCase().startsWith("wooden");
        System.out.println(z);




    }
}
