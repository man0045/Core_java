import java.util.Arrays;

class Jagged {
    public static void main(String args[]) {
        int jagged[][] = new int[4][];
        jagged[0] = new int[3];
        jagged[1] = new int[4];
        jagged[2] = new int[2];
        jagged[3] = new int[3];

        jagged[0][0] = 1;
        jagged[0][1] = 2;
        jagged[0][2] = 3;

        jagged[1][0] = 3;
        jagged[1][1] = 4;
        jagged[1][2] = 6;
        jagged[1][3] = 5;

        jagged[2][0] = 12;
        jagged[2][1] = 21;

        jagged[3][0] = 21;
        jagged[3][1] = 21;
        jagged[3][2] = 21;

        // Print jagged array
        for (int row[] : jagged) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();  // new line after each row
        }
    }
}
