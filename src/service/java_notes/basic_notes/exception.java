package service.java_notes.basic_notes;


public class exception {

    public static void main(String[] args) {

    }

    public static double divide(double a, double b) throws Exception {
        if (b == 0) {
            throw new Exception("CANNOT divide");
        }
        return a / b;

    }
}
