import java.util.ArrayList;
public class Tester{
  public static void main(String[] args){
    NoNullArrayList<Integer> a = new NoNullArrayList<Integer>();
    NoNullArrayList<String> b = new NoNullArrayList<String>(3);
    ArrayList<Integer> test = new ArrayList<>();
    test.add(15);
    a.add(1);
    System.out.println(a);
    a.add(0, 3);
    System.out.println(a);
    System.out.println(b);
    System.out.println(test);
    System.out.println(test.set(0, 20));
    System.out.println(test);
    System.out.println(b.add("Hello!"));
    System.out.println(b.set(0, "You Shouldn't Be Seeing This"));
    System.out.println(b);
    OrderedArrayList<Integer> c = new OrderedArrayList<Integer>();
  }
}
