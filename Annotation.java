class A{
    public void ShowA(){
        System.out.println("Sme thing is Showing at the Meta Data");
    }
}
class B extends A{
    @Override
    public void ShowA(){
        System.out.println("Every Thing is Out of meta part");
    }
}
public class Annotation{
    public static void main (String a[]){
        
    }
}