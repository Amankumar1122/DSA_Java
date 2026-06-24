package Array;

import java.util.Scanner;

public class ReverseString {
    char[] reverse(char[] s) {
        int j = s.length - 1;
        for (int i = 0; i < j; i++) {
            char a = s[i];
            s[i] = s[j];
            s[j] = a;
            j--;
        }
        return s;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string u want to reverse");
        String k = sc.nextLine();

        char[] s = k.toCharArray();

        ReverseString so = new ReverseString();
        System.out.println(so.reverse(s));
    }
}