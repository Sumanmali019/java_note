package opps.Abstracts;

import java.util.*;
import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberExtarctReport {
    public String parse(String path) {
        Pattern pattern = Pattern.compile("[0-9]+");
        String out = "";
        File file = new File(path);
        Scanner sc = new Scanner(System.in);

        if (sc.hasNext()) {
            sc.nextLine();
        } else {
            return "empty file";
        }
        while ((sc.hasNext())) {
            String nextline = sc.nextLine();
            Matcher matcher = pattern.matcher(nextline);

            boolean matches = matcher.matches();
            if (matches) {
                out += matcher + "\n";
            }
        }
        return out.isBlank() ? "Empty file " : out;
    }

    public void prepareAndSendReport(String path) {
        System.out.println("starts report...");
        String report = parse(path);
        System.out.println(report);
        System.out.println("sent report");
    }
}
