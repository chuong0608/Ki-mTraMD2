import java.util.Scanner;

public class Tinh_tong {
    public static void main(String[] args) {
        int tong = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a size: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int i = 0;
        while (i < arr.length) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
            i++;
        }
//        System.out.println();
//        for (int j = 0; j < arr.length; j++) {
//            if (arr[j] % 2 == 0) {
//                tong += arr[j];
//            }
//        }
//        System.out.println("tổng số chẵn " + tong);
//
        System.out.println("Nhập vào a: ");
        int a = scanner.nextInt();
//        for (int k = 0; k < arr.length; k++) {
//            if (a == arr[k]) {
//                System.out.println("trong mảng có " + arr[k] + " ở vị trí " + k);
//            }
//        }
        int [] b =new int[n-1];
        for (int h=0;h<b.length;h++){
            if(a==b[h]){
                arr[h]=arr[h+1];
                arr[arr.length-1]=0;
                System.out.println(arr[h]);
            }
        }


    }
}
