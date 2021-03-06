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

  public void add(int index, T element){
    if(element==null){throw new IllegalArgumentException("no nulls");}
    super.add(index, element);
  }

  public T set(int index, T element){
    if(element==null){throw new IllegalArgumentException("no nulls");}
    T temp=this.get(index);
    super.set(index, element);
    return temp;
  }
}
