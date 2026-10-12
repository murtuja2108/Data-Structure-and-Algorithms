package ArrayMultiD;

public class BasicDeclarationIn2DArray {
    public static void main(String[] args) {
        int[][] arr=new int[3][3];
        /*
        10 20 30
        40 50 60
        70 80 90
         */
        System.out.println(arr[0][2]);
        arr[0][0]=10;
        arr[0][1]=20;
        arr[0][2]=30;

        arr[1][0]=40;
        arr[1][1]=50;
        arr[1][2]=60;

        arr[2][0]=70;
        arr[2][1]=80;
        arr[2][2]=90;
        for (int[] ints : arr) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
    }
}
