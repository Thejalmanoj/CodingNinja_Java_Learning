/*Write a program that takes a character as input and prints either 1, 0, or -1 according to the following rules.

1, if the character is an uppercase alphabet (A - Z)
0, if the character is a lowercase alphabet (a - z)
-1, if the character is not an alphabet */

import java.util.*;
class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.nextLine().charAt(0);
        int val;

        if (ch >= 'A' && ch <= 'Z') {
            val = 1;
        } else if (ch >= 'a' && ch <= 'z') {
            val = 0;
        } else {
            val = -1;
        }

        System.out.println(val);
    }
}
