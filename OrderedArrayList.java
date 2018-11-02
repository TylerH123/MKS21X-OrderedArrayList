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
    if (super.get(super.size() - 1).compareTo(element) <= 0 ){
      super.add(element);
    }
    else{
      super.add(super.size() - 1, element);
    }
    return true;
  }
  //public void add(int index, T element){
  //  super.add(index, element);
  //}
}
