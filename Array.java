import java.util.Scanner; 

class Array {
    public static void main(String args[]) {
        int num[] = {5, 6, 7};
        System.out.println(num[2]);

        Scanner sc = new Scanner(System.in); 

        int num1[] = new int[4];

        System.out.println("Enter 4 numbers:");
        for(int i = 0; i < 4; i++) {
            num1[i] = sc.nextInt();
        }

        System.out.println("You entered:");
        for(int i = 0; i < 4; i++) {
            System.out.println(num1[i]);
        }
    }
}
