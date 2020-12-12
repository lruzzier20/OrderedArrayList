public class Tester{
  public static void main(String[] args){
    NoNullArrayList<Integer> a = new NoNullArrayList<Integer>();
    a.add(1);
    a.add(null);
    System.out.println(a);
  }
}
