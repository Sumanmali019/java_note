package service.java_notes.basic_notes;

import java.text.DecimalFormat;
import java.util.Scanner;

public class final_break_contiiue {
    // method
    /*
     * -Access modififier (Priver , public , defult)
     * -Optiona static (Belongs to a class if static is not present we spifecly
     * mention it)
     * -return type (void dosn't have any return type)
     * -name (name is the name of the method)
     * -optional Parameters
     * -Method Body
     * -Optional Return value
     */

    // Asscees Modifier
    private static double cal(Double monthlyRent, Double propertyValur) {
        var month = monthlyRent * 12;
        var c = month / propertyValur;
        var yeald = c * 100;
        return yeald;
    }

    // break and continue
    /*
     * 1. break , breaks the statement when finds and continues will continie after
     * finding
     * 2. return will exit the overall statement
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // var name = new String[] {
        //         "a",
        //         "g",
        //         "g",
        //         "sumann",
        //         "f",
        // };
        // for (String names : name) {
        //     if (names.startsWith("suman")) {
        //         return;
        //     }
        //     System.out.println(names);
        // };

        /*
         * final method overiding
         * 
         * 1. final allows to create const;
         * 2. previent inhariance
         * 3. and pervent matods overriding
         */
        System.out.println("hello");
        final var namesf = "alex";
        // namesf = "suman";
        System.out.println(namesf);

        
        double pi = Math.PI;

        int pis = (int) pi;
        System.out.println(pis);
    };
};
