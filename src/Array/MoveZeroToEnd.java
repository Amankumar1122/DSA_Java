package Array;

import java.util.Scanner;

public class MoveZeroToEnd {

        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            System.out.println("Enter the number of elements in the array");
            int n = input.nextInt();

            int[] nums = new int[n];
            System.out.println("Enter the elements in the array");
            for (int i = 0; i < n; i++) {
                nums[i] = input.nextInt();
            }

            int j = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != 0) {
                    nums[j] = nums[i];
                    j++;
                }

            }
            for (int i = j; i < nums.length; i++) {
                nums[i] = 0;
            }
            for (int i : nums) {
                System.out.print(" " + i);
            }
        }
}
