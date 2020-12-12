import java.util.ArrayList;
import java.lang.IllegalArgumentException;
public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T>{
  public OrderedArrayList(){
    super();
  }

  public OrderedArrayList(int size){
    super(size);
  }
}
