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
  }
}
