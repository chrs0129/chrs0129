package ReplittWorks;

import java.util.Scanner;

public class MiddleTreeChars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        String nword = word.substring(word.length() / 2 - 1, word.length() / 2 + 2);

        if (word.length() > 5 && word.length() % 2 != 0) {
            System.out.println(nword);
        } else {
            System.out.println("invalid");
        }


        scan.close();
    }
}
/*
Given a String variable **word** print the middle three characters if the word is an odd number of characters and has more than 5 characters.
 If the word does not meet the requirements print invalid.
```
fifteen ==> fte
```

```
apple ==> ppl
```

```
hey ==> invalid
```

```
java ==> invalid
```

```
whatsup ==> ats
```

```
$ ==> invalid
 */