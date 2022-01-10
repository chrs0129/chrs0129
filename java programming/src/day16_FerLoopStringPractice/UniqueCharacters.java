package day16_FerLoopStringPractice;

import javax.imageio.plugins.tiff.TIFFImageReadParam;

public class UniqueCharacters {
    public static void main(String[] args) {
        String str = "aaabcccdgeeef";
        String result = "";

        for (int i = 0; i <= str.length() - 1; i++) {
char ch = str.charAt(i);

            if (str.indexOf(ch) == str.lastIndexOf(ch)) {
                result += ch + "\n";
            }
        }
        System.out.println(result);
    }
}
