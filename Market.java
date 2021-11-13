//Q2. Given two strings, append them together (known as "concatenation") and return the result. However, if the concatenation creates a double-char, then omit one of the chars. If the inputs are “Mark” and “Kate” then the output should be “markate”. (The output should be in lowercase)

import java.util.Locale;
import java.util.Scanner;

public class Market {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str;
        str= sc.next();
        Scanner sa = new Scanner(System.in);
        String sta;
        sta= sa.next();
        String strlower=str.toLowerCase();
        String stalower=sta.toLowerCase();
        System.out.println(strlower+stalower);
    }
}
