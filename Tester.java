public class Tester{
  public static void main(String[] args){
    NoNullArrayList<Integer> a = new NoNullArrayList<Integer>();
    NoNullArrayList<String> b = new NoNullArrayList<String>(3);
    a.add(1);
    System.out.println(a);
    a.add(0, null);
    System.out.println(a);
    System.out.println(b);
  }
}
