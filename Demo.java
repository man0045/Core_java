enum Status{
    failed, Running, Pending, Success;
}
public class Demo{
    public static void main(String a[]){
        Status s= Status.Running;
        System.out.println(s);

    }
}