import java.util.Scanner; 
class Two_Dimensional{
 public static void main(String args[]){
  int nums[][] = new int[3][2];
  Scanner sc = new Scanner(System.in); 
  for(int i =0; i < 3; i++){
   for(int j = 0; j < 2; j++){
    nums[i][j] = sc.nextInt();
   }
  }
  for(int i =0; i < 3; i++){
   for(int j = 0; j < 2; j++){
    System.out.println(nums[i][j]);
   }
   System.out.println("\n");
  }
 }
}