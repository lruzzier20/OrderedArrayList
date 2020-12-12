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
    c.add(5);
    c.add(4);
    c.add(3);
    c.add(2);
    c.add(1);
    c.add(0);
    c.add(5);
    c.add(5);
    c.add(6);
    c.add(7);
    System.out.println(c);
    c.add(0, 10000);  
    System.out.println(c);
  }
}
