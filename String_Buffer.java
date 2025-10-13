class Buffer{
 public static void main(String a[]){
  StringBuffer Sb = new StringBuffer("Hello");
  Sb.append(" Hello");
  Sb.insert(5, " Java");
  Sb.replace(0, 5, "Hi");
  Sb.delete(2, 6);
  Sb.reverse();
  System.out.println(Sb);

 }
}