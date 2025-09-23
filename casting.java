class Casting{
 public static void main(String a[]){
  int kk = 123;
  byte x = 54;
  // type casting 
  String str = String.valueOf(kk);
  System.out.println(str);
  System.out.println(x);
  // 
  int res = (int)x;
  System.out.println(res);
  // to convert Int into Parse Int
  String stri = "124";
  int num = Integer.parseInt(stri);
  System.out.println(num);
  // Using valueof
  int newNum = Integer.valueOf(stri);
  System.out.println(newNum);
 // we have two ways two convert the string into char by using charAt and .toCharArray()
 // 1-> Using char At;
  char ch = str.charAt(0); //At any index if we want to convert into further in a indexes we should do just by writting inside function str.charAt()

  System.out.println(ch);
  char[] chars = str.toCharArray();
  // 2-> Using .toCharArray
  System.out.println(chars);
  // -> converting int to char
  char chrr = (char)x;
  System.out.println(chrr);
  char chs = 'A';
  int nnn = (int) chs;
  System.out.println(nnn);
 }
}