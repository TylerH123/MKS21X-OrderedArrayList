import java.util.ArrayList;
public class NoNullArrayList<T> extends ArrayList<T>{
  public NoNullArrayList(){
    super();
  }
  public NoNullArrayList(int capacity){
    super(capacity);
  }
  public Object set(int index, Object element){
    if (index < 0 || index >= super.size()) throw new ArrayIndexOutOfBoundsException();
    if (element == null){
      throw new IllegalArgumentException();
    }
    /*Object old = ArrayList<T>.get(index);
    return old;*/
  }
}
