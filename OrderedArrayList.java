public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T>{
  public OrderedArrayList(){
    super();
  };
  public OrderedArrayList(int capacity){
    super(capacity);
  }
  private void order(){
    int count = 0;
    for (int i = 0; i < super.size()-1; i++){
      if (super.get(i).compareTo(super.get(i+1)) == 1){
        swap(i, super.get(i), i+1, super.get(i+1));
        count++;
      }
    }
    if (count > 0){
      order();
    }
  }
  private void swap(int idx1, T obj1, int idx2, T obj2){
    super.set(idx1, obj1);
    super.set(idx2, obj2);
  }
  public boolean add(T element){
    super.add(element);
    order();
    return true;
  }
  public void add(int index, T element){
    super.add(index, element);
    order();
  }
}

//["1", "3", "2", "5", "6"]
