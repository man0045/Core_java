public class ExceptionH{
    public static void main(String a[]){

        int i = 0;
        int j = 0;

        try {
            j = 18/i;
        }
        catch(ArithmeticException e){
            System.out.println("Cannot Divides by Zero");
        }
        catch (Exception e) {
            System.out.println("Some thing Went baddly" + e);
        }
        System.out.println(j);
        System.out.println("Bye");
    }
}
