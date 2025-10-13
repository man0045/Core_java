public class Check {
    String str;
    int Price;
    public String show(){
        return "The String of a clonning part is "  + str + "and Price is this" + Price ;
    }
}
class class_Object{
    public static void main(String args[]){
        Check obj = new Check();
        obj.str = "AMAN";
        obj.Price = 234;
        String Result = obj.show();
        System.out.println(Result);
    }

}
 