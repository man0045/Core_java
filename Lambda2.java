@FunctionalInterface
interface A
{
    int add(int i, int j);

}
public class Lambda2 {
    public static void main(String a[]){
        A obj = new A(){
            public int add(int i, int j){
                return i+j;
            }
        };
        int result = obj.add(5, 6);
        System.out.println(result);


        A obj2 = (int i, int j)->{
            return i+j;
        };
        int pro = obj2.add(3, 7);
        System.out.println(pro);


        A obj3 = (i, j)->i+j;
        int res = obj3.add(6, 7);
        System.out.println(res);
    }
}
