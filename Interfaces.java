interface A{
    int age = 44;
    String area = "Hyderabad";
    void show();
    void config();

}
interface x{
    void show();
}
class B implements A, x{
    public void show(){
            System.out.println("In Show");
    }
    public void config(){
        System.out.println("In  Config");
    }
    public void run(){
        System.out.println("running..........");
    }
}
public class Interfaces {
    public static void main(String a[]){
        A obj = new B(); // Use interface reference
        obj.show();
        obj.config();

        // To call run(), cast to B
        ((B)obj).run();

    }
}
