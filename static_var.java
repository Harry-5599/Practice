public class Hey{
  public static int a=10;
  public static void goo(){
    System.out.println("This is goo method in Hey class");
  }
}
public class Key{
  public static void main(String args[]){
    //Accessing by using object 
    Hey h=new Hey();
    System.out.println(h.a);
    h.goo();
    
    //Accessing by using Class Name
    System.out.println(Hey.a);
    Hey.goo();
  }
}