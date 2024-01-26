package opps.Inheritance;

public class Manager extends Empoloye {
    private int size;

    public Manager(String name, int age, String address) {
        super(name, age, address);
        // TODO Auto-generated constructor stub
    }

    public void report() {
        System.out.println("report");
    }
}
 