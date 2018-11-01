public class Driver{
  public static void main(String[] args){
    NoNullArrayList<String> arr = new NoNullArrayList<>();
    arr.add("cat");
    System.out.println(arr);
    try{
      System.out.println(arr.set(0,null));
    }
    catch(IllegalArgumentException e){
      System.out.println("Fix Argument");
    }
  }
}
