import java.util.*;

public class PolyTest {
    public static void main(String[] args) {
        ArrayList name = new ArrayList();
        name.add("Ani");
        name.add("Budi");
        name.add(0, "Abu");
        name.add(1, "Ali");
        name.add(1,"Ave");
        System.out.println(name);
        name.add(2, "diva");
        name.add(3, "Cantika");
        name.add(1, "Alya");

        System.out.println(name);
        System.out.println("Size of arrayList: "+ name.size());

    }
}
