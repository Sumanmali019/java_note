package opps.Inheritance;

public class main {
    public static void main(String[] args) {
        String[] langues = { "Java", "Dart", "Flutter" };
        Progremmer progremmer = new Progremmer("suman", 28, "chakdaha", langues);

        progremmer.WriteCode();

        

        System.out.println(progremmer.getName());
        System.out.println(progremmer.getAge());
        System.out.println(progremmer.getAddress());

    }
}
