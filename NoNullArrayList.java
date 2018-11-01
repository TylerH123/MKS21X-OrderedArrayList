import java.util.ArrayList;
public class NoNullArrayList<T> extends ArrayList<T>{
  public NoNullArrayList(){
    super();
  }
  public NoNullArrayList(int capacity){
    super(capacity);
  }
  public boolean add(T element){
    if (element == null) return false;
    return super.add(element);
  }
  public void add(int index, T element){
    if (index < 0 || index > super.size()) throw new ArrayIndexOutOfBoundsException();
    if (element == null) throw new IllegalArgumentException();
    super.add(index, element);
  }
  public T set(int index, T element){
    if (index < 0 || index > super.size()) throw new ArrayIndexOutOfBoundsException();
    if (element == null){
      throw new IllegalArgumentException();
    }
    return super.set(index, element);
  }
}
