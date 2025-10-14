@FunctionalInterface
interface A{
    void show();
}
public class Lambda {
    public static void main(String a[]){
        A obj = () -> 
        {
            System.out.println(" iN Show");
        };
        obj.show();
    }
}
