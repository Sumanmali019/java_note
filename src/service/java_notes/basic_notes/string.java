package service.java_notes.basic_notes;

import java.lang.reflect.Array;
import java.util.Arrays;

public class string {

    public static void main(String[] args) {
        // String name = "suman";
        // String name2 ="suman";
        // name2 = "mali";

        // System.out.println(name2);

        // System.out.println(name.toUpperCase());

        // System.out.println(" ".isBlank());
        // System.out.println(" ".isEmpty());
        // System.out.println("hello ".trim());
        // System.out.println(name.startsWith("S"));
        // System.out.println(name.concat(" Mali"));

        // System.out.println(name.toCharArray());

        // String name3 = new String ("suman");
        // System.out.println(name == name3);
        // System.out.println(name.equals(name3));

        // Create an array of n numbers
        // String[] word = { "hi", "name", "my", "is", "suman", "mali" };

        // capilize the frist word in the array

        // for (int i = 0; i < word.length; i++) {
        // // word[i] = word[i].toUpperCase();
        // String up = word[i];
        // word[i] = Character.toUpperCase(up.charAt(0)) + up.substring(1);
        // }
        // for (String up : word) {
        // System.out.print(up + " ");
        // }

        // reserve the string

        // for (int i = word.length - 1; i >= 0; i--) {
        // System.out.print(word[i]);
        // if (i != 0) {
        // System.out.print(" ");
        // } else {
        // System.out.print("?");
        // }
        // }
 
        String input = "01.90, 1.00, 9.00, 8.78, 0.01";
        double result = 0;

        String[] number = input.split(",");

        System.out.print(Arrays.toString(number));

        for (String s : number) {
            double num = Double.parseDouble(s);
            result += num;

        }
        System.out.println(" "+result);

    }
}
