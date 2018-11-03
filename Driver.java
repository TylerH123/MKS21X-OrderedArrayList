public class Driver{
  public static void main(String[] args){
    NoNullArrayList<String> arr = new NoNullArrayList<>();
    System.out.println(arr.add("cat"));
    System.out.println(arr);
    arr.add(0, "George");
    System.out.println(arr);
    try{
      arr.set(0,null);
    }
    catch(IllegalArgumentException e){
      System.out.println("Fix Argument");
    }
    try{
      arr.set(-1, "0");
    }
    catch(ArrayIndexOutOfBoundsException e){
      System.out.println("Fix Index");
    }
    arr.set(1, "xxxx");
    System.out.println(arr);
    OrderedArrayList<String> ord = new OrderedArrayList<>();
    ord.add("5");
    ord.add("3");
    ord.add("9");
    ord.add("7");
    //ord.add("Dogs");
    //ord.add("jesus");
    //ord.add("apple");
    System.out.println(ord);
    System.out.println(ord.set(2, "1"));
    System.out.println(ord);
  }
}
