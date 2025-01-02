package dsa.java.arrays;

public class lesson02 {
    public static void main(String[] args) {
//        int[][] nums = {
//                {1, 2, 3},
//                {4, 5},
//                {6, 7, 8, 9}};
//                System.out.println(Arrays.toString(nums[2]));

//        int[][] nums1 = {
//                {1, 2, 3},
//                {4},
//                {7, 9}
//        };
//        System.out.println(nums1[1][1]);

//        Scanner scanner = new Scanner(System.in);
//        int[][] nums2 = new int[3][2];
//        for (int i = 0; i < nums2.length; i++) {
//            for (int j = 0; j < nums2[i].length; j++) {
//                nums2[i][j] = scanner.nextInt(); // İstifadəçidən element daxil edilir
//                System.out.print(Arrays.toString(new int[]{nums2[i][j]})); // Daxil edilən element çap olunur
//            }
//            System.out.println();
//        }
        int[][] arr = {
                {1, 2},
                {4, 5, 6},
                {7, 9}};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }


    }

}




