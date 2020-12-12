import java.util.ArrayList;
import java.lang.IllegalArgumentException;
public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T>{
  public OrderedArrayList(){
    super();
  }

  public OrderedArrayList(int size){
    super(size);
  }

  public boolean add(T element){
    if(element==null){throw new IllegalArgumentException("no nulls");}
    boolean notdone=true;
    for(int i=0;i<this.size()&&notdone;i++){
      if(element.compareTo(this.get(i))<0){super.add(i,element); notdone=false;}
    }
    if(this.size()==0){super.add(element); notdone=false;}
    if(notdone){super.add(element); notdone=false;}
    return true;
  }

  public void add(int index, T element){
    if(element==null){throw new IllegalArgumentException("no nulls");}
    boolean notdone=true;
    for(int i=0;i<this.size()&&notdone;i++){
      if(element.compareTo(this.get(i))<0){super.add(i,element); notdone=false;}
    }
    if(this.size()==0){super.add(element); notdone=false;}
    if(notdone){super.add(element); notdone=false;}
  }
}
