import java.util.ArrayList;
import java.lang.IllegalArgumentException;
public class NoNullArrayList<T> extends ArrayList<T>{
  public NoNullArrayList(){
    super();
  }

  public NoNullArrayList(int size){
    super(size);
  }

  public boolean add(T element){
    if(element==null){throw new IllegalArgumentException("no nulls");}
    super.add(element);
    return true;
  }
}
