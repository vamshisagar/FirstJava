import java.util.ArrayList;


public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(2);
        for(Integer i: al)
        {
            System.out.println(i);
        }
        System.out.println("adding 1st change");
        System.out.println("adding 2nd change");

    }
}
