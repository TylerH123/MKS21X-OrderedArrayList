public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T>{
  public OrderedArrayList(){
    super();
  };
  public OrderedArrayList(int capacity){
    super(capacity);
  }
  public boolean add(T element){
    if (super.size() == 0){
      super.add(element);
      return true;
    }
    int len = super.size();
    for (int i = 0; i < len; i++){
      if(super.get(i).compareTo(element) >= 0){
        super.add(i, element);
        len--;
        return true;
      }
    }
    super.add(element);
    return true;
  }
  public void add(int index, T element){
    add(element);
  }
  public T set(int index, T element){
    T old = super.get(index);
    super.remove(index);
    add(element);
    return old;
  }
}
